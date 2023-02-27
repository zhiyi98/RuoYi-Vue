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
import com.ruoyi.system.domain.EboardStoryRecords;
import com.ruoyi.system.service.IEboardStoryRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户浏览记录Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/storyRecords")
public class EboardStoryRecordsController extends BaseController
{
    @Autowired
    private IEboardStoryRecordsService eboardStoryRecordsService;

    /**
     * 查询用户浏览记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:storyRecords:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardStoryRecords eboardStoryRecords)
    {
        startPage();
        List<EboardStoryRecords> list = eboardStoryRecordsService.selectEboardStoryRecordsList(eboardStoryRecords);
        return getDataTable(list);
    }

    /**
     * 导出用户浏览记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:storyRecords:export')")
    @Log(title = "用户浏览记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardStoryRecords eboardStoryRecords)
    {
        List<EboardStoryRecords> list = eboardStoryRecordsService.selectEboardStoryRecordsList(eboardStoryRecords);
        ExcelUtil<EboardStoryRecords> util = new ExcelUtil<EboardStoryRecords>(EboardStoryRecords.class);
        util.exportExcel(response, list, "用户浏览记录数据");
    }

    /**
     * 获取用户浏览记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:storyRecords:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(eboardStoryRecordsService.selectEboardStoryRecordsById(id));
    }

    /**
     * 新增用户浏览记录
     */
    @PreAuthorize("@ss.hasPermi('system:storyRecords:add')")
    @Log(title = "用户浏览记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardStoryRecords eboardStoryRecords)
    {
        return toAjax(eboardStoryRecordsService.insertEboardStoryRecords(eboardStoryRecords));
    }

    /**
     * 修改用户浏览记录
     */
    @PreAuthorize("@ss.hasPermi('system:storyRecords:edit')")
    @Log(title = "用户浏览记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardStoryRecords eboardStoryRecords)
    {
        return toAjax(eboardStoryRecordsService.updateEboardStoryRecords(eboardStoryRecords));
    }

    /**
     * 删除用户浏览记录
     */
    @PreAuthorize("@ss.hasPermi('system:storyRecords:remove')")
    @Log(title = "用户浏览记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(eboardStoryRecordsService.deleteEboardStoryRecordsByIds(ids));
    }
}
