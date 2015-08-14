package com.example;

import com.datastax.driver.core.*;

public class Sample {

	public static void main(String[] args){
		try(Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build()){
			try(Session session = cluster.connect()){
				PreparedStatement statement = session.prepare(
						"INSERT INTO mykeyspace.users (user_id,  fname, lname) VALUES (?, ?, ?);");
				session.execute(new BoundStatement(statement).bind(
						100,
						"Johny",
						"Ken"));
//				session.execute("INSERT INTO mykeyspace.users (user_id,  fname, lname) VALUES (1, 'john', 'smith');");
				ResultSet rs = session.execute("SELECT * FROM mykeyspace.users;");
				rs.forEach(row -> System.out.println(row));
			}
		}
	}
}
