package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardCardWordRelation;

/**
 * 卡片-单词 关联Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardCardWordRelationMapper 
{
    /**
     * 查询卡片-单词 关联
     * 
     * @param id 卡片-单词 关联主键
     * @return 卡片-单词 关联
     */
    public EboardCardWordRelation selectEboardCardWordRelationById(Long id);

    /**
     * 查询卡片-单词 关联列表
     * 
     * @param eboardCardWordRelation 卡片-单词 关联
     * @return 卡片-单词 关联集合
     */
    public List<EboardCardWordRelation> selectEboardCardWordRelationList(EboardCardWordRelation eboardCardWordRelation);

    /**
     * 新增卡片-单词 关联
     * 
     * @param eboardCardWordRelation 卡片-单词 关联
     * @return 结果
     */
    public int insertEboardCardWordRelation(EboardCardWordRelation eboardCardWordRelation);

    /**
     * 修改卡片-单词 关联
     * 
     * @param eboardCardWordRelation 卡片-单词 关联
     * @return 结果
     */
    public int updateEboardCardWordRelation(EboardCardWordRelation eboardCardWordRelation);

    /**
     * 删除卡片-单词 关联
     * 
     * @param id 卡片-单词 关联主键
     * @return 结果
     */
    public int deleteEboardCardWordRelationById(Long id);

    /**
     * 批量删除卡片-单词 关联
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardCardWordRelationByIds(Long[] ids);
}
