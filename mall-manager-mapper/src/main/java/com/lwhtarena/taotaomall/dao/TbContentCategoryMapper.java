package com.lwhtarena.taotaomall.dao;

import com.lwhtarena.taotaomall.pojo.TbContentCategory;
import com.lwhtarena.taotaomall.pojo.TbContentCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 李文浩【lwhtarena@163.com】
 * @Date: 2016/12/11 14:15
 * @Description:<p>内容管理dao接口</p>
 */
public interface TbContentCategoryMapper {

    int countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);

}
