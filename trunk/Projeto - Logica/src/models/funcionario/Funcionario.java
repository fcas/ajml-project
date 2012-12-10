package models.funcionario;


public class Funcionario extends AbstractFuncionario {

	private String nome;
	private String rg; 
	private String cpf; 
	private String dataNascimento; 
	private String cargo; 
	private double salario;
	
	
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

	@Override
	public void setSalario(double salario) {
		this.salario = salario;	
	}

	@Override
	public double getSalario() {
		return salario;
	}

}
