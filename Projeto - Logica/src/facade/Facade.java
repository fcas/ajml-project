package facade;

import dao.DAOFactory;
import dao.IDaoFuncionario;
import dao.IDaoMercadoria;
import dao.IDaoVendas;
import java.util.List;
import models.funcionario.IFuncionario;
import models.mercadoria.IMercadoria;
import models.venda.IVenda;

public class Facade {
 
	private /*@ spec_public nullable @*/ IDaoFuncionario iDaoFuncionario;
	private /*@ spec_public nullable @*/ IDaoMercadoria iDaoMercadoria;
	private /*@ spec_public nullable @*/ IDaoVendas iDaoVendas;
	private /*@ spec_public nullable @*/ DAOFactory DaoFactory;
	
	/*@ requires whichFactory == 0;
	  @ ensures DaoFactory != null;
	  @ ensures iDaoMercadoria != null;
	  @ ensures iDaoFuncionario != null;
	  @ ensures iDaoVendas != null; @*/
	
	public Facade(int whichFactory) {
		this.DaoFactory = DAOFactory.createDAOFactory(whichFactory);
		this.iDaoMercadoria = this.DaoFactory.createDAOMercadoria();
		this.iDaoFuncionario = this.DaoFactory.createDAOFuncionario();
		this.iDaoVendas = this.DaoFactory.createDAOVendas();
	}
	
	/*@
	  @ public initially DaoFactory != null;
	  @ public initially iDaoMercadoria != null; 
	  @ public initially iDaoFuncionario != null;
	  @ public initially iDaoVendas != null; @*/
	
	
	//Metodos CRUD Funcionario:
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public void criarFuncionario(IFuncionario funcionario){
		iDaoFuncionario.criarFuncionario(funcionario);
	}
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public void editarFuncionario(IFuncionario funcionario){
		iDaoFuncionario.editarFuncionario(funcionario);
	}
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public double buscarSalario(IFuncionario funcionario){
		return iDaoFuncionario.buscarSalario(funcionario);
	}
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public int quantidadeVendas(IFuncionario funcionario){
		return iDaoFuncionario.quantidadeVendas(funcionario);
	}
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getRg() != null;
	  @ requires funcionario.getSalario() >= 0; @*/
	public void atualizarSalario(IFuncionario funcionario){
		iDaoFuncionario.atualizarSalario(funcionario);
	}
	
	/*@ 
	  @ requires rg != null;
	  @ ensures \result != null; @*/
	public String buscarRg (String rg){
		return iDaoFuncionario.buscarRg(rg);
	}
	
	/*@
	  @ requires id > 0;
	  @ ensures \result > 0 
	  @ 	|| \result == -1;@*/
	public int buscarIdVenda (int id) {
		return iDaoVendas.buscarIdVenda(id);
	}
	
	/*@ requires rg != null; @*/
	public void apagarFuncionario(String rg){
		iDaoFuncionario.apagarFuncionario(rg);
	}
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getRg() != null; @*/
	public void apagarFuncionario(IFuncionario funcionario){
		iDaoFuncionario.apagarFuncionario(funcionario.getRg());
	}
	
	/*@ requires true;
	  @ ensures \result != null; @*/
	public List listarFuncionarios(){
		return iDaoFuncionario.listarFuncionario();
	}
	
	/*@ requires rg != null;
	  @ ensures \result != null; @*/
	public IFuncionario buscarFuncionario(String rg){
		return iDaoFuncionario.buscarFuncionario(rg);
	}
	
	
	//Metodos CRUD Mercadorias
	/*@ requires mercadoria != null;
	  @ requires mercadoria.getNome() != null;
	  @ requires mercadoria.getPreco() >= 0; 
	  @ requires mercadoria.getCor() != null; 
	  @ requires mercadoria.getTamanho() != null; 
	  @ requires mercadoria.getProduto() != null; @*/
	public void criarMercadoria(IMercadoria mercadoria){
		iDaoMercadoria.criarMercadoria(mercadoria);
	}
	
	/*@ requires mercadoria != null;
	  @ requires mercadoria.getID() > 0;
	  @ requires mercadoria.getNome() != null;
	  @ requires mercadoria.getPreco() >= 0; 
	  @ requires mercadoria.getCor() != null; 
	  @ requires mercadoria.getTamanho() != null; 
	  @ requires mercadoria.getProduto() != null; @*/
	public void editarMercadoria(IMercadoria mercadoria){
		iDaoMercadoria.editarMercadoria(mercadoria);
	}
	
	/*@ requires ID > 0; @*/
	public void apagarMercadoria(int ID){
		iDaoMercadoria.apagarMercadoria(ID);
	}
	
	/*@ requires mercadoria != null;
	  @ requires mercadoria.getID() > 0; @*/
	public void apagarMercadoria(IMercadoria mercadoria){
		iDaoMercadoria.apagarMercadoria(mercadoria.getID());
	}
	
	/*@ requires true;
	  @ ensures \result != null; @*/
	public List listarMercadorias(){
		return iDaoMercadoria.listarMercadorias();
	}
	
	/*@ requires ID > 0;
	  @ ensures \result != null; @*/
	public IMercadoria buscarMercadoria(int ID){
		return iDaoMercadoria.buscarMercadoria_ID(ID);
	}
	
	//Metodos CRUD Vendas
	/*@ requires venda != null;
	  @ requires venda.getSubtotal() >= 0;
	  @ requires venda.getVendedorRG() != null; 
	  @ requires venda.getDataVenda() != null;
	  @ requires venda.getQtdVendas() >= 0; @*/
	public void criarVenda (IVenda venda) {
		iDaoVendas.criarVenda(venda);
	}
	
	/*@ requires venda != null;
	  @ requires venda.getID() > 0;
	  @ requires venda.getSubtotal() >= 0;
	  @ requires venda.getVendedorRG() != null; 
	  @ requires venda.getDataVenda() != null;
	  @ requires venda.getQtdVendas() >= 0; @*/
	public void editarVenda(IVenda venda) {
		iDaoVendas.editarVenda(venda);
	}
	
	/*@
	  @ requires id > 0; @*/
	public void apagarVenda(int  id) {
		iDaoVendas.apagarVenda(id);
	}
	
	/*@
	  @ requires venda != null; 
	  @ requires venda.getID() > 0; @*/
	public void apagarVenda(IVenda venda) {
		iDaoVendas.apagarVenda(venda.getID());
	}
	
	/*@ 
	  @ requires true;
	  @ ensures \result != null; @*/
	public List listarVendas() {
		return iDaoVendas.listarVendas();
	}
	
	/*@ 
	  @ requires ID > 0;
	  @ ensures \result != null; @*/
	public IVenda buscarVenda(int ID) {
		return iDaoVendas.buscarVenda(ID);
	}

}
 
