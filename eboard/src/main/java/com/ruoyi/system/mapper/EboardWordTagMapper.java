package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardWordTag;

/**
 * 单词标签Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardWordTagMapper 
{
    /**
     * 查询单词标签
     * 
     * @param wordTagId 单词标签主键
     * @return 单词标签
     */
    public EboardWordTag selectEboardWordTagByWordTagId(Long wordTagId);

    /**
     * 查询单词标签列表
     * 
     * @param eboardWordTag 单词标签
     * @return 单词标签集合
     */
    public List<EboardWordTag> selectEboardWordTagList(EboardWordTag eboardWordTag);

    /**
     * 新增单词标签
     * 
     * @param eboardWordTag 单词标签
     * @return 结果
     */
    public int insertEboardWordTag(EboardWordTag eboardWordTag);

    /**
     * 修改单词标签
     * 
     * @param eboardWordTag 单词标签
     * @return 结果
     */
    public int updateEboardWordTag(EboardWordTag eboardWordTag);

    /**
     * 删除单词标签
     * 
     * @param wordTagId 单词标签主键
     * @return 结果
     */
    public int deleteEboardWordTagByWordTagId(Long wordTagId);

    /**
     * 批量删除单词标签
     * 
     * @param wordTagIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardWordTagByWordTagIds(Long[] wordTagIds);
}
