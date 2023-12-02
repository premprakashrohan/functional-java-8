package com.ki.jdbc;

import java.io.UncheckedIOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.schema.Schema;
import org.jooq.lambda.SQL;
import org.jooq.lambda.Unchecked;
import org.jooq.lambda.fi.util.function.CheckedFunction;

public class MyConnectionPool {

	public static void main(String[] args) throws SQLException {
		JdbcConnectionPool cp = JdbcConnectionPool.create("jdbc:h2:~/test", "sa", "");
		 
				
		try (Connection c =  cp.getConnection()) {
		    String sql = "select schema_name, is_default " +
		                 "from information_schema.schemata " +
		                 "order by schema_name";

		    try (PreparedStatement stmt = c.prepareStatement(sql)) {

		        // We can wrap a Statement or a ResultSet in a
		        // Java 8 ResultSet Stream
//		    	CheckedFunction<ResultSet,Schema>  f = (ResultSet rs) ->
//		            {return new Schema(
//		                rs.getString("SCHEMA_NAME"),
//		                rs.getBoolean("IS_DEFAULT")
//		            );};
//		         
//		        SQL.seq(stmt, Unchecked.function())
//		        .forEach(System.out::println);
		    }
		}
		 
		cp.dispose();

	}

}
