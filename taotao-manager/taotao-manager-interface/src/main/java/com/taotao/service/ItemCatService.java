package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNodeResult;

public interface ItemCatService {
	
	public List<EasyUITreeNodeResult> getTreeNodeList(Long parentId);
}
