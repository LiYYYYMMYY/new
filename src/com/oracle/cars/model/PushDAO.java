package com.oracle.cars.model;
/**
 * 推广的DAO类
 * @author Administrator
 *
 */


import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class PushDAO {
	public List<Push> listAll(){
		List<Push> pushs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection connection=DriverManager.getConnection("jdbc.mysql://localhost:3306/MyCar","root","root");
			QueryRunner run = new QueryRunner();
			ResultSetHandler<List<Push>> h = new BeanListHandler<Push>(Push.class);
			pushs = run.query(connection,"SELECT * FROM Push", h);

		} catch (Exception e) {
			pushs=new ArrayList<>();
			e.printStackTrace();
		}
		return pushs;
	}

	public boolean deletePush(int parseInt) {
		// TODO Auto-generated method stub
		return false;
	}
}
