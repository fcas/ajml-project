package ui;

import java.util.List;

import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;
import models.mercadoria.IMercadoria;
import models.mercadoria.Mercadoria;
import models.venda.IVenda;
import dao.DAOFactory;
import dao.DAOFuncionario;
import dao.DAOMercadoria;
import facade.Facade;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("iniciando.");
		IMercadoria mercadoria = new Mercadoria();
		
		mercadoria.setPreco(25);
		mercadoria.setNome("nome2");
		mercadoria.setTamanho("G");
		mercadoria.setProduto("produto");
		mercadoria.setCor("novaCor");
		
		IFuncionario funcionario = new Funcionario();
		
		funcionario.setRg("4");
		funcionario.setCargo("1cargo");
		funcionario.setCpf("1cpf");
		funcionario.setDataNascimento("01/01/2001");
		funcionario.setNome("1nome");
		funcionario.setSalario(210);
		
		DAOFactory mysqlFactory = DAOFactory.createDAOFactory(0);
		DAOMercadoria daoM = mysqlFactory.createDAOMercadoria();
		DAOFuncionario daoF = mysqlFactory.createDAOFuncionario();
		
		daoM.criarMercadoria(mercadoria);
		daoF.criarFuncionario(funcionario);
		
		
		
		Facade facade = new Facade(0);
		List<IFuncionario> listF = facade.listarFuncionarios();
		List<IMercadoria> listM = facade.listarMercadorias();
		List<IVenda> listV = facade.listarVendas();
		
		System.out.println("Lista de Funcionarios:");
		for(int i = 0; i<listF.size(); i++){
			System.out.println(listF.get(i).getNome());
		}
		
		System.out.println("\n\nLista de Mercadorias:");
		for(int i = 0; i<listM.size(); i++){
			System.out.println(listM.get(i).getNome());
		}
		
		System.out.println("\n\nLista de Vendas:");
		for(int i = 0; i<listV.size(); i++){
			System.out.println(listV.get(i).getID() + " | " + listV.get(i).getSubtotal());
		}
		
		 
		 System.out.println("ok");
		
	}
 
}
 
