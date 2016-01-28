package com.example;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class cassandraUtil {

	public static void getConnection(){
		try(Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build()){
			try(Session session = cluster.connect()){
				session.execute("INSERT INTO mykeyspace.users (user_id,  fname, lname) VALUES (1, 'john', 'smith');");
				ResultSet rs = session.execute("SELECT * FROM mykeyspace.users;");
				rs.forEach(row -> System.out.println(row));
			}
		}
	}
}
