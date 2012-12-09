package dao;

import java.util.List;

import models.mercadoria.IMercadoria;

public interface IDaoMercadoria {
	
	public void criarMercadoria(IMercadoria mercadoria);
	public void editarMercadoria(IMercadoria mercadoria);
	public void apagarMercadoria(String ID);
	public IMercadoria buscarMercadoria_ID(String ID);
	public List<IMercadoria> listarMercadorias();

}
