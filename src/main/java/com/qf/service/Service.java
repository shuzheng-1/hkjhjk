package com.qf.service;

import com.qf.pojo.User;
import com.qf.dao.Dao;


import java.sql.SQLException;
import java.util.List;

public class Service {
	
	Dao dao = new Dao();
	
    public List<User> select() throws SQLException{
		
		return dao.select();
		
	}

}
