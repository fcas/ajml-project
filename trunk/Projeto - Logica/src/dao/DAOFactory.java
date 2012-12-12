package dao;

public abstract class DAOFactory {

	public static final int MYSQL = 0;
	
	/*@
	  @ public invariant MYSQL == 0; @*/
	
	public abstract DAOFuncionario createDAOFuncionario ();
	
	public abstract DAOMercadoria createDAOMercadoria ();
	
	public abstract DAOVendas createDAOVendas();
	
	
	/*@ 	behavior
	  @ requires whichFactory == 0;
	  @ ensures true;
	  @
	  @ also
	  @
	  @ 	behavior
	  @ requires whichFactory != 0;
	  @ ensures \result == null; @*/
	public static DAOFactory createDAOFactory(int whichFactory) {
	
		 switch (whichFactory) {
		    case MYSQL:
		        return new MySQLDAOFactory();
	        default:
	        	return null;
		 } 
		 

	}

}