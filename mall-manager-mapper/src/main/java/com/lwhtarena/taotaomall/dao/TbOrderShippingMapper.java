package com.lwhtarena.taotaomall.dao;

import com.lwhtarena.taotaomall.pojo.TbOrderShipping;
import com.lwhtarena.taotaomall.pojo.TbOrderShippingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @Date: 2016/12/11 14:48
 * @Description:<p></p>
 */
public interface TbOrderShippingMapper {
    int countByExample(TbOrderShippingExample example);

    int deleteByExample(TbOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);
}
