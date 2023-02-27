package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardWord;

import javax.validation.constraints.NotNull;

/**
 * 单词Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardWordMapper 
{
    /**
     * 查询单词
     * 
     * @param wordId 单词主键
     * @return 单词
     */
    public EboardWord selectEboardWordByWordId(Long wordId);

    /**
     * 查询单词
     * @param cardId 卡片Id
     * @return 结果
     */
    public List<EboardWord> selectEboardWordByCardId(@NotNull(message = "卡片Id不可为空") Long cardId);

    /**
     * 查询单词列表
     * 
     * @param eboardWord 单词
     * @return 单词集合
     */
    public List<EboardWord> selectEboardWordList(EboardWord eboardWord);

    /**
     * 新增单词
     * 
     * @param eboardWord 单词
     * @return 结果
     */
    public int insertEboardWord(EboardWord eboardWord);

    /**
     * 修改单词
     * 
     * @param eboardWord 单词
     * @return 结果
     */
    public int updateEboardWord(EboardWord eboardWord);

    /**
     * 删除单词
     * 
     * @param wordId 单词主键
     * @return 结果
     */
    public int deleteEboardWordByWordId(Long wordId);

    /**
     * 批量删除单词
     * 
     * @param wordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardWordByWordIds(Long[] wordIds);
}
