package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardCardStoryRelation;

/**
 * 卡片-故事 关联Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardCardStoryRelationMapper 
{
    /**
     * 查询卡片-故事 关联
     * 
     * @param id 卡片-故事 关联主键
     * @return 卡片-故事 关联
     */
    public EboardCardStoryRelation selectEboardCardStoryRelationById(Long id);

    /**
     * 查询卡片-故事 关联列表
     * 
     * @param eboardCardStoryRelation 卡片-故事 关联
     * @return 卡片-故事 关联集合
     */
    public List<EboardCardStoryRelation> selectEboardCardStoryRelationList(EboardCardStoryRelation eboardCardStoryRelation);

    /**
     * 新增卡片-故事 关联
     * 
     * @param eboardCardStoryRelation 卡片-故事 关联
     * @return 结果
     */
    public int insertEboardCardStoryRelation(EboardCardStoryRelation eboardCardStoryRelation);

    /**
     * 修改卡片-故事 关联
     * 
     * @param eboardCardStoryRelation 卡片-故事 关联
     * @return 结果
     */
    public int updateEboardCardStoryRelation(EboardCardStoryRelation eboardCardStoryRelation);

    /**
     * 删除卡片-故事 关联
     * 
     * @param id 卡片-故事 关联主键
     * @return 结果
     */
    public int deleteEboardCardStoryRelationById(Long id);

    /**
     * 批量删除卡片-故事 关联
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardCardStoryRelationByIds(Long[] ids);
}
