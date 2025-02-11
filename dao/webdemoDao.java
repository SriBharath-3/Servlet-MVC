package com.sri.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.sri.model.webdemo;

public class webdemoDao {

public webdemo getwebDemo(int id) {
	webdemo wd=new webdemo();
	
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sridb", "root", "Sribharath1601.");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from demoweb where id="+id);
		if(rs.next()) {
			wd.setId(rs.getInt("id"));
			wd.setName(rs.getString("name"));
			wd.setAge(rs.getInt("age"));
			
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return wd;
}
}
