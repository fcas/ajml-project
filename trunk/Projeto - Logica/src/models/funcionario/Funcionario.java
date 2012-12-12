package models.funcionario;


public class Funcionario implements IFuncionario {
	
	protected /*@ nullable spec_public @*/ String nome;//@ in inome;
	/*@ protected represents
	  @ inome = nome; @*/
	
	protected /*@ nullable spec_public @*/ String rg; //@ in irg;
	/*@ protected represents
	  @ irg = rg; @*/
	
	protected /*@ nullable spec_public @*/ String cpf; //@ in icpf;
	/*@ protected represents
	  @ icpf = cpf; @*/
	
	protected /*@ nullable spec_public @*/ String dataNascimento; //@ in idataNascimento;
	/*@ protected represents
	  @ idataNascimento = dataNascimento; @*/
	
	protected /*@ nullable spec_public @*/ String cargo; //@ in icargo;
	/*@ protected represents
	  @ icargo = cargo; @*/
	
	protected /*@ spec_public @*/ double salario;//@ in isalario;
	/*@ protected represents
	  @ isalario = salario; @*/
	
	/*@
	  @ public initially cargo.equals("")
	  @ 			&& cpf.equals("")
	  @ 			&& dataNascimento.equals("")
	  @ 			&& nome.equals("")
	  @ 			&& rg.equals("")
	  @ 			&& salario == 0;
	  @
	  @ public invariant cargo != null
	  @ 			&& cpf != null
	  @ 			&& dataNascimento != null
	  @ 			&& nome != null
	  @ 			&& rg != null
	  @ 			&& salario >= 0;
	  @ public invariant cpf.length() <= 11;
	  @ public invariant rg.length() <= 9;
	  @
	  @ public constraint
	  @ \old(salario) <= salario; @*/
	
	
	/*@
	  @ assignable ID, subtotal, vendedorRG, dataVenda, qtdVendas;
	  @ ensures cargo.equals("")
	  @ 		&& cpf.equals("")
	  @ 		&& dataNascimento.equals("")
	  @ 		&& nome.equals("")
	  @ 		&& rg.equals("")
	  @ 		&& salario == 0; @*/
	public Funcionario() {
		this.cargo = "";
		this.cpf = "";
		this.dataNascimento ="";
		this.nome = ""; 
		this.rg = ""; 
		this.salario = 0;  
	}
	
	public /*@ pure @*/ String getNome() {
		return nome;
	}

	public /*@ pure @*/ String getRg() {
		return rg;
	}

	public /*@ pure @*/ String getCpf() {
		return cpf;
	}

	public /*@ pure @*/ String getDataNascimento() {
		return dataNascimento;
	}

	public /*@ pure @*/ String getCargo() {
		return cargo;
	}

	public /*@ pure @*/ double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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

}
