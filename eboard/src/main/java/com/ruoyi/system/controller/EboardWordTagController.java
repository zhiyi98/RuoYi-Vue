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
import com.ruoyi.system.domain.EboardWordTag;
import com.ruoyi.system.service.IEboardWordTagService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 单词标签Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/wordTag")
public class EboardWordTagController extends BaseController
{
    @Autowired
    private IEboardWordTagService eboardWordTagService;

    /**
     * 查询单词标签列表
     */
    @PreAuthorize("@ss.hasPermi('system:wordTag:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardWordTag eboardWordTag)
    {
        startPage();
        List<EboardWordTag> list = eboardWordTagService.selectEboardWordTagList(eboardWordTag);
        return getDataTable(list);
    }

    /**
     * 导出单词标签列表
     */
    @PreAuthorize("@ss.hasPermi('system:wordTag:export')")
    @Log(title = "单词标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardWordTag eboardWordTag)
    {
        List<EboardWordTag> list = eboardWordTagService.selectEboardWordTagList(eboardWordTag);
        ExcelUtil<EboardWordTag> util = new ExcelUtil<EboardWordTag>(EboardWordTag.class);
        util.exportExcel(response, list, "单词标签数据");
    }

    /**
     * 获取单词标签详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wordTag:query')")
    @GetMapping(value = "/{wordTagId}")
    public AjaxResult getInfo(@PathVariable("wordTagId") Long wordTagId)
    {
        return success(eboardWordTagService.selectEboardWordTagByWordTagId(wordTagId));
    }

    /**
     * 新增单词标签
     */
    @PreAuthorize("@ss.hasPermi('system:wordTag:add')")
    @Log(title = "单词标签", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardWordTag eboardWordTag)
    {
        return toAjax(eboardWordTagService.insertEboardWordTag(eboardWordTag));
    }

    /**
     * 修改单词标签
     */
    @PreAuthorize("@ss.hasPermi('system:wordTag:edit')")
    @Log(title = "单词标签", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardWordTag eboardWordTag)
    {
        return toAjax(eboardWordTagService.updateEboardWordTag(eboardWordTag));
    }

    /**
     * 删除单词标签
     */
    @PreAuthorize("@ss.hasPermi('system:wordTag:remove')")
    @Log(title = "单词标签", businessType = BusinessType.DELETE)
	@DeleteMapping("/{wordTagIds}")
    public AjaxResult remove(@PathVariable Long[] wordTagIds)
    {
        return toAjax(eboardWordTagService.deleteEboardWordTagByWordTagIds(wordTagIds));
    }
}
