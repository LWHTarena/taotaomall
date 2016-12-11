package com.lwhtarena.taotaomall.dao;

import com.lwhtarena.taotaomall.pojo.TbItem;
import com.lwhtarena.taotaomall.pojo.TbItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @Date: 2016/12/11 14:43
 * @Description:<p></p>
 */
public interface TbItemMapper {
    int countByExample(TbItemExample example);

    int deleteByExample(TbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}
