package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.venda.IVenda;
import models.venda.Venda;

public class DAOVendas implements IDaoVendas {
	
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
	
			String insert_venda = "INSERT INTO vendas (subtotal, vendedorRg, dataVenda, qtdVendas) VALUES ("
				+ "" + venda.getSubtotal() + "," 
				+ "'" + venda.getVendedorRG() + "'," 
				+ "'" + venda.getDataVenda() + "'," 
				+ "" + venda.getQtdVendas() + ");";
		try {
					
			conectar();
			comando.executeUpdate(insert_venda);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(insert_venda);
		
	}
	
	public void editarVenda(IVenda venda) {
		
		String insert_venda = "UPDATE vendas SET "
				+ "subtotal=" + venda.getSubtotal()
				+ ",vendedorRg='" + venda.getVendedorRG()
				+ "',dataVenda='" + venda.getDataVenda()
				+ "',qtdVendas=" + venda.getQtdVendas()
				+ " WHERE ID=" + venda.getID() + ";";
		try {	
			conectar();
			comando.executeUpdate(insert_venda);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void apagarVenda(int  id) {
		
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
					.executeQuery("SELECT * FROM vendas");
			
			while (result.next()) {
				IVenda le = new Venda();
				le.setID((result.getInt("id")));
				le.setSubtotal(result.getDouble("subtotal"));
				le.setVendedorRG(result.getString("vendedorRg"));
				le.setDataVenda(result.getString("dataVenda"));
				le.setQtdVendas(result.getInt("qtdVendas"));
				list_vendas.add(le);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list_vendas;

	}
	
	public IVenda buscarVenda(int ID) {
		ResultSet result = null;
		IVenda le = new Venda();
		
		try {
			conectar();
			result = comando
					.executeQuery("SELECT * FROM vendas WHERE id = "
							+ ID + ";");
			if (result.next()) {
				le.setID((result.getInt("id")));
				le.setSubtotal(result.getDouble("subtotal"));
				le.setVendedorRG(result.getString("vendedorRg"));
				le.setDataVenda(result.getString("dataVenda"));
				le.setQtdVendas(result.getInt("qtdVendas"));
			} else {
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return le;
	}


}
