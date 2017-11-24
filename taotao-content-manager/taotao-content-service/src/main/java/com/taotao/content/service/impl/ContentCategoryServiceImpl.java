package com.taotao.content.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNodeResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentCategoryService;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.pojo.TbContentCategoryExample.Criteria;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private TbContentCategoryMapper contentCategoryMapper;
	@Override
	public List<EasyUITreeNodeResult> getContentCategoryList(Long parentId) {
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		List<EasyUITreeNodeResult> results = new ArrayList<EasyUITreeNodeResult>();
		for (TbContentCategory tbContentCategory : list) {
			EasyUITreeNodeResult easyUITreeNodeResult = new EasyUITreeNodeResult();
			easyUITreeNodeResult.setId(tbContentCategory.getId());
			easyUITreeNodeResult.setState(tbContentCategory.getIsParent()?"closed":"open");
			easyUITreeNodeResult.setText(tbContentCategory.getName());
			results.add(easyUITreeNodeResult);
		}
		return results;
	}
	@Override
	public TaotaoResult addContentCategory(Long parentId, String name) {
		TbContentCategory record = new TbContentCategory();
		record.setIsParent(false);
		record.setName(name);
		record.setParentId(parentId);
		record.setCreated(new Date());
		record.setSortOrder(1);
		record.setUpdated(new Date());
		record.setStatus(1);
		//执行插入
		contentCategoryMapper.insert(record);
		TbContentCategory contentCategory = contentCategoryMapper.selectByPrimaryKey(parentId);
		if(!contentCategory.getIsParent()){
			contentCategory.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(contentCategory);
		}
	    return new TaotaoResult().ok(record);
	}

}
