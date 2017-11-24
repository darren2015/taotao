package com.taotao.common.pojo;

import java.io.Serializable;

public class EasyUITreeNodeResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2472228128182145559L;
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String text;
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
