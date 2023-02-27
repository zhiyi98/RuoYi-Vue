package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单词对象 eboard_word
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public class EboardWord
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long wordId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String wordName;

    public void setWordId(Long wordId) 
    {
        this.wordId = wordId;
    }

    public Long getWordId() 
    {
        return wordId;
    }
    public void setWordName(String wordName) 
    {
        this.wordName = wordName;
    }

    public String getWordName() 
    {
        return wordName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("wordId", getWordId())
            .append("wordName", getWordName())
            .toString();
    }
}
