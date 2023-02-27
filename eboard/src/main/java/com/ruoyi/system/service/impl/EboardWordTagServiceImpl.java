package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardWordTagMapper;
import com.ruoyi.system.domain.EboardWordTag;
import com.ruoyi.system.service.IEboardWordTagService;

/**
 * 单词标签Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardWordTagServiceImpl implements IEboardWordTagService 
{
    @Autowired
    private EboardWordTagMapper eboardWordTagMapper;

    /**
     * 查询单词标签
     * 
     * @param wordTagId 单词标签主键
     * @return 单词标签
     */
    @Override
    public EboardWordTag selectEboardWordTagByWordTagId(Long wordTagId)
    {
        return eboardWordTagMapper.selectEboardWordTagByWordTagId(wordTagId);
    }

    /**
     * 查询单词标签列表
     * 
     * @param eboardWordTag 单词标签
     * @return 单词标签
     */
    @Override
    public List<EboardWordTag> selectEboardWordTagList(EboardWordTag eboardWordTag)
    {
        return eboardWordTagMapper.selectEboardWordTagList(eboardWordTag);
    }

    /**
     * 新增单词标签
     * 
     * @param eboardWordTag 单词标签
     * @return 结果
     */
    @Override
    public int insertEboardWordTag(EboardWordTag eboardWordTag)
    {
        return eboardWordTagMapper.insertEboardWordTag(eboardWordTag);
    }

    /**
     * 修改单词标签
     * 
     * @param eboardWordTag 单词标签
     * @return 结果
     */
    @Override
    public int updateEboardWordTag(EboardWordTag eboardWordTag)
    {
        return eboardWordTagMapper.updateEboardWordTag(eboardWordTag);
    }

    /**
     * 批量删除单词标签
     * 
     * @param wordTagIds 需要删除的单词标签主键
     * @return 结果
     */
    @Override
    public int deleteEboardWordTagByWordTagIds(Long[] wordTagIds)
    {
        return eboardWordTagMapper.deleteEboardWordTagByWordTagIds(wordTagIds);
    }

    /**
     * 删除单词标签信息
     * 
     * @param wordTagId 单词标签主键
     * @return 结果
     */
    @Override
    public int deleteEboardWordTagByWordTagId(Long wordTagId)
    {
        return eboardWordTagMapper.deleteEboardWordTagByWordTagId(wordTagId);
    }
}
