package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardStoryTestRelation;

/**
 * 故事-测试 关联Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardStoryTestRelationMapper 
{
    /**
     * 查询故事-测试 关联
     * 
     * @param id 故事-测试 关联主键
     * @return 故事-测试 关联
     */
    public EboardStoryTestRelation selectEboardStoryTestRelationById(Long id);

    /**
     * 查询故事-测试 关联列表
     * 
     * @param eboardStoryTestRelation 故事-测试 关联
     * @return 故事-测试 关联集合
     */
    public List<EboardStoryTestRelation> selectEboardStoryTestRelationList(EboardStoryTestRelation eboardStoryTestRelation);

    /**
     * 新增故事-测试 关联
     * 
     * @param eboardStoryTestRelation 故事-测试 关联
     * @return 结果
     */
    public int insertEboardStoryTestRelation(EboardStoryTestRelation eboardStoryTestRelation);

    /**
     * 修改故事-测试 关联
     * 
     * @param eboardStoryTestRelation 故事-测试 关联
     * @return 结果
     */
    public int updateEboardStoryTestRelation(EboardStoryTestRelation eboardStoryTestRelation);

    /**
     * 删除故事-测试 关联
     * 
     * @param id 故事-测试 关联主键
     * @return 结果
     */
    public int deleteEboardStoryTestRelationById(Long id);

    /**
     * 批量删除故事-测试 关联
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardStoryTestRelationByIds(Long[] ids);
}
