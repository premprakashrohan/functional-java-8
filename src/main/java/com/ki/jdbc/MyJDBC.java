package com.ki.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBC {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.
	            getConnection("jdbc:h2:~/test", "sa", "");
	        // add application code here
		System.out.println(conn);
	        conn.close();

	}

}
