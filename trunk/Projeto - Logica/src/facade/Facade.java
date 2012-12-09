package facade;

import java.util.List;

import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;
import models.mercadoria.IMercadoria;
import models.mercadoria.Mercadoria;
import dao.DAOFuncionario;
import dao.DAOMercadoria;
import dao.IDaoFuncionario;
import dao.IDaoMercadoria;

public class Facade {
 
	private IDaoFuncionario iDaoFuncionario;
	private IDaoMercadoria iDaoMercadoria;
	
	public Facade() {
		this.iDaoMercadoria = new DAOMercadoria();
		this.iDaoFuncionario = new DAOFuncionario();
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
	
	public List<IMercadoria> listarMercadoria(){
		return iDaoMercadoria.listarMercadorias();
	}
	
	public IMercadoria buscarMercadoria(String ID){
		return iDaoMercadoria.buscarMercadoria_ID(ID);
	}
}
 
