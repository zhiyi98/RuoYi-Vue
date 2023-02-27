package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 故事对象 eboard_story
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public class EboardStory
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long storyId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String storyName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String storyContent;

    public void setStoryId(Long storyId) 
    {
        this.storyId = storyId;
    }

    public Long getStoryId() 
    {
        return storyId;
    }
    public void setStoryName(String storyName) 
    {
        this.storyName = storyName;
    }

    public String getStoryName() 
    {
        return storyName;
    }
    public void setStoryContent(String storyContent) 
    {
        this.storyContent = storyContent;
    }

    public String getStoryContent() 
    {
        return storyContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("storyId", getStoryId())
            .append("storyName", getStoryName())
            .append("storyContent", getStoryContent())
            .toString();
    }
}
