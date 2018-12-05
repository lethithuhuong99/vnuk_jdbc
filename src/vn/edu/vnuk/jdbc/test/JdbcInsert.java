package vn.edu.vnuk.jdbc.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vn.edu.vnuk.jdbc.ConnectionFactory;

public class JdbcInsert{

	public static void main(String[] args)  throws SQLException  {
		Connection connection = new ConnectionFactory().getConnection();
		String sqlQuery = " insert into continents(label)"
						+ " values('Asia')";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sqlQuery);
			statement.execute();
			statement.close();
			System.out.println("New Record in DB");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			connection.close();
			System.out.println("Done!");
		}
		
	}

}
