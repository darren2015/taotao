package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	/**
	 * 根据商品ID获取商品信息
	 * @param itemId
	 * @return
	 */
	public TbItem getItemById(long itemId);
	
	public EasyUIDataGridResult getItemList(Integer pageNum,Integer pageSize);
}
