package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class InsertData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		String sql = "insert into employee(employee_id,employe_name)"+"values(120,'sneha')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jashree","root","jaya");
		Statement statement = con.createStatement();
		statement.execute(sql);
		System.out.println("Insertion succes");
		con.close();
		statement.close();
		}catch(Exception e){
			System.out.println(e);
		}
				}
		
	

}
