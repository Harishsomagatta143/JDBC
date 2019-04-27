package com.cg.saloon.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.saloon.exception.SaloonNotFoundException;

public class DBUtil {

	static Connection conn;
	public static Connection getConnection() {
		Properties prop=new Properties();
		try {
			InputStream it=new FileInputStream("Resource/jdbc.properties");
			try {
				prop.load(it);
				if(conn==null) {
					if(prop!=null) {
				}
				String driver=prop.getProperty("jdbc.driver");
				String url=prop.getProperty("jdbc.url");
				String uname=prop.getProperty("jdbc.username");
				String upass=prop.getProperty("jdbc.password");
				Class.forName(driver);
				conn=DriverManager.getConnection(url,uname,upass);
				
				}
			} catch ( SQLException | ClassNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		
		}
		
		return conn;
	}
}
