package dao;

import java.util.List;

import models.mercadoria.IMercadoria;

public interface IDaoMercadoria {
	

	/*@ requires mercadoria != null;
	  @ requires mercadoria.getNome() != null;
	  @ requires mercadoria.getPreco() >= 0; 
	  @ requires mercadoria.getCor() != null; 
	  @ requires mercadoria.getTamanho() != null; 
	  @ requires mercadoria.getProduto() != null; @*/
	public void criarMercadoria(IMercadoria mercadoria);
	
	/*@ requires mercadoria != null;
	  @ requires mercadoria.getNome() != null;
	  @ requires mercadoria.getPreco() >= 0; 
	  @ requires mercadoria.getCor() != null; 
	  @ requires mercadoria.getTamanho() != null; 
	  @ requires mercadoria.getProduto() != null; @*/
	public void editarMercadoria(IMercadoria mercadoria);
	
	/*@ requires ID > 0; @*/
	public void apagarMercadoria(int ID);
	
	/*@ requires ID > 0;
	  @ ensures \result != null; @*/
	public IMercadoria buscarMercadoria_ID(int ID);
	
	/*@ requires true;
	  @ ensures \result != null; @*/
	public List listarMercadorias();

}
