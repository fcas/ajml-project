package dao;

import java.util.List;

import models.funcionario.IFuncionario;

public interface IDaoFuncionario {
 
	public void criarFuncionario (IFuncionario funcionario);
	public void editarFuncionario(IFuncionario funcionario);
	public void apagarFuncionario(String rg);
	public List<IFuncionario> listarFuncionario();
	public IFuncionario buscarFuncionario(String rg);
	 
}
 
