package dao;

import java.util.List;

import models.venda.IVenda;

public interface IDaoVendas {
	
	/*@ requires venda != null;
	  @ requires venda.getSubtotal() >= 0;
	  @ requires venda.getVendedorRG() != null; 
	  @ requires venda.getDataVenda() != null;
	  @ requires venda.getQtdVendas() >= 0; @*/
	public void criarVenda (IVenda venda);
	
	/*@ requires venda != null;
	  @ requires venda.getSubtotal() >= 0;
	  @ requires venda.getVendedorRG() != null; 
	  @ requires venda.getDataVenda() != null;
	  @ requires venda.getQtdVendas() >= 0; @*/
	public void editarVenda(IVenda venda);
	
	/*@ requires id > 0; @*/
	public void apagarVenda(int  id);
	
	/*@ requires true; 
	  @ ensures \result != null; @*/
	public List listarVendas();
	
	/*@ requires ID > 0; 
	  @ ensures \result != null; @*/
	public IVenda buscarVenda(int ID);
	
	/*@
	  @ requires id > 0;
	  @ ensures \result > 0 
	  @ 	|| \result == -1;@*/
	public int buscarIdVenda (int id);

}
