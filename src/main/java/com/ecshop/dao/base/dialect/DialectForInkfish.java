package com.ecshop.dao.base.dialect;

import java.sql.Types;

import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

/**
 * ע��hibernate֧�ֵ��ֶη���
 * @author 
 *
 */

public class DialectForInkfish extends MySQL5Dialect {   
    public DialectForInkfish() {   
        super();   
        //registerHibernateType(Types.LONGVARCHAR, 65535, "text");  
        registerHibernateType(Types.DECIMAL, StandardBasicTypes.BIG_DECIMAL.getName());
        registerHibernateType(Types.LONGVARCHAR,StandardBasicTypes.TEXT.getName());
        registerFunction("group_concat", new StandardSQLFunction(  
                "group_concat", StandardBasicTypes.STRING));  
    }   
}  