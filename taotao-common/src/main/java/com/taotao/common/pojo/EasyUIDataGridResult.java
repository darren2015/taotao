package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * EasyUI列表数据源对应的POJO
 * 
 * @author Darren
 * @date 2017年11月29日 下午3:07:10
 */
public class EasyUIDataGridResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -772937784345173567L;

	private Integer total;

    private List<?> rows;

    public EasyUIDataGridResult(Integer total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public EasyUIDataGridResult(Long total, List<?> rows) {
        this.total = total.intValue();
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

}
