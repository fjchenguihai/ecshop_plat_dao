package com.ecshop.dao.base.page;

import java.io.Serializable;
import java.util.List;

/**
 * 用于easyui分页模型
 * @author 
 *
 * @param <T>
 */
public class PageModel<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7598445400464516221L;

	/**
	 * 分页数据
	 */
	private List<T> rows;
	
	/**
	 * 总数
	 */
	private int total;
	
	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
