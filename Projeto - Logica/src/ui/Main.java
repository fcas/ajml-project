package ui;

import java.util.ArrayList;
import java.util.List;

import models.mercadoria.IMercadoria;
import models.mercadoria.Mercadoria;
import models.venda.IVenda;
import models.venda.Venda;
import dao.DAOFactory;
import dao.DAOVendas;
import facade.Facade;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("iniciando.");
		
		DAOFactory mysqlFactory = DAOFactory.createDAOFactory(0);
		DAOVendas daoV = mysqlFactory.createDAOVendas();
		
		
		
		Facade facade = new Facade(0); //tem q ter o facade
		List<IMercadoria> listaMercadoria = new ArrayList<IMercadoria>(); //essa lista j� tinha que estar criada antes do bot�o ser apertado
		double subtotal = 0; //auxiliar
		
		//bot�o Adicionar: -> a cada vez que clicar, busca uma mercadoria e atualiza a lista e o subtotal
		IMercadoria mercadoria = new Mercadoria();
		mercadoria = facade.buscarMercadoria("a"/*id passado no formul�rio*/);
		listaMercadoria.add(mercadoria);
		subtotal += mercadoria.getPreco();
		/*
		 * atualiza a exibi��o da lista e do subtotal.
		 */
		
		IVenda venda = new Venda(); //� bom isso estar criado antes de apertar o bot�o OK
		//bot�o OK(pode mudar o nome)
		venda.setVendedorRG("a"/*vendedor passado no formul�rio*/);
		venda.setDataVenda("10/12/2012");
		venda.setSubtotal(subtotal);
		venda.setQtdVendas(listaMercadoria.size());

		daoV.criarVenda(venda);
		
		if(true){
			
		}
		/*
		 * Se n�o tiver nenhuma exce��o levantada na cria��o da venda,
		 * tela de sucesso.
		 */
		
		
		

		
		
		/*
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
		
		 
		 System.out.println("ok");*/
		
	}
 
}
 
