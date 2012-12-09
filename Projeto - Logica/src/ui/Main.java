package ui;

import java.util.List;

import dao.DAOFactory;
import dao.DAOMercadoria;
import models.mercadoria.InterfaceMercadoria;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("iniciando.");
//		InterfaceMercadoria mercadoria = new Mercadoria();
//		
//		mercadoria.setPreco(10.5);
//		mercadoria.setID("CE001");
//		mercadoria.setNome("Camisa Estampa");
//		mercadoria.setCor("Verde");
//		mercadoria.setTamanho("GG");
//		mercadoria.setProduto("Camisa");
		
		 DAOFactory mysqlFactory = DAOFactory.createDAOFactory(0);
		 DAOMercadoria daoF = mysqlFactory.createDAOMercadoria();
		
		 daoF.apagarMercadoria("SE001");
		 
		 System.out.println("ok");
		
	}
 
}
 
