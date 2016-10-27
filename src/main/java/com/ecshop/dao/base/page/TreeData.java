/**
 * Company:VVE
 * Project:vve_plat_dao
 * Date:2015-10-21
 * Author:andy.zhang
 */
package com.ecshop.dao.base.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 树，easyui树基础结构
 *
 */
public class TreeData<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5223892137940625876L;
	
	private List<TreeData<T>> children=new ArrayList<TreeData<T>>();
	
	private T value;
	private Object id;
	private String text;

	/**
	 * @return the id
	 */
	public Object getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Object id) {
		this.id = id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the children
	 */
	public List<TreeData<T>> getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<TreeData<T>> children) {
		this.children = children;
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(T value) {
		this.value = value;
	}
	

}
