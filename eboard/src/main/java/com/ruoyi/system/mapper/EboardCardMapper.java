package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EboardCard;
import com.ruoyi.system.domain.EboardCardDetail;

/**
 * 卡片Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
public interface EboardCardMapper 
{
    /**
     * 查询卡片
     * 
     * @param cardId 卡片主键
     * @return 卡片
     */
    public EboardCard selectEboardCardByCardId(Long cardId);

    /**
     * 查询卡片列表
     * 
     * @param eboardCard 卡片
     * @return 卡片集合
     */
    public List<EboardCard> selectEboardCardList(EboardCard eboardCard);

    /**
     * 新增卡片
     * 
     * @param eboardCard 卡片
     * @return 结果
     */
    public int insertEboardCard(EboardCard eboardCard);

    /**
     * 修改卡片
     * 
     * @param eboardCard 卡片
     * @return 结果
     */
    public int updateEboardCard(EboardCard eboardCard);

    /**
     * 删除卡片
     * 
     * @param cardId 卡片主键
     * @return 结果
     */
    public int deleteEboardCardByCardId(Long cardId);

    /**
     * 批量删除卡片
     * 
     * @param cardIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEboardCardByCardIds(Long[] cardIds);

    /**
     * 卡片详情
     * @return 结果
     */
    List<EboardCardDetail> queryEboardCardDetailList();

}
