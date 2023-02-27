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
import com.ruoyi.system.domain.EboardWordTagRelation;
import com.ruoyi.system.service.IEboardWordTagRelationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 单词-标签 关联Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/wordTagRelation")
public class EboardWordTagRelationController extends BaseController
{
    @Autowired
    private IEboardWordTagRelationService eboardWordTagRelationService;

    /**
     * 查询单词-标签 关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:wordTagRelation:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardWordTagRelation eboardWordTagRelation)
    {
        startPage();
        List<EboardWordTagRelation> list = eboardWordTagRelationService.selectEboardWordTagRelationList(eboardWordTagRelation);
        return getDataTable(list);
    }

    /**
     * 导出单词-标签 关联列表
     */
    @PreAuthorize("@ss.hasPermi('system:wordTagRelation:export')")
    @Log(title = "单词-标签 关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardWordTagRelation eboardWordTagRelation)
    {
        List<EboardWordTagRelation> list = eboardWordTagRelationService.selectEboardWordTagRelationList(eboardWordTagRelation);
        ExcelUtil<EboardWordTagRelation> util = new ExcelUtil<EboardWordTagRelation>(EboardWordTagRelation.class);
        util.exportExcel(response, list, "单词-标签 关联数据");
    }

    /**
     * 获取单词-标签 关联详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wordTagRelation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(eboardWordTagRelationService.selectEboardWordTagRelationById(id));
    }

    /**
     * 新增单词-标签 关联
     */
    @PreAuthorize("@ss.hasPermi('system:wordTagRelation:add')")
    @Log(title = "单词-标签 关联", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardWordTagRelation eboardWordTagRelation)
    {
        return toAjax(eboardWordTagRelationService.insertEboardWordTagRelation(eboardWordTagRelation));
    }

    /**
     * 修改单词-标签 关联
     */
    @PreAuthorize("@ss.hasPermi('system:wordTagRelation:edit')")
    @Log(title = "单词-标签 关联", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardWordTagRelation eboardWordTagRelation)
    {
        return toAjax(eboardWordTagRelationService.updateEboardWordTagRelation(eboardWordTagRelation));
    }

    /**
     * 删除单词-标签 关联
     */
    @PreAuthorize("@ss.hasPermi('system:wordTagRelation:remove')")
    @Log(title = "单词-标签 关联", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(eboardWordTagRelationService.deleteEboardWordTagRelationByIds(ids));
    }
}
