/**
 * 
 */
package com.ecshop.dao.business.models.custom;

import com.ecshop.dao.business.models.TProperty;

/**
 * @author Administrator
 *
 */
public class Property extends TProperty {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -8782086149610163647L;
	
	
	private String[] selectValues;

	public String[] getSelectValues() {
		return selectValues;
	}

	public void setSelectValues(String[] selectValues) {
		this.selectValues = selectValues;
	}
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
	
}
