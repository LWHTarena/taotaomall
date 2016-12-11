package com.lwhtarena.taotaomall.dao;

import com.lwhtarena.taotaomall.pojo.TbItemCat;
import com.lwhtarena.taotaomall.pojo.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @Date: 2016/12/11 14:41
 * @Description:<p></p>
 */
public interface TbItemCatMapper {

    int countByExample(TbItemCatExample example);

    int deleteByExample(TbItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);

    List<TbItemCat> selectByExample(TbItemCatExample example);

    TbItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    int updateByPrimaryKeySelective(TbItemCat record);

    int updateByPrimaryKey(TbItemCat record);

}
