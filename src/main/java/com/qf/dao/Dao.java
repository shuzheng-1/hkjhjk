package com.qf.dao;

import com.qf.util.MyPool;
import com.qf.pojo.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class Dao {
    QueryRunner qr = new QueryRunner(MyPool.getDatasource());
	
	public List<User> select() throws SQLException {
		String sql = "select * from register "	;
		return qr.query(sql, new BeanListHandler<User>(User.class));
		
			
		}

}
