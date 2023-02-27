package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardStoryTestRelationMapper;
import com.ruoyi.system.domain.EboardStoryTestRelation;
import com.ruoyi.system.service.IEboardStoryTestRelationService;

/**
 * 故事-测试 关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardStoryTestRelationServiceImpl implements IEboardStoryTestRelationService 
{
    @Autowired
    private EboardStoryTestRelationMapper eboardStoryTestRelationMapper;

    /**
     * 查询故事-测试 关联
     * 
     * @param id 故事-测试 关联主键
     * @return 故事-测试 关联
     */
    @Override
    public EboardStoryTestRelation selectEboardStoryTestRelationById(Long id)
    {
        return eboardStoryTestRelationMapper.selectEboardStoryTestRelationById(id);
    }

    /**
     * 查询故事-测试 关联列表
     * 
     * @param eboardStoryTestRelation 故事-测试 关联
     * @return 故事-测试 关联
     */
    @Override
    public List<EboardStoryTestRelation> selectEboardStoryTestRelationList(EboardStoryTestRelation eboardStoryTestRelation)
    {
        return eboardStoryTestRelationMapper.selectEboardStoryTestRelationList(eboardStoryTestRelation);
    }

    /**
     * 新增故事-测试 关联
     * 
     * @param eboardStoryTestRelation 故事-测试 关联
     * @return 结果
     */
    @Override
    public int insertEboardStoryTestRelation(EboardStoryTestRelation eboardStoryTestRelation)
    {
        return eboardStoryTestRelationMapper.insertEboardStoryTestRelation(eboardStoryTestRelation);
    }

    /**
     * 修改故事-测试 关联
     * 
     * @param eboardStoryTestRelation 故事-测试 关联
     * @return 结果
     */
    @Override
    public int updateEboardStoryTestRelation(EboardStoryTestRelation eboardStoryTestRelation)
    {
        return eboardStoryTestRelationMapper.updateEboardStoryTestRelation(eboardStoryTestRelation);
    }

    /**
     * 批量删除故事-测试 关联
     * 
     * @param ids 需要删除的故事-测试 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardStoryTestRelationByIds(Long[] ids)
    {
        return eboardStoryTestRelationMapper.deleteEboardStoryTestRelationByIds(ids);
    }

    /**
     * 删除故事-测试 关联信息
     * 
     * @param id 故事-测试 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardStoryTestRelationById(Long id)
    {
        return eboardStoryTestRelationMapper.deleteEboardStoryTestRelationById(id);
    }
}
