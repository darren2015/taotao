package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	public TbItem getItemById(long itemId);
	
	public EasyUIDataGridResult getItemList(Integer pageNum,Integer pageSize);
}
