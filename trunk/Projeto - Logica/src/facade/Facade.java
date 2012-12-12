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
	
	public String buscarRg (String rg){
		return iDaoFuncionario.buscarRg(rg);
	}
	
	public int buscarId (int id) {
		return iDaoVendas.buscarId(id);
	}
	
	public void apagarFuncionario(String rg){
		iDaoFuncionario.apagarFuncionario(rg);
	}
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getRg() != null; @*/
	public void apagarFuncionario(IFuncionario funcionario){
		iDaoFuncionario.apagarFuncionario(funcionario.getRg());
	}
	
	public List listarFuncionarios(){
		return iDaoFuncionario.listarFuncionario();
	}
	
	public IFuncionario buscarFuncionario(String rg){
		return iDaoFuncionario.buscarFuncionario(rg);
	}
	
	
	//Metodos CRUD Mercadorias
	public void criarMercadoria(IMercadoria mercadoria){
		iDaoMercadoria.criarMercadoria(mercadoria);
	}
	
	public void editarMercadoria(IMercadoria mercadoria){
		iDaoMercadoria.editarMercadoria(mercadoria);
	}
	
	public void apagarMercadoria(int ID){
		iDaoMercadoria.apagarMercadoria(ID);
	}
	
	public void apagarMercadoria(IMercadoria mercadoria){
		iDaoMercadoria.apagarMercadoria(mercadoria.getID());
	}
	
	public List listarMercadorias(){
		return iDaoMercadoria.listarMercadorias();
	}
	
	public IMercadoria buscarMercadoria(int ID){
		return iDaoMercadoria.buscarMercadoria_ID(ID);
	}
	
	//Metodos CRUD Vendas
	public void criarVenda (IVenda venda) {
		iDaoVendas.criarVenda(venda);
	}
	
	public void editarVenda(IVenda venda) {
		iDaoVendas.editarVenda(venda);
	}
	
	public void apagarVenda(int  id) {
		iDaoVendas.apagarVenda(id);
	}
	
	public void apagarVenda(IVenda venda) {
		iDaoVendas.apagarVenda(venda.getID());
	}
	
	public List listarVendas() {
		return iDaoVendas.listarVendas();
	}
	
	public IVenda buscarVenda(int ID) {
		return iDaoVendas.buscarVenda(ID);
	}

}
 
