package com.ruoyi.system.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EboardCardDetail {

    /**
     * 卡片Id
     */
    private Long cardId;

    /**
     * 卡片名称
     */
    private String cardName;

    /**
     * 单词
     */
    private List<EboardWord> eboardWordList;

    /**
     * 故事
     */
    private List<EboardStory> eboardStoryList;

    /**
     * 阅读次数
     */
    private int count;

    /**
     * 最后阅读时间
     */
    private Date lastTime;



}
