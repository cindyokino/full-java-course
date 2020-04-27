package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() { //implementacao da operacao para ABRIR uma conexao
		if (conn == null) {
			try {
				Properties props = loadProperties(); //pegamos as propriedades
				String url = props.getProperty("dburl"); //no caso a url
				conn = DriverManager.getConnection(url, props); //e conectamos ao banco de dados
				//conectar com o banco de dados no JDBC é instanciar um objeto do tipo Connection
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeConnection() { //implementacao da operacao para FECHAR uma conexao
		if (conn != null) { //testa se a conexao esta instanciada
			try {
			conn.close();
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	public static void closeStatement(Statement st) {
		if (st != null) { //se st nao for nulo (se estiver instanciado)
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) { //se st nao for nulo (se estiver instanciado)
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}