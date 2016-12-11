package com.lwhtarena.taotaomall.service.impl;

import com.lwhtarena.taotaomall.dao.TbItemParamMapper;
import com.lwhtarena.taotaomall.pojo.TbItemParam;
import com.lwhtarena.taotaomall.pojo.TbItemParamExample;
import com.lwhtarena.taotaomall.pojo.TbItemParamExample.Criteria;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;
import com.lwhtarena.taotaomall.service.ItemParamService;
import com.lwhtarena.taotaomall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service.impl
 * @date 2016/12/9.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>商品规格参数模板管理</p>
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    @Autowired
    private TbItemParamMapper itemParamMapper;

    public TaotaoResult getItemParamByCid(long cid) {
        TbItemParamExample example = new TbItemParamExample();
        Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(cid);
        List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
        //判断是否查询到结果
        if (list != null && list.size() > 0) {
            return TaotaoResult.ok(list.get(0));
        }

        return TaotaoResult.ok();
    }

    public TaotaoResult insertItemParam(TbItemParam itemParam) {
        //补全pojo
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        //插入到规格参数模板表
        itemParamMapper.insert(itemParam);
        return TaotaoResult.ok();
    }
}
