package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardTestMapper;
import com.ruoyi.system.domain.EboardTest;
import com.ruoyi.system.service.IEboardTestService;

/**
 * 测试Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardTestServiceImpl implements IEboardTestService 
{
    @Autowired
    private EboardTestMapper eboardTestMapper;

    /**
     * 查询测试
     * 
     * @param testId 测试主键
     * @return 测试
     */
    @Override
    public EboardTest selectEboardTestByTestId(Long testId)
    {
        return eboardTestMapper.selectEboardTestByTestId(testId);
    }

    /**
     * 查询测试列表
     * 
     * @param eboardTest 测试
     * @return 测试
     */
    @Override
    public List<EboardTest> selectEboardTestList(EboardTest eboardTest)
    {
        return eboardTestMapper.selectEboardTestList(eboardTest);
    }

    /**
     * 新增测试
     * 
     * @param eboardTest 测试
     * @return 结果
     */
    @Override
    public int insertEboardTest(EboardTest eboardTest)
    {
        return eboardTestMapper.insertEboardTest(eboardTest);
    }

    /**
     * 修改测试
     * 
     * @param eboardTest 测试
     * @return 结果
     */
    @Override
    public int updateEboardTest(EboardTest eboardTest)
    {
        return eboardTestMapper.updateEboardTest(eboardTest);
    }

    /**
     * 批量删除测试
     * 
     * @param testIds 需要删除的测试主键
     * @return 结果
     */
    @Override
    public int deleteEboardTestByTestIds(Long[] testIds)
    {
        return eboardTestMapper.deleteEboardTestByTestIds(testIds);
    }

    /**
     * 删除测试信息
     * 
     * @param testId 测试主键
     * @return 结果
     */
    @Override
    public int deleteEboardTestByTestId(Long testId)
    {
        return eboardTestMapper.deleteEboardTestByTestId(testId);
    }

    @Override
    public List<EboardTest> queryByStoryId(Long storyId) {
        return eboardTestMapper.queryByStoryId(storyId);
    }
}
