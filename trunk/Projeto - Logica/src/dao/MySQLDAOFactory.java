package dao;

public class MySQLDAOFactory extends DAOFactory {

	DAOFuncionario daoFuncionario;
	DAOMercadoria daoMercadoria;
	
	public DAOFuncionario createDAOFuncionario() {
		daoFuncionario = new DAOFuncionario();
		return daoFuncionario;
	}
	
	public DAOMercadoria createDAOMercadoria() {
		daoMercadoria = new DAOMercadoria();
		return daoMercadoria;
	}
	

}