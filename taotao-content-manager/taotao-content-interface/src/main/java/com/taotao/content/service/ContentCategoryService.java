package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNodeResult;
import com.taotao.common.pojo.TaotaoResult;

/**
 * 内容类别服务接口，用于操作内容类别。
 * 
 * @author Darren 
 * @date 2017年11月24日 下午4:11:56
 */
public interface ContentCategoryService {
	
	 List<EasyUITreeNodeResult> getContentCategoryList(Long parentId);
	 
	 TaotaoResult addContentCategory(Long parentId,String name);
}
