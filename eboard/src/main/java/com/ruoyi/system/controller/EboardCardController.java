package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.EboardCard;
import com.ruoyi.system.service.IEboardCardService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卡片Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/eboard/card")
public class EboardCardController extends BaseController
{
    @Autowired
    private IEboardCardService eboardCardService;

    /**
     * 查询卡片列表
     */
    @PreAuthorize("@ss.hasPermi('system:card:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardCard eboardCard)
    {
        startPage();
        List<EboardCard> list = eboardCardService.selectEboardCardList(eboardCard);
        return getDataTable(list);
    }

    /**
     * 导出卡片列表
     */
    @PreAuthorize("@ss.hasPermi('system:card:export')")
    @Log(title = "卡片", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardCard eboardCard)
    {
        List<EboardCard> list = eboardCardService.selectEboardCardList(eboardCard);
        ExcelUtil<EboardCard> util = new ExcelUtil<EboardCard>(EboardCard.class);
        util.exportExcel(response, list, "卡片数据");
    }

    /**
     * 获取卡片详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:card:query')")
    @GetMapping(value = "/{cardId}")
    public AjaxResult getInfo(@PathVariable("cardId") Long cardId)
    {
        return success(eboardCardService.selectEboardCardByCardId(cardId));
    }

    /**
     * 新增卡片
     */
    @PreAuthorize("@ss.hasPermi('system:card:add')")
    @Log(title = "卡片", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardCard eboardCard)
    {
        return toAjax(eboardCardService.insertEboardCard(eboardCard));
    }

    /**
     * 修改卡片
     */
    @PreAuthorize("@ss.hasPermi('system:card:edit')")
    @Log(title = "卡片", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardCard eboardCard)
    {
        return toAjax(eboardCardService.updateEboardCard(eboardCard));
    }

    /**
     * 删除卡片
     */
    @PreAuthorize("@ss.hasPermi('system:card:remove')")
    @Log(title = "卡片", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cardIds}")
    public AjaxResult remove(@PathVariable Long[] cardIds)
    {
        return toAjax(eboardCardService.deleteEboardCardByCardIds(cardIds));
    }
}
