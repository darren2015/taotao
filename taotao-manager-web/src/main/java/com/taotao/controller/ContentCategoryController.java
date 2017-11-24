package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUITreeNodeResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.content.service.ContentCategoryService;

@Controller
public class ContentCategoryController {
	@Autowired
	private ContentCategoryService categoryService;
	
	@RequestMapping("/content/category/list")
	@ResponseBody
	public List<EasyUITreeNodeResult> getContentCategoryList(@RequestParam(value="id",defaultValue="0")Long parentId){
		List<EasyUITreeNodeResult> contentCategoryList = categoryService.getContentCategoryList(parentId);
		return contentCategoryList;
	}
	
	@RequestMapping("/content/category/create")
	@ResponseBody
	public TaotaoResult addContentCategory(String parentId,String name){
		TaotaoResult contentCategory = categoryService.addContentCategory(Long.valueOf(parentId), name);
		return contentCategory;
	}
}
