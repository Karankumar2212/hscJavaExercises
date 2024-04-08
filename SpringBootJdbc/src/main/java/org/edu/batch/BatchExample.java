package org.edu.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.scheduling.annotation.Scheduled;

public class BatchExample {
	
//	@Scheduled(fixedRate=1000)
//	public void display() {
//		System.out.println("Display message");
//	}

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "root");

			System.out.println("Connection established successfully");
			Statement stmt = con.createStatement(); 
			stmt.addBatch("insert into batchExample values('Walter','White')");
			stmt.addBatch("insert into batchExample values('Peaky','Blinder')");
			stmt.addBatch("insert into batchExample values('Michael','Jackson')");
			int a[] = stmt.executeBatch();
			for(int i: a) {
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close(); 
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	}
}


