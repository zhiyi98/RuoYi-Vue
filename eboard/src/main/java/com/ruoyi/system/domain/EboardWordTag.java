package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 单词标签对象 eboard_word_tag
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public class EboardWordTag extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long wordTagId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String wordTagName;

    public void setWordTagId(Long wordTagId) 
    {
        this.wordTagId = wordTagId;
    }

    public Long getWordTagId() 
    {
        return wordTagId;
    }
    public void setWordTagName(String wordTagName) 
    {
        this.wordTagName = wordTagName;
    }

    public String getWordTagName() 
    {
        return wordTagName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("wordTagId", getWordTagId())
            .append("wordTagName", getWordTagName())
            .toString();
    }
}
