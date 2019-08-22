package com.qf.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class MyPool {
	private static ComboPooledDataSource datasource = new ComboPooledDataSource("mypool");
    
	public static DataSource getDatasource(){
		
		return datasource;
   }
	
}
