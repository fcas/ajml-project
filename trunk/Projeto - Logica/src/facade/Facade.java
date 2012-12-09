package facade;

import models.funcionario.IFuncionario;
import models.mercadoria.IMercadoria;
import dao.IDaoFuncionario;
import dao.IDaoMercadoria;

public class Facade {
 
	private IDaoFuncionario iDaoFuncionario;
	private IDaoMercadoria iDaoMercadoria;
	private IFuncionario iFuncionario; 
	private IMercadoria iMercadoria;

}
 
