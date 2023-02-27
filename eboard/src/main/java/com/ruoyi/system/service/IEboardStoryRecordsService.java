package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EboardStoryRecords;

/**
 * 用户浏览记录Service接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface IEboardStoryRecordsService 
{
    /**
     * 查询用户浏览记录
     * 
     * @param id 用户浏览记录主键
     * @return 用户浏览记录
     */
    public EboardStoryRecords selectEboardStoryRecordsById(Long id);

    /**
     * 查询用户浏览记录列表
     * 
     * @param eboardStoryRecords 用户浏览记录
     * @return 用户浏览记录集合
     */
    public List<EboardStoryRecords> selectEboardStoryRecordsList(EboardStoryRecords eboardStoryRecords);

    /**
     * 新增用户浏览记录
     * 
     * @param eboardStoryRecords 用户浏览记录
     * @return 结果
     */
    public int insertEboardStoryRecords(EboardStoryRecords eboardStoryRecords);

    /**
     * 修改用户浏览记录
     * 
     * @param eboardStoryRecords 用户浏览记录
     * @return 结果
     */
    public int updateEboardStoryRecords(EboardStoryRecords eboardStoryRecords);

    /**
     * 批量删除用户浏览记录
     * 
     * @param ids 需要删除的用户浏览记录主键集合
     * @return 结果
     */
    public int deleteEboardStoryRecordsByIds(Long[] ids);

    /**
     * 删除用户浏览记录信息
     * 
     * @param id 用户浏览记录主键
     * @return 结果
     */
    public int deleteEboardStoryRecordsById(Long id);
}
