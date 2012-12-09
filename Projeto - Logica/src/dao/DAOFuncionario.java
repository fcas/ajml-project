package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import models.funcionario.InterfaceFuncionario;

public class DAOFuncionario implements IDaoFuncionario {
	
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

	public void criarFuncionario (InterfaceFuncionario funcionario) {
	
			String insert_funcionario = "INSERT INTO funcionario VALUES ("
				+ "'" + funcionario.getNome() + "'," 
				+ "'" + funcionario.getRg() + "'," 
				+ "'" + funcionario.getCpf() + "',"
				+ "'" + funcionario.getDataNascimento() + "'," 
				+ "'" + funcionario.getCargo() + "');";
		try {
					
			conectar();
			comando.executeUpdate(insert_funcionario);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
 
}
 
