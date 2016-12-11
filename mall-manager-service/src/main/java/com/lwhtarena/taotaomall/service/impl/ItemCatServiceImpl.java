package com.lwhtarena.taotaomall.service.impl;

import com.lwhtarena.taotaomall.common.pojo.EUDataGridResult;
import com.lwhtarena.taotaomall.common.pojo.TaotaoResult;
import com.lwhtarena.taotaomall.dao.TbItemCatMapper;
import com.lwhtarena.taotaomall.pojo.TbItem;
import com.lwhtarena.taotaomall.pojo.TbItemCat;
import com.lwhtarena.taotaomall.pojo.TbItemCatExample;
import com.lwhtarena.taotaomall.pojo.TbItemCatExample.Criteria;
import com.lwhtarena.taotaomall.common.pojo.EUTreeNode;
import com.lwhtarena.taotaomall.service.ItemCatService;
import com.lwhtarena.taotaomall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwh
 * @folder com.lwhtarena.taotaomall.service.impl
 * @date 2016/12/9.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 * <p>商品分类管理</p>
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EUTreeNode> getCatList(long parentId) {

        //创建查询条件
        TbItemCatExample example = new TbItemCatExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //根据条件查询
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        List<EUTreeNode> resultList = new ArrayList<>();
        //把列表转换成treeNodelist
        for (TbItemCat tbItemCat : list) {
            EUTreeNode node = new EUTreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            resultList.add(node);
        }
        //返回结果
        return resultList;
    }

}
