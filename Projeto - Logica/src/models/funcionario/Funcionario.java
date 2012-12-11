package models.funcionario;


public class Funcionario extends AbstractFuncionario {

	private /*@ spec_public @*/ String nome;//@ in inome;
	/*@ protected represents
	  @ inome = nome; @*/
	
	private /*@ spec_public @*/ String rg; //@ in irg;
	/*@ protected represents
	  @ irg = rg; @*/
	
	private /*@ spec_public @*/ String cpf; //@ in icpf;
	/*@ protected represents
	  @ icpf = cpf; @*/
	
	private /*@ spec_public @*/ String dataNascimento; //@ in idataNascimento;
	/*@ protected represents
	  @ icargo = dataNascimento; @*/
	
	private /*@ spec_public @*/ String cargo; //@ in icargo;
	/*@ protected represents
	  @ icargo = cargo; @*/
	
	private /*@ spec_public @*/ double salario;//@ in isalario;
	/*@ protected represents
	  @ isalario = salario; @*/
	
	//TODO AJEITAR INVARIANTE!!!
	/*@ public invariant true;
	  @ public constraint
	  @ \old(salario) <= salario; @*/
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/*@ also
	  @ requires novoSalario >= 0;
	  @ ensures salario == novoSalario;
	  @ ensures_redundantly \old(salario) <= salario; @*/
	public void setSalario(double novoSalario) {
		this.salario = novoSalario;	
	}

	
	public double getSalario() {
		return salario;
	}

}
