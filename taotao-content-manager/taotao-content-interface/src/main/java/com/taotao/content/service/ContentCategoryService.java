package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNodeResult;
import com.taotao.common.pojo.TaotaoResult;

public interface ContentCategoryService {
	 List<EasyUITreeNodeResult> getContentCategoryList(Long parentId);
	 
	 TaotaoResult addContentCategory(Long parentId,String name);
}
