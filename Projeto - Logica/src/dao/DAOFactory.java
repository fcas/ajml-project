package dao;

public abstract class DAOFactory {

	public static final int MYSQL = 0;
	
	public abstract DAOFuncionario createDAOFuncionario (); 
	public abstract DAOMercadoria createDAOMercadoria ();
	
	public static DAOFactory createDAOFactory(int whichFactory) {
	
		 switch (whichFactory) {
		    case MYSQL: 
		        return new MySQLDAOFactory();
		 } 
		 return null;

	}

}