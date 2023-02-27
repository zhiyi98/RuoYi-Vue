package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardStoryRecordsMapper;
import com.ruoyi.system.domain.EboardStoryRecords;
import com.ruoyi.system.service.IEboardStoryRecordsService;

/**
 * 用户浏览记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardStoryRecordsServiceImpl implements IEboardStoryRecordsService 
{
    @Autowired
    private EboardStoryRecordsMapper eboardStoryRecordsMapper;

    /**
     * 查询用户浏览记录
     * 
     * @param id 用户浏览记录主键
     * @return 用户浏览记录
     */
    @Override
    public EboardStoryRecords selectEboardStoryRecordsById(Long id)
    {
        return eboardStoryRecordsMapper.selectEboardStoryRecordsById(id);
    }

    /**
     * 查询用户浏览记录列表
     * 
     * @param eboardStoryRecords 用户浏览记录
     * @return 用户浏览记录
     */
    @Override
    public List<EboardStoryRecords> selectEboardStoryRecordsList(EboardStoryRecords eboardStoryRecords)
    {
        return eboardStoryRecordsMapper.selectEboardStoryRecordsList(eboardStoryRecords);
    }

    /**
     * 新增用户浏览记录
     * 
     * @param eboardStoryRecords 用户浏览记录
     * @return 结果
     */
    @Override
    public int insertEboardStoryRecords(EboardStoryRecords eboardStoryRecords)
    {
        eboardStoryRecords.setCreateTime(DateUtils.getNowDate());
        return eboardStoryRecordsMapper.insertEboardStoryRecords(eboardStoryRecords);
    }

    /**
     * 修改用户浏览记录
     * 
     * @param eboardStoryRecords 用户浏览记录
     * @return 结果
     */
    @Override
    public int updateEboardStoryRecords(EboardStoryRecords eboardStoryRecords)
    {
        return eboardStoryRecordsMapper.updateEboardStoryRecords(eboardStoryRecords);
    }

    /**
     * 批量删除用户浏览记录
     * 
     * @param ids 需要删除的用户浏览记录主键
     * @return 结果
     */
    @Override
    public int deleteEboardStoryRecordsByIds(Long[] ids)
    {
        return eboardStoryRecordsMapper.deleteEboardStoryRecordsByIds(ids);
    }

    /**
     * 删除用户浏览记录信息
     * 
     * @param id 用户浏览记录主键
     * @return 结果
     */
    @Override
    public int deleteEboardStoryRecordsById(Long id)
    {
        return eboardStoryRecordsMapper.deleteEboardStoryRecordsById(id);
    }
}
