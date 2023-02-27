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
import com.ruoyi.system.domain.EboardCardStoryRelation;
import com.ruoyi.system.service.IEboardCardStoryRelationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卡片-故事 关联Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/cardStoryRelation")
public class EboardCardStoryRelationController extends BaseController
{
    @Autowired
    private IEboardCardStoryRelationService eboardCardStoryRelationService;

    /**
     * 查询卡片-故事 关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:cardStoryRelation:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardCardStoryRelation eboardCardStoryRelation)
    {
        startPage();
        List<EboardCardStoryRelation> list = eboardCardStoryRelationService.selectEboardCardStoryRelationList(eboardCardStoryRelation);
        return getDataTable(list);
    }

    /**
     * 导出卡片-故事 关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:cardStoryRelation:export')")
    @Log(title = "卡片-故事 关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardCardStoryRelation eboardCardStoryRelation)
    {
        List<EboardCardStoryRelation> list = eboardCardStoryRelationService.selectEboardCardStoryRelationList(eboardCardStoryRelation);
        ExcelUtil<EboardCardStoryRelation> util = new ExcelUtil<EboardCardStoryRelation>(EboardCardStoryRelation.class);
        util.exportExcel(response, list, "卡片-故事 关联数据");
    }

    /**
     * 获取卡片-故事 关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cardStoryRelation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(eboardCardStoryRelationService.selectEboardCardStoryRelationById(id));
    }

    /**
     * 新增卡片-故事 关联
     */
    @PreAuthorize("@ss.hasPermi('system:cardStoryRelation:add')")
    @Log(title = "卡片-故事 关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardCardStoryRelation eboardCardStoryRelation)
    {
        return toAjax(eboardCardStoryRelationService.insertEboardCardStoryRelation(eboardCardStoryRelation));
    }

    /**
     * 修改卡片-故事 关联
     */
    @PreAuthorize("@ss.hasPermi('system:cardStoryRelation:edit')")
    @Log(title = "卡片-故事 关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardCardStoryRelation eboardCardStoryRelation)
    {
        return toAjax(eboardCardStoryRelationService.updateEboardCardStoryRelation(eboardCardStoryRelation));
    }

    /**
     * 删除卡片-故事 关联
     */
    @PreAuthorize("@ss.hasPermi('system:cardStoryRelation:remove')")
    @Log(title = "卡片-故事 关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(eboardCardStoryRelationService.deleteEboardCardStoryRelationByIds(ids));
    }
}
