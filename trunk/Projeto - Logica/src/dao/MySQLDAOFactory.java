package dao;

public class MySQLDAOFactory extends DAOFactory {

	private /*@ spec_public nullable @*/ DAOFuncionario daoFuncionario;
	private /*@ spec_public nullable @*/ DAOMercadoria daoMercadoria;
	private /*@ spec_public nullable @*/ DAOVendas daoVendas;
	
	/*@ also
	  @ ensures daoFuncionario != null;
	  @ ensures \result == daoFuncionario; @*/
	public DAOFuncionario createDAOFuncionario() {
		daoFuncionario = new DAOFuncionario();
		return daoFuncionario;
	}
	
	/*@ also
	  @ ensures daoMercadoria != null;
	  @ ensures \result == daoMercadoria; @*/
	public DAOMercadoria createDAOMercadoria() {
		daoMercadoria = new DAOMercadoria();
		return daoMercadoria;
	}
	
	/*@ also
	  @ ensures daoVendas != null;
	  @ ensures \result == daoVendas; @*/
	public DAOVendas createDAOVendas() {
		daoVendas = new DAOVendas();
		return daoVendas;
	}
	

}