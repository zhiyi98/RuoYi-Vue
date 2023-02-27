package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardStoryMapper;
import com.ruoyi.system.domain.EboardStory;
import com.ruoyi.system.service.IEboardStoryService;

/**
 * 故事Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardStoryServiceImpl implements IEboardStoryService 
{
    @Autowired
    private EboardStoryMapper eboardStoryMapper;

    /**
     * 查询故事
     * 
     * @param storyId 故事主键
     * @return 故事
     */
    @Override
    public EboardStory selectEboardStoryByStoryId(Long storyId)
    {
        return eboardStoryMapper.selectEboardStoryByStoryId(storyId);
    }

    /**
     * 查询故事列表
     * 
     * @param eboardStory 故事
     * @return 故事
     */
    @Override
    public List<EboardStory> selectEboardStoryList(EboardStory eboardStory)
    {
        return eboardStoryMapper.selectEboardStoryList(eboardStory);
    }

    /**
     * 新增故事
     * 
     * @param eboardStory 故事
     * @return 结果
     */
    @Override
    public int insertEboardStory(EboardStory eboardStory)
    {
        return eboardStoryMapper.insertEboardStory(eboardStory);
    }

    /**
     * 修改故事
     * 
     * @param eboardStory 故事
     * @return 结果
     */
    @Override
    public int updateEboardStory(EboardStory eboardStory)
    {
        return eboardStoryMapper.updateEboardStory(eboardStory);
    }

    /**
     * 批量删除故事
     * 
     * @param storyIds 需要删除的故事主键
     * @return 结果
     */
    @Override
    public int deleteEboardStoryByStoryIds(Long[] storyIds)
    {
        return eboardStoryMapper.deleteEboardStoryByStoryIds(storyIds);
    }

    /**
     * 删除故事信息
     * 
     * @param storyId 故事主键
     * @return 结果
     */
    @Override
    public int deleteEboardStoryByStoryId(Long storyId)
    {
        return eboardStoryMapper.deleteEboardStoryByStoryId(storyId);
    }
}
