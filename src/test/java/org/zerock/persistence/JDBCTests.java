package org.zerock.persistence;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTests {

	@Test
	public void test() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			fail();
		}
		
		String url = "jdbc:mysql://54.180.160.140/Practice"; // 본인 ip
		String user = "root";
		String password = "wnddkdwjdqhcjfl1";
		
		try (
			Connection con = DriverManager.getConnection(url, user, password)
				){
			assertNotNull(con);
			
		} catch (Exception e) {
			fail();
		}
	}

}
