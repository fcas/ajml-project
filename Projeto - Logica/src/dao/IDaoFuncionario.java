package dao;

import java.util.List;

import models.funcionario.IFuncionario;

public interface IDaoFuncionario {
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public void criarFuncionario (IFuncionario funcionario);
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public void editarFuncionario(IFuncionario funcionario);
	
	/*@ 
	  @ requires rg != null; @*/
	public void apagarFuncionario(String rg);
	
	/*@ requires true;
	  @ ensures \result != null; @*/
	
	/* ensures (\forall int i; 0 <= i && i < \result.size(); \result.get(i) != null);*/
	public List listarFuncionario();
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getRg() != null;
	  @ requires funcionario.getSalario() >= 0; @*/
	public void atualizarSalario(IFuncionario funcionario);

	/*@ requires rg != null;
	  @ ensures \result != null; @*/
	public IFuncionario buscarFuncionario(String rg);
	
	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0; @*/
	public int quantidadeVendas(IFuncionario funcionario);
	
	/*@ requires rg != null; 
	  @ ensures true;@*/
	public String buscarRg (String rg);
	
	/*@
	  @ requires rg != null;
	  @ requires rg.length() == 9; @*/
	public boolean checaRg (String rg);

	/*@ requires funcionario != null;
	  @ requires funcionario.getNome() != null;
	  @ requires funcionario.getRg() != null; 
	  @ requires funcionario.getCpf() != null; 
	  @ requires funcionario.getDataNascimento() != null; 
	  @ requires funcionario.getCargo() != null; 
	  @ requires funcionario.getSalario() >= 0;
	  @ ensures \result >= 0; @*/
	public double buscarSalario(IFuncionario funcionario);
	 
}
 
