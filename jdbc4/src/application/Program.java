package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller "
					+ " SET BaseSalary = BaseSalary + ? " //? = additional amount
					+ "WHERE "
					+ "(DepartmentId = ?)"); //? = department code
			
			st.setDouble(1, 200.0); //1 significa o primeiro interrogacao
			st.setInt(2, 2); //o primeiro 2, significa o segundo interrogacao
		
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Roes affected: " + rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}		
	}
}