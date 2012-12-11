package dao;

public class MySQLDAOFactory extends DAOFactory {

	/*@ nullable @*/DAOFuncionario daoFuncionario;
	/*@ nullable @*/DAOMercadoria daoMercadoria;
	/*@ nullable @*/DAOVendas daoVendas;
	
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