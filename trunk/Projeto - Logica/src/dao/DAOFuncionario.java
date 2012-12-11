package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;

public class DAOFuncionario implements IDaoFuncionario {
	
	private static Connection con;
	private static Statement comando;

	private void conectar() {
		
		try {
			con = ConnectMySql.conexao("jdbc:mysql://localhost/projetologica", "eplay",
					"eplay", MySQLDAOFactory.MYSQL);
			comando = con.createStatement();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void criarFuncionario (IFuncionario funcionario) {
	
			String insert_funcionario = "INSERT INTO funcionario VALUES ("
				+ "'" + funcionario.getNome() + "'," 
				+ "'" + funcionario.getRg() + "'," 
				+ "'" + funcionario.getCpf() + "',"
				+ "'" + funcionario.getDataNascimento() + "'," 
				+ "'" + funcionario.getCargo() + "'," + 
				+ funcionario.getSalario() + ");";
		try {
					
			conectar();
			comando.executeUpdate(insert_funcionario);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(insert_funcionario);
		
	}
	
	public void atualizarSalario(IFuncionario funcionario) {
		
		String insert_novoSalario = "UPDATE funcionario SET "
				+ "salario=" + funcionario.getSalario()
				+ " WHERE rg='" + funcionario.getRg() + "'";
		try {	
			conectar();
			comando.executeUpdate(insert_novoSalario);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void editarFuncionario(IFuncionario funcionario) {
		
		String insert_funcionario = "UPDATE funcionario SET "
				+ "nome='" + funcionario.getNome()
				+ "',rg='" + funcionario.getRg()
				+ "',cpf='" + funcionario.getCpf()
				+ "',dataNascimento='" + funcionario.getDataNascimento()
				+ "',cargo='" + funcionario.getCargo()
				+ "',salario=" + funcionario.getSalario()
				+ " WHERE rg=" + funcionario.getRg();
		try {	
			conectar();
			comando.executeUpdate(insert_funcionario);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void apagarFuncionario(String  rg) {
		
		String remove_funcionario = "DELETE FROM funcionario WHERE rg = "
				+ rg + 	 ";";
		try {	
			conectar();
			comando.executeUpdate(remove_funcionario);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List listarFuncionario() {

		conectar();
		List list_funcionario = new ArrayList();
		ResultSet result;

		try {
			result = comando
					.executeQuery("SELECT * FROM funcionario ORDER BY cargo");
			
			while (result.next()) {
				IFuncionario le = new Funcionario();
				le.setNome(result.getString("nome"));
				le.setRg(result.getString("rg"));
				le.setCpf(result.getString("cpf"));
				le.setDataNascimento(result.getString("dataNascimento"));
				le.setCargo(result.getString("cargo"));
				le.setSalario(result.getDouble("salario"));
				list_funcionario.add(le);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list_funcionario;

	}
	
	public IFuncionario buscarFuncionario(String rg) {
		ResultSet result = null;
		IFuncionario le = new Funcionario();
		
		try {
			conectar();
			result = comando
					.executeQuery("SELECT * FROM funcionario WHERE rg = "
							+ rg + ";");
			if (result.next()) {
				le.setNome(result.getString("nome"));
				le.setRg(result.getString("rg"));
				le.setCpf(result.getString("cpf"));
				le.setDataNascimento(result.getString("dataNascimento"));
				le.setCargo(result.getString("cargo"));
				le.setSalario(result.getDouble("salario"));
			} else {
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return le;
	}

	
	public int quantidadeVendas(IFuncionario funcionario) {
		
		ResultSet qtdVenda = null;
		
		try {
			conectar();
			qtdVenda = comando
					.executeQuery("SELECT vendedorRg," 
							+ "COUNT(" + funcionario.getRg() 
							+ ") as vendas from vendas GROUP BY vendedorRg" + ";");
			if (qtdVenda.next()) {
				return Integer.parseInt(qtdVenda.getString("vendas"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
		
	}

	@Override
	public double buscarSalario(IFuncionario funcionario) {
		
		ResultSet salario = null;
		
		String buscar_salario = "SELECT  salario FROM funcionario"
				+ " WHERE rg='" + funcionario.getRg() + "'";
		try {	
			conectar();
			salario = comando.executeQuery(buscar_salario);
			
			if (salario.next()) {
				return Double.parseDouble(salario.getString("salario"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		};
		
		return -1; 
	}
	
}
 