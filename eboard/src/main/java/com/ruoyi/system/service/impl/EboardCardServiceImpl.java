package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.EboardCardDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EboardCardMapper;
import com.ruoyi.system.domain.EboardCard;
import com.ruoyi.system.service.IEboardCardService;

/**
 * 卡片Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-26
 */
@Service
public class EboardCardServiceImpl implements IEboardCardService 
{
    @Autowired
    private EboardCardMapper eboardCardMapper;

    /**
     * 查询卡片
     * 
     * @param cardId 卡片主键
     * @return 卡片
     */
    @Override
    public EboardCard selectEboardCardByCardId(Long cardId)
    {
        return eboardCardMapper.selectEboardCardByCardId(cardId);
    }

    /**
     * 查询卡片列表
     * 
     * @param eboardCard 卡片
     * @return 卡片
     */
    @Override
    public List<EboardCard> selectEboardCardList(EboardCard eboardCard)
    {
        return eboardCardMapper.selectEboardCardList(eboardCard);
    }

    /**
     * 新增卡片
     * 
     * @param eboardCard 卡片
     * @return 结果
     */
    @Override
    public int insertEboardCard(EboardCard eboardCard)
    {
        return eboardCardMapper.insertEboardCard(eboardCard);
    }

    /**
     * 修改卡片
     * 
     * @param eboardCard 卡片
     * @return 结果
     */
    @Override
    public int updateEboardCard(EboardCard eboardCard)
    {
        return eboardCardMapper.updateEboardCard(eboardCard);
    }

    /**
     * 批量删除卡片
     * 
     * @param cardIds 需要删除的卡片主键
     * @return 结果
     */
    @Override
    public int deleteEboardCardByCardIds(Long[] cardIds)
    {
        return eboardCardMapper.deleteEboardCardByCardIds(cardIds);
    }

    /**
     * 删除卡片信息
     * 
     * @param cardId 卡片主键
     * @return 结果
     */
    @Override
    public int deleteEboardCardByCardId(Long cardId)
    {
        return eboardCardMapper.deleteEboardCardByCardId(cardId);
    }

    @Override
    public List<EboardCardDetail> queryEboardCardDetailList() {
        return eboardCardMapper.queryEboardCardDetailList();
    }
}
