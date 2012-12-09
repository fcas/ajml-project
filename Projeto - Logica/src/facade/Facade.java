package facade;

import java.util.List;

import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;
import models.mercadoria.IMercadoria;
import models.mercadoria.Mercadoria;
import models.venda.IVenda;
import dao.DAOFactory;
import dao.IDaoFuncionario;
import dao.IDaoMercadoria;
import dao.IDaoVendas;

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
	
	
	//Metodos CRUD Funcionarios
	public void criarFuncionario(Funcionario funcionario){
		iDaoFuncionario.criarFuncionario(funcionario);
	}
	
	public void editarFuncionario(Funcionario funcionario){
		iDaoFuncionario.editarFuncionario(funcionario);
	}
	
	public void apagarFuncionario(String rg){
		iDaoFuncionario.apagarFuncionario(rg);
	}
	
	public void apagarFuncionario(Funcionario funcionario){
		iDaoFuncionario.apagarFuncionario(funcionario.getRg());
	}
	
	public List<IFuncionario> listarFuncionarios(){
		return iDaoFuncionario.listarFuncionario();
	}
	
	public IFuncionario buscarFuncionario(String rg){
		return iDaoFuncionario.buscarFuncionario(rg);
	}
	
	
	//Metodos CRUD Mercadorias
	public void criarMercadoria(Mercadoria mercadoria){
		iDaoMercadoria.criarMercadoria(mercadoria);
	}
	
	public void editarMercadoria(Mercadoria mercadoria){
		iDaoMercadoria.editarMercadoria(mercadoria);
	}
	
	public void apagarMercadoria(String ID){
		iDaoMercadoria.apagarMercadoria(ID);
	}
	
	public void apagarMercadoria(Mercadoria mercadoria){
		iDaoMercadoria.apagarMercadoria(mercadoria.getID());
	}
	
	public List<IMercadoria> listarMercadorias(){
		return iDaoMercadoria.listarMercadorias();
	}
	
	public IMercadoria buscarMercadoria(String ID){
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
	
	public List<IVenda> listarVendas() {
		return iDaoVendas.listarVendas();
	}
	
	public IVenda buscarVenda(int ID) {
		return iDaoVendas.buscarVenda(ID);
	}


}
 
