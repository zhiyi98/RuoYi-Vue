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
import com.ruoyi.system.domain.EboardTest;
import com.ruoyi.system.service.IEboardTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试Controller
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@RestController
@RequestMapping("/eboard/test")
public class EboardTestController extends BaseController
{
    @Autowired
    private IEboardTestService eboardTestService;

    /**
     * 查询测试列表
     */
    @PreAuthorize("@ss.hasPermi('eboard:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(EboardTest eboardTest)
    {
        startPage();
        List<EboardTest> list = eboardTestService.selectEboardTestList(eboardTest);
        return getDataTable(list);
    }

    /**
     * 导出测试列表
     */
    @PreAuthorize("@ss.hasPermi('eboard:test:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EboardTest eboardTest)
    {
        List<EboardTest> list = eboardTestService.selectEboardTestList(eboardTest);
        ExcelUtil<EboardTest> util = new ExcelUtil<EboardTest>(EboardTest.class);
        util.exportExcel(response, list, "测试数据");
    }


    /**
     * 新增测试
     */
    @PreAuthorize("@ss.hasPermi('eboard:test:add')")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EboardTest eboardTest)
    {
        return toAjax(eboardTestService.insertEboardTest(eboardTest));
    }

    /**
     * 修改测试
     */
    @PreAuthorize("@ss.hasPermi('eboard:test:edit')")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EboardTest eboardTest)
    {
        return toAjax(eboardTestService.updateEboardTest(eboardTest));
    }

    /**
     * 删除测试
     */
    @PreAuthorize("@ss.hasPermi('eboard:test:remove')")
    @Log(title = "测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{testIds}")
    public AjaxResult remove(@PathVariable Long[] testIds)
    {
        return toAjax(eboardTestService.deleteEboardTestByTestIds(testIds));
    }



    /**
     * [dev] 获取测试详细信息
     * @used
     */
    @PreAuthorize("@ss.hasPermi('eboard:test:query')")
    @GetMapping(value = "/{storyId}")
    public AjaxResult queryByStoryId(@PathVariable("storyId") Long storyId)
    {
        return success(eboardTestService.queryByStoryId(storyId));
    }


}
