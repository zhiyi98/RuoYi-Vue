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
import com.ruoyi.system.domain.EboardCardWordRelation;
import com.ruoyi.system.service.IEboardCardWordRelationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卡片-单词 关联Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/cardWordRelation")
public class EboardCardWordRelationController extends BaseController
{
    @Autowired
    private IEboardCardWordRelationService eboardCardWordRelationService;

    /**
     * 查询卡片-单词 关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:cardWordRelation:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardCardWordRelation eboardCardWordRelation)
    {
        startPage();
        List<EboardCardWordRelation> list = eboardCardWordRelationService.selectEboardCardWordRelationList(eboardCardWordRelation);
        return getDataTable(list);
    }

    /**
     * 导出卡片-单词 关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:cardWordRelation:export')")
    @Log(title = "卡片-单词 关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardCardWordRelation eboardCardWordRelation)
    {
        List<EboardCardWordRelation> list = eboardCardWordRelationService.selectEboardCardWordRelationList(eboardCardWordRelation);
        ExcelUtil<EboardCardWordRelation> util = new ExcelUtil<EboardCardWordRelation>(EboardCardWordRelation.class);
        util.exportExcel(response, list, "卡片-单词 关联数据");
    }

    /**
     * 获取卡片-单词 关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cardWordRelation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(eboardCardWordRelationService.selectEboardCardWordRelationById(id));
    }

    /**
     * 新增卡片-单词 关联
     */
    @PreAuthorize("@ss.hasPermi('system:cardWordRelation:add')")
    @Log(title = "卡片-单词 关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardCardWordRelation eboardCardWordRelation)
    {
        return toAjax(eboardCardWordRelationService.insertEboardCardWordRelation(eboardCardWordRelation));
    }

    /**
     * 修改卡片-单词 关联
     */
    @PreAuthorize("@ss.hasPermi('system:cardWordRelation:edit')")
    @Log(title = "卡片-单词 关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardCardWordRelation eboardCardWordRelation)
    {
        return toAjax(eboardCardWordRelationService.updateEboardCardWordRelation(eboardCardWordRelation));
    }

    /**
     * 删除卡片-单词 关联
     */
    @PreAuthorize("@ss.hasPermi('system:cardWordRelation:remove')")
    @Log(title = "卡片-单词 关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(eboardCardWordRelationService.deleteEboardCardWordRelationByIds(ids));
    }
}
