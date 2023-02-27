package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardWordTagRelationMapper;
import com.ruoyi.system.domain.EboardWordTagRelation;
import com.ruoyi.system.service.IEboardWordTagRelationService;

/**
 * 单词-标签 关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardWordTagRelationServiceImpl implements IEboardWordTagRelationService 
{
    @Autowired
    private EboardWordTagRelationMapper eboardWordTagRelationMapper;

    /**
     * 查询单词-标签 关联
     * 
     * @param id 单词-标签 关联主键
     * @return 单词-标签 关联
     */
    @Override
    public EboardWordTagRelation selectEboardWordTagRelationById(Long id)
    {
        return eboardWordTagRelationMapper.selectEboardWordTagRelationById(id);
    }

    /**
     * 查询单词-标签 关联列表
     * 
     * @param eboardWordTagRelation 单词-标签 关联
     * @return 单词-标签 关联
     */
    @Override
    public List<EboardWordTagRelation> selectEboardWordTagRelationList(EboardWordTagRelation eboardWordTagRelation)
    {
        return eboardWordTagRelationMapper.selectEboardWordTagRelationList(eboardWordTagRelation);
    }

    /**
     * 新增单词-标签 关联
     * 
     * @param eboardWordTagRelation 单词-标签 关联
     * @return 结果
     */
    @Override
    public int insertEboardWordTagRelation(EboardWordTagRelation eboardWordTagRelation)
    {
        return eboardWordTagRelationMapper.insertEboardWordTagRelation(eboardWordTagRelation);
    }

    /**
     * 修改单词-标签 关联
     * 
     * @param eboardWordTagRelation 单词-标签 关联
     * @return 结果
     */
    @Override
    public int updateEboardWordTagRelation(EboardWordTagRelation eboardWordTagRelation)
    {
        return eboardWordTagRelationMapper.updateEboardWordTagRelation(eboardWordTagRelation);
    }

    /**
     * 批量删除单词-标签 关联
     * 
     * @param ids 需要删除的单词-标签 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardWordTagRelationByIds(Long[] ids)
    {
        return eboardWordTagRelationMapper.deleteEboardWordTagRelationByIds(ids);
    }

    /**
     * 删除单词-标签 关联信息
     * 
     * @param id 单词-标签 关联主键
     * @return 结果
     */
    @Override
    public int deleteEboardWordTagRelationById(Long id)
    {
        return eboardWordTagRelationMapper.deleteEboardWordTagRelationById(id);
    }
}
