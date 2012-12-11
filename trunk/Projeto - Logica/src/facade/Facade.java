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
 
	private IDaoFuncionario iDaoFuncionario;
	private IDaoMercadoria iDaoMercadoria;
	private IDaoVendas iDaoVendas;
	private DAOFactory DaoFactory;
	
	public Facade(int whichFactory) {
		this.DaoFactory = DAOFactory.createDAOFactory(whichFactory);
		this.iDaoMercadoria = this.DaoFactory.createDAOMercadoria();
		this.iDaoFuncionario = this.DaoFactory.createDAOFuncionario();
		this.iDaoVendas = this.DaoFactory.createDAOVendas();
	}
	
	
	//Metodos CRUD Funcionario:
	public void criarFuncionario(IFuncionario funcionario){
		iDaoFuncionario.criarFuncionario(funcionario);
	}
	
	public void editarFuncionario(IFuncionario funcionario){
		iDaoFuncionario.editarFuncionario(funcionario);
	}
	
	public double buscarSalario(IFuncionario funcionario){
		return iDaoFuncionario.buscarSalario(funcionario);
	}
	
	public int quantidadeVendas(IFuncionario funcionario){
		return iDaoFuncionario.quantidadeVendas(funcionario);
	}
	
	public void atualizarSalario(IFuncionario funcionario){
		iDaoFuncionario.atualizarSalario(funcionario);
	}
	
	public void apagarFuncionario(String rg){
		iDaoFuncionario.apagarFuncionario(rg);
	}
	
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
 
