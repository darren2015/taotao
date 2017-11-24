package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNodeResult;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private TbItemCatMapper tbItemCatMapper;
	
	@Override
	public List<EasyUITreeNodeResult> getTreeNodeList(Long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example);
		List<EasyUITreeNodeResult> resultList = new ArrayList<EasyUITreeNodeResult>();
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNodeResult nodeResult = new EasyUITreeNodeResult();
			nodeResult.setId(tbItemCat.getId());
			nodeResult.setText(tbItemCat.getName());
			nodeResult.setState(tbItemCat.getIsParent()?"closed":"open");
			resultList.add(nodeResult);
		}
		return resultList;
	}

}
