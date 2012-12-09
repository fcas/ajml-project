package ui;

import java.util.ArrayList;
import java.util.List;

import dao.DAOFactory;
import dao.DAOFuncionario;
import models.funcionario.Funcionario;
import models.funcionario.IFuncionario;

public class Main {
	
	public static void main(String[] args) {
		IFuncionario funcionario = new Funcionario();
		
//		Face
		
		funcionario.setNome("Felipe");
		funcionario.setRg("495024399");
		funcionario.setCpf("38584881867");
		funcionario.setDataNascimento("04/02/1991");
		funcionario.setCargo("Caixa");
		funcionario.setSalario(25);
		
		 DAOFactory mysqlFactory = DAOFactory.createDAOFactory(0);
		 DAOFuncionario daoF = mysqlFactory.createDAOFuncionario();
		
		 daoF.criarFuncionario(funcionario);
		 funcionario.setNome("Rodrigo"); 
		 
		 List<IFuncionario> l = new ArrayList<IFuncionario>();
		 

		 l = daoF.listarFuncionario();
		 
		 for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getNome());
		}
		
	}
 
}
 
