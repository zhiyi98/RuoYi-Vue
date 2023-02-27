package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardWordTagRelation;

/**
 * 单词-标签 关联Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardWordTagRelationMapper 
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
     * 删除单词-标签 关联
     * 
     * @param id 单词-标签 关联主键
     * @return 结果
     */
    public int deleteEboardWordTagRelationById(Long id);

    /**
     * 批量删除单词-标签 关联
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardWordTagRelationByIds(Long[] ids);
}
