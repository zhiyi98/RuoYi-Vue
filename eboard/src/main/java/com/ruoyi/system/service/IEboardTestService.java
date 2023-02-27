package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EboardTest;

/**
 * 测试Service接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface IEboardTestService 
{
    /**
     * 查询测试
     * 
     * @param testId 测试主键
     * @return 测试
     */
    public EboardTest selectEboardTestByTestId(Long testId);

    /**
     * 查询测试列表
     * 
     * @param eboardTest 测试
     * @return 测试集合
     */
    public List<EboardTest> selectEboardTestList(EboardTest eboardTest);

    /**
     * 新增测试
     * 
     * @param eboardTest 测试
     * @return 结果
     */
    public int insertEboardTest(EboardTest eboardTest);

    /**
     * 修改测试
     * 
     * @param eboardTest 测试
     * @return 结果
     */
    public int updateEboardTest(EboardTest eboardTest);

    /**
     * 批量删除测试
     * 
     * @param testIds 需要删除的测试主键集合
     * @return 结果
     */
    public int deleteEboardTestByTestIds(Long[] testIds);

    /**
     * 删除测试信息
     * 
     * @param testId 测试主键
     * @return 结果
     */
    public int deleteEboardTestByTestId(Long testId);

    /**
     * 查询测试数据
     * @param storyId 故事Id
     * @return 结果
     */
    public List<EboardTest> queryByStoryId(Long storyId);

}
