package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EboardStory;

/**
 * 故事Service接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface IEboardStoryService 
{
    /**
     * 查询故事
     * 
     * @param storyId 故事主键
     * @return 故事
     */
    public EboardStory selectEboardStoryByStoryId(Long storyId);

    /**
     * 查询故事列表
     * 
     * @param eboardStory 故事
     * @return 故事集合
     */
    public List<EboardStory> selectEboardStoryList(EboardStory eboardStory);

    /**
     * 新增故事
     * 
     * @param eboardStory 故事
     * @return 结果
     */
    public int insertEboardStory(EboardStory eboardStory);

    /**
     * 修改故事
     * 
     * @param eboardStory 故事
     * @return 结果
     */
    public int updateEboardStory(EboardStory eboardStory);

    /**
     * 批量删除故事
     * 
     * @param storyIds 需要删除的故事主键集合
     * @return 结果
     */
    public int deleteEboardStoryByStoryIds(Long[] storyIds);

    /**
     * 删除故事信息
     * 
     * @param storyId 故事主键
     * @return 结果
     */
    public int deleteEboardStoryByStoryId(Long storyId);
}
