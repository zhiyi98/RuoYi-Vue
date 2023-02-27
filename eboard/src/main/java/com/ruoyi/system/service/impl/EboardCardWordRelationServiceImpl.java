package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardCardWordRelationMapper;
import com.ruoyi.system.domain.EboardCardWordRelation;
import com.ruoyi.system.service.IEboardCardWordRelationService;

/**
 * 卡片-单词 关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardCardWordRelationServiceImpl implements IEboardCardWordRelationService 
{
    @Autowired
    private EboardCardWordRelationMapper eboardCardWordRelationMapper;

    /**
     * 查询卡片-单词 关联
     * 
     * @param id 卡片-单词 关联主键
     * @return 卡片-单词 关联
     */
    @Override
    public EboardCardWordRelation selectEboardCardWordRelationById(Long id)
    {
        return eboardCardWordRelationMapper.selectEboardCardWordRelationById(id);
    }

    /**
     * 查询卡片-单词 关联列表
     * 
     * @param eboardCardWordRelation 卡片-单词 关联
     * @return 卡片-单词 关联
     */
    @Override
    public List<EboardCardWordRelation> selectEboardCardWordRelationList(EboardCardWordRelation eboardCardWordRelation)
    {
        return eboardCardWordRelationMapper.selectEboardCardWordRelationList(eboardCardWordRelation);
    }

    /**
     * 新增卡片-单词 关联
     * 
     * @param eboardCardWordRelation 卡片-单词 关联
     * @return 结果
     */
    @Override
    public int insertEboardCardWordRelation(EboardCardWordRelation eboardCardWordRelation)
    {
        return eboardCardWordRelationMapper.insertEboardCardWordRelation(eboardCardWordRelation);
    }

    /**
     * 修改卡片-单词 关联
     * 
     * @param eboardCardWordRelation 卡片-单词 关联
     * @return 结果
     */
    @Override
    public int updateEboardCardWordRelation(EboardCardWordRelation eboardCardWordRelation)
    {
        return eboardCardWordRelationMapper.updateEboardCardWordRelation(eboardCardWordRelation);
    }

    /**
     * 批量删除卡片-单词 关联
     * 
     * @param ids 需要删除的卡片-单词 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardCardWordRelationByIds(Long[] ids)
    {
        return eboardCardWordRelationMapper.deleteEboardCardWordRelationByIds(ids);
    }

    /**
     * 删除卡片-单词 关联信息
     * 
     * @param id 卡片-单词 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardCardWordRelationById(Long id)
    {
        return eboardCardWordRelationMapper.deleteEboardCardWordRelationById(id);
    }
}
