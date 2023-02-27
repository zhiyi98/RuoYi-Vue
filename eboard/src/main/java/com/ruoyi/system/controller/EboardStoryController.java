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
import com.ruoyi.system.domain.EboardStory;
import com.ruoyi.system.service.IEboardStoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 故事Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/eboard/story")
public class EboardStoryController extends BaseController
{
    @Autowired
    private IEboardStoryService eboardStoryService;

    /**
     * 查询故事列表
     */
    @PreAuthorize("@ss.hasPermi('eboard:story:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardStory eboardStory)
    {
        startPage();
        List<EboardStory> list = eboardStoryService.selectEboardStoryList(eboardStory);
        return getDataTable(list);
    }

    /**
     * 导出故事列表
     */
    @PreAuthorize("@ss.hasPermi('eboard:story:export')")
    @Log(title = "故事", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardStory eboardStory)
    {
        List<EboardStory> list = eboardStoryService.selectEboardStoryList(eboardStory);
        ExcelUtil<EboardStory> util = new ExcelUtil<EboardStory>(EboardStory.class);
        util.exportExcel(response, list, "故事数据");
    }

    /**
     * [dev] 获取故事详细信息
     * @used
     */
    @PreAuthorize("@ss.hasPermi('eboard:story:query')")
    @GetMapping(value = "/{storyId}")
    public AjaxResult getInfo(@PathVariable("storyId") Long storyId)
    {
        return success(eboardStoryService.selectEboardStoryByStoryId(storyId));
    }

    /**
     * 新增故事
     */
    @PreAuthorize("@ss.hasPermi('eboard:story:add')")
    @Log(title = "故事", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardStory eboardStory)
    {
        return toAjax(eboardStoryService.insertEboardStory(eboardStory));
    }

    /**
     * 修改故事
     */
    @PreAuthorize("@ss.hasPermi('eboard:story:edit')")
    @Log(title = "故事", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardStory eboardStory)
    {
        return toAjax(eboardStoryService.updateEboardStory(eboardStory));
    }

    /**
     * 删除故事
     */
    @PreAuthorize("@ss.hasPermi('eboard:story:remove')")
    @Log(title = "故事", businessType = BusinessType.DELETE)
	@DeleteMapping("/{storyIds}")
    public AjaxResult remove(@PathVariable Long[] storyIds)
    {
        return toAjax(eboardStoryService.deleteEboardStoryByStoryIds(storyIds));
    }
}
