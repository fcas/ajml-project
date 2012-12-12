package models.funcionario;

public interface IFuncionario {
	//@ public model instance nullable String inome;
	//@ public model instance nullable String irg;
	//@ public model instance nullable String icpf;
	//@ public model instance nullable String idataNascimento;
	//@ public model instance nullable String icargo;
	//@ public model instance double isalario;
 
	/*@
	  @ ensures \result == inome; @*/
	public /*@ pure @*/ String getNome();
	
	/*@
	  @ ensures \result == irg; @*/
	public /*@ pure @*/ String getRg();

	/*@
	  @ ensures \result == icpf; @*/
	public /*@ pure @*/ String getCpf();

	/*@
	  @ ensures \result == idataNascimento; @*/
	public /*@ pure @*/ String getDataNascimento();

	/*@
	  @ ensures \result == icargo; @*/
	public /*@ pure @*/ String getCargo();

	/*@
	  @ ensures \result == isalario; @*/
	public /*@ pure @*/ double getSalario();

	
	/*@
	  @ requires novoNome != null;
	  @ assignable inome;
	  @ ensures inome == novoNome; @*/
	public void setNome(String novoNome);

	/*@
	  @ requires novoRg != null;
	  @ assignable irg;
	  @ ensures irg == novoRg; @*/
	public void setRg(String novoRg);

	/*@
	  @ requires novoCpf != null;
	  @ assignable icpf;
	  @ ensures icpf == novoCpf; @*/
	public void setCpf(String novoCpf);

	/*@
	  @ requires novaDataNascimento != null;
	  @ assignable idataNascimento;
	  @ ensures idataNascimento == novaDataNascimento; @*/
	public void setDataNascimento(String novaDataNascimento);

	/*@
	  @ requires novoCargo != null;
	  @ assignable icargo;
	  @ ensures icargo == novoCargo; @*/
	public void setCargo(String novoCargo);
	
	/*@
	  @ requires novoSalario >= 0;
	  @ assignable isalario;
	  @ ensures isalario == novoSalario; @*/
	public void setSalario(double novoSalario);
	
}
 
