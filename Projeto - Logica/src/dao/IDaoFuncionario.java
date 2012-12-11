package dao;

import java.util.List;

import models.funcionario.IFuncionario;

public interface IDaoFuncionario {
 
	public void criarFuncionario (IFuncionario funcionario);
	public void editarFuncionario(IFuncionario funcionario);
	public void apagarFuncionario(String rg);
	public List listarFuncionario();
	public IFuncionario buscarFuncionario(String rg);
	public void atualizarSalario(IFuncionario funcionario);
	public int quantidadeVendas(IFuncionario funcionario);
	public double buscarSalario(IFuncionario funcionario);
	 
}
 
