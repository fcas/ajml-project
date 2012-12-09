package ui;

import dao.DAOFactory;
import dao.DAOFuncionario;
import models.funcionario.AbstractFuncionario;
import models.funcionario.InterfaceFuncionario;

public class Main {
	
	public static void main(String[] args) {
		InterfaceFuncionario funcionario = new AbstractFuncionario();
		
		funcionario.setNome("Felipe");
		funcionario.setRg("495024399");
		funcionario.setCpf("38584881867");
		funcionario.setDataNascimento("04/02/1991");
		funcionario.setCargo("Caixa");
		
		 DAOFactory mysqlFactory = DAOFactory.createDAOFactory(0);
		 DAOFuncionario daoF = mysqlFactory.createDAOFuncionario();
		
		 daoF.criarFuncionario(funcionario);
		
	}
 
}
 
