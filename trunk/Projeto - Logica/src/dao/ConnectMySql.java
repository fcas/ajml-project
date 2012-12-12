package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectMySql {
	
	public static final int MYSQL = 0;
	private static final String MySQLDriver = "com.mysql.jdbc.Driver";
	
	/*@ public invariant MYSQL == 0;
	  @ public invariant MySQLDriver.equals("com.mysql.jdbc.Driver"); @*/

	/*@ 	normal_behavior
	  @ requires url != null;
	  @ requires nome != null;
	  @ requires senha != null;
	  @ requires banco == 0;
	  @ ensures MYSQL == 0;
	  @ 
	  @ also 
	  @
	  @ 	exceptional_behavior
	  @ requires banco == 0;
	  @ signals_only SQLException; @*/
	public static Connection conexao(String url, String nome, String senha,
			int banco)  throws ClassNotFoundException, SQLException {

		switch (banco) {
			case MYSQL:
				Class.forName(MySQLDriver);
				break;
		}
		return DriverManager.getConnection(url, nome, senha);
	}
}

