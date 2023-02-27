package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardCardStoryRelationMapper;
import com.ruoyi.system.domain.EboardCardStoryRelation;
import com.ruoyi.system.service.IEboardCardStoryRelationService;

/**
 * 卡片-故事 关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardCardStoryRelationServiceImpl implements IEboardCardStoryRelationService 
{
    @Autowired
    private EboardCardStoryRelationMapper eboardCardStoryRelationMapper;

    /**
     * 查询卡片-故事 关联
     * 
     * @param id 卡片-故事 关联主键
     * @return 卡片-故事 关联
     */
    @Override
    public EboardCardStoryRelation selectEboardCardStoryRelationById(Long id)
    {
        return eboardCardStoryRelationMapper.selectEboardCardStoryRelationById(id);
    }

    /**
     * 查询卡片-故事 关联列表
     * 
     * @param eboardCardStoryRelation 卡片-故事 关联
     * @return 卡片-故事 关联
     */
    @Override
    public List<EboardCardStoryRelation> selectEboardCardStoryRelationList(EboardCardStoryRelation eboardCardStoryRelation)
    {
        return eboardCardStoryRelationMapper.selectEboardCardStoryRelationList(eboardCardStoryRelation);
    }

    /**
     * 新增卡片-故事 关联
     * 
     * @param eboardCardStoryRelation 卡片-故事 关联
     * @return 结果
     */
    @Override
    public int insertEboardCardStoryRelation(EboardCardStoryRelation eboardCardStoryRelation)
    {
        return eboardCardStoryRelationMapper.insertEboardCardStoryRelation(eboardCardStoryRelation);
    }

    /**
     * 修改卡片-故事 关联
     * 
     * @param eboardCardStoryRelation 卡片-故事 关联
     * @return 结果
     */
    @Override
    public int updateEboardCardStoryRelation(EboardCardStoryRelation eboardCardStoryRelation)
    {
        return eboardCardStoryRelationMapper.updateEboardCardStoryRelation(eboardCardStoryRelation);
    }

    /**
     * 批量删除卡片-故事 关联
     * 
     * @param ids 需要删除的卡片-故事 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardCardStoryRelationByIds(Long[] ids)
    {
        return eboardCardStoryRelationMapper.deleteEboardCardStoryRelationByIds(ids);
    }

    /**
     * 删除卡片-故事 关联信息
     * 
     * @param id 卡片-故事 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardCardStoryRelationById(Long id)
    {
        return eboardCardStoryRelationMapper.deleteEboardCardStoryRelationById(id);
    }
}
