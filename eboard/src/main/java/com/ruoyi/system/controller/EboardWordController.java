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
import com.ruoyi.system.domain.EboardWord;
import com.ruoyi.system.service.IEboardWordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 单词Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/system/word")
public class EboardWordController extends BaseController
{
    @Autowired
    private IEboardWordService eboardWordService;

    /**
     * 查询单词列表
     */
    @PreAuthorize("@ss.hasPermi('system:word:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardWord eboardWord)
    {
        startPage();
        List<EboardWord> list = eboardWordService.selectEboardWordList(eboardWord);
        return getDataTable(list);
    }

    /**
     * 导出单词列表
     */
    @PreAuthorize("@ss.hasPermi('system:word:export')")
    @Log(title = "单词", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardWord eboardWord)
    {
        List<EboardWord> list = eboardWordService.selectEboardWordList(eboardWord);
        ExcelUtil<EboardWord> util = new ExcelUtil<EboardWord>(EboardWord.class);
        util.exportExcel(response, list, "单词数据");
    }

    /**
     * 获取单词详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:word:query')")
    @GetMapping(value = "/{wordId}")
    public AjaxResult getInfo(@PathVariable("wordId") Long wordId)
    {
        return success(eboardWordService.selectEboardWordByWordId(wordId));
    }

    /**
     * 新增单词
     */
    @PreAuthorize("@ss.hasPermi('system:word:add')")
    @Log(title = "单词", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardWord eboardWord)
    {
        return toAjax(eboardWordService.insertEboardWord(eboardWord));
    }

    /**
     * 修改单词
     */
    @PreAuthorize("@ss.hasPermi('system:word:edit')")
    @Log(title = "单词", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardWord eboardWord)
    {
        return toAjax(eboardWordService.updateEboardWord(eboardWord));
    }

    /**
     * 删除单词
     */
    @PreAuthorize("@ss.hasPermi('system:word:remove')")
    @Log(title = "单词", businessType = BusinessType.DELETE)
	@DeleteMapping("/{wordIds}")
    public AjaxResult remove(@PathVariable Long[] wordIds)
    {
        return toAjax(eboardWordService.deleteEboardWordByWordIds(wordIds));
    }
}
