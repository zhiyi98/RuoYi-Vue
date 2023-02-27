package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EboardWordTagRelation;

/**
 * 单词-标签 关联Service接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface IEboardWordTagRelationService 
{
    /**
     * 查询单词-标签 关联
     * 
     * @param id 单词-标签 关联主键
     * @return 单词-标签 关联
     */
    public EboardWordTagRelation selectEboardWordTagRelationById(Long id);

    /**
     * 查询单词-标签 关联列表
     * 
     * @param eboardWordTagRelation 单词-标签 关联
     * @return 单词-标签 关联集合
     */
    public List<EboardWordTagRelation> selectEboardWordTagRelationList(EboardWordTagRelation eboardWordTagRelation);

    /**
     * 新增单词-标签 关联
     * 
     * @param eboardWordTagRelation 单词-标签 关联
     * @return 结果
     */
    public int insertEboardWordTagRelation(EboardWordTagRelation eboardWordTagRelation);

    /**
     * 修改单词-标签 关联
     * 
     * @param eboardWordTagRelation 单词-标签 关联
     * @return 结果
     */
    public int updateEboardWordTagRelation(EboardWordTagRelation eboardWordTagRelation);

    /**
     * 批量删除单词-标签 关联
     * 
     * @param ids 需要删除的单词-标签 关联主键集合
     * @return 结果
     */
    public int deleteEboardWordTagRelationByIds(Long[] ids);

    /**
     * 删除单词-标签 关联信息
     * 
     * @param id 单词-标签 关联主键
     * @return 结果
     */
    public int deleteEboardWordTagRelationById(Long id);
}
