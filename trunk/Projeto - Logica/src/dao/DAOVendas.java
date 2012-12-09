package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;
import models.venda.IVenda;
import models.venda.Venda;

public class DAOVendas implements IDAOVendas {
	
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

	public void criarVenda (IVenda venda) {
	
			String insert_venda = "INSERT INTO vendas VALUES ("
				+ venda.getSubtotal() + "," 
				+ "'" + venda.getVendedor().getRg() + "'," 
				+ venda.getVendedor().getQuantidadeVendas() + ");";
		try {
					
			conectar();
			comando.executeUpdate(insert_venda);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(insert_venda);
		
	}
	
	public void editarVenda(IVenda venda) {
		
		String insert_venda = "UPDATE funcionario SET "
				+ "subtotal=" + venda.getSubtotal()
				+ "',vendedor='" + venda.getVendedor()
				+ ",qtdVendas=" + venda.getVendedor().getQuantidadeVendas()
				+ " WHERE rg=" + venda.getVendedor().getRg();
		try {	
			conectar();
			comando.executeUpdate(insert_venda);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void apagarFuncionario(int  id) {
		
		String remove_venda = "DELETE FROM funcionario WHERE id = "
				+ id + 	 ";";
		try {	
			conectar();
			comando.executeUpdate(remove_venda);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<IVenda> listarVendas() {

		conectar();
		List<IVenda> list_vendas = new ArrayList<IVenda>();
		ResultSet result;

		try {
			result = comando
					.executeQuery("SELECT * FROM funcionario ORDER BY cargo");
			
			while (result.next()) {
				IVenda le = new Venda();
				le.setID((result.getInt("id")));
				le.setSubtotal(result.getDouble("subtotal"));
				le.setVendedor(result.getString("vendedor"));
				le.set(result.getString("dataNascimento"));
				le.setCargo(result.getString("cargo"));
				le.setSalario(result.getDouble("salario"));
				list_vendas.add(le);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list_vendas;

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


}
