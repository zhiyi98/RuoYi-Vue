package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardStory;

import javax.validation.constraints.NotNull;

/**
 * 故事Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardStoryMapper 
{
    /**
     * 查询故事
     * 
     * @param storyId 故事主键
     * @return 故事
     */
    public EboardStory selectEboardStoryByStoryId(Long storyId);

    /**
     * 查询故事
     *
     * @param cardId 卡片Id
     * @return 结果
     */
    public List<EboardStory> selectEboardStoryByCardId(@NotNull(message = "卡片Id不可为空") Long cardId);

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
     * 删除故事
     * 
     * @param storyId 故事主键
     * @return 结果
     */
    public int deleteEboardStoryByStoryId(Long storyId);

    /**
     * 批量删除故事
     * 
     * @param storyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardStoryByStoryIds(Long[] storyIds);
}
