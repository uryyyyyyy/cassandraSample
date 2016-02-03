package com.example;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class cassandraUtil {

	public static void main(String[] args){
		try(Cluster cluster = Cluster.builder().addContactPoint("172.17.0.3").build()){
			try(Session session = cluster.connect()){
				session.execute("INSERT INTO sampledb.emp (empID, deptID, first_name, last_name) VALUES (104, 15, 'jane', 'smith');");
				ResultSet rs = session.execute("SELECT * FROM sampledb.emp;");
				rs.forEach(row -> System.out.println(row));
			}
		}
	}
}
