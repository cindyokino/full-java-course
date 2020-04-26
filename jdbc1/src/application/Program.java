package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = DB.getConnection(); //para conectar com o banco de dados
		DB.closeConnection(); //para fechar a conexao
		
	}
}
