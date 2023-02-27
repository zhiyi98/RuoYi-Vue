package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardWordMapper;
import com.ruoyi.system.domain.EboardWord;
import com.ruoyi.system.service.IEboardWordService;

/**
 * 单词Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardWordServiceImpl implements IEboardWordService 
{
    @Autowired
    private EboardWordMapper eboardWordMapper;

    /**
     * 查询单词
     * 
     * @param wordId 单词主键
     * @return 单词
     */
    @Override
    public EboardWord selectEboardWordByWordId(Long wordId)
    {
        return eboardWordMapper.selectEboardWordByWordId(wordId);
    }

    /**
     * 查询单词列表
     * 
     * @param eboardWord 单词
     * @return 单词
     */
    @Override
    public List<EboardWord> selectEboardWordList(EboardWord eboardWord)
    {
        return eboardWordMapper.selectEboardWordList(eboardWord);
    }

    /**
     * 新增单词
     * 
     * @param eboardWord 单词
     * @return 结果
     */
    @Override
    public int insertEboardWord(EboardWord eboardWord)
    {
        return eboardWordMapper.insertEboardWord(eboardWord);
    }

    /**
     * 修改单词
     * 
     * @param eboardWord 单词
     * @return 结果
     */
    @Override
    public int updateEboardWord(EboardWord eboardWord)
    {
        return eboardWordMapper.updateEboardWord(eboardWord);
    }

    /**
     * 批量删除单词
     * 
     * @param wordIds 需要删除的单词主键
     * @return 结果
     */
    @Override
    public int deleteEboardWordByWordIds(Long[] wordIds)
    {
        return eboardWordMapper.deleteEboardWordByWordIds(wordIds);
    }

    /**
     * 删除单词信息
     * 
     * @param wordId 单词主键
     * @return 结果
     */
    @Override
    public int deleteEboardWordByWordId(Long wordId)
    {
        return eboardWordMapper.deleteEboardWordByWordId(wordId);
    }
}
