package com.ki.jdbc;

import java.sql.SQLException;

import org.h2.tools.Server;

public class MyTCP {

	public static void main(String[] args) throws SQLException {
		Server server = Server.createTcpServer(args).start();

	}

}
