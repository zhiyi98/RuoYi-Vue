package com.ruoyi.system.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.EboardCardDetail;
import com.ruoyi.system.service.IEboardCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 探索页
 */
@RestController
@RequestMapping("/eboard/explore")
public class EboardExploreController extends BaseController {

    @Autowired
    private IEboardCardService eboardCardService;

    /**
     * [dev] 查询卡片列表
     * @used
     */
    @PreAuthorize("@ss.hasPermi('eboard:explore:list')")
    @GetMapping("/list")
    public TableDataInfo list()
    {
        startPage();
        List<EboardCardDetail> list = eboardCardService.queryEboardCardDetailList();
        return getDataTable(list);
    }


}
