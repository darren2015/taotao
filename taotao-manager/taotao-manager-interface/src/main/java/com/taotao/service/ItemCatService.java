package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNodeResult;

/**
 * 商品类别服务接口
 * 
 * @author Darren
 * @date 2017年11月29日 下午4:15:11
 */
public interface ItemCatService {
	
	/**
	 * 根据父节点ID查询下面的子节点列表
	 * @param parentId 父节点ID
	 * @return 
	 */
	public List<EasyUITreeNodeResult> getTreeNodeList(Long parentId);
}
