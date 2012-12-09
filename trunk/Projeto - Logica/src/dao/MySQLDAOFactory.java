package dao;

public class MySQLDAOFactory extends DAOFactory {

	DAOFuncionario daoFuncionario;
	DAOMercadoria daoMercadoria;
	DAOVendas daoVendas;
	
	public DAOFuncionario createDAOFuncionario() {
		daoFuncionario = new DAOFuncionario();
		return daoFuncionario;
	}
	
	public DAOMercadoria createDAOMercadoria() {
		daoMercadoria = new DAOMercadoria();
		return daoMercadoria;
	}
	
	public DAOVendas createDAOVendas() {
		daoVendas = new DAOVendas();
		return daoVendas;
	}
	

}