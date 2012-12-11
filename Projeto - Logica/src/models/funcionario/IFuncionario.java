package models.funcionario;

public interface IFuncionario {
	//@ public model instance String nome;
	//@ public model instance String rg;
	//@ public model instance String cpf;
	//@ public model instance String dataNascimento;
	//@ public model instance String cargo;
	//@ public model instance double salario;
 
	public String getNome();
	
	public void setNome(String nome);

	public String getRg();

	public void setRg(String rg);

	public String getCpf();

	public void setCpf(String cpf);

	public String getDataNascimento();

	public void setDataNascimento(String dataNascimento);

	public String getCargo();

	public void setCargo(String cargo);
	
	public void setSalario(double salario); 
	
	public double getSalario();
	
}
 
