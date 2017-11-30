package com.taotao.common.pojo;

import java.io.Serializable;

public class EasyUITreeNodeResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2472228128182145559L;
	/**
	 * 节点ID(类别ID)
	 */
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 商品类别名称
	 */
	private String text;
	/**
	 * 节点状态（"closed" or "open"）
	 */
	private String state;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
