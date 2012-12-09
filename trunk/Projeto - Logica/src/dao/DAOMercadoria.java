package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import models.mercadoria.InterfaceMercadoria;

public class DAOMercadoria implements IDaoMercadoria{
			
		private static Connection con;
		private static Statement comando;

		private void conectar() {
			
			try {
				con = ConnectMySql.conexao("jdbc:mysql://localhost/eplay", "eplay",
						"eplay", MySQLDAOFactory.MYSQL);
				comando = con.createStatement();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void criarMercadoria (InterfaceMercadoria mercadoria) {
		
				String insert_funcionario = "INSERT INTO funcionario VALUES ("
					+ "'" + mercadoria.getID() + "'," 
					+ "'" + mercadoria.getNome() + "'," 
					+ "'" + mercadoria.getPreco() + "');";
			try {
						
				conectar();
				comando.executeUpdate(insert_funcionario);
		
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} 
}
 
