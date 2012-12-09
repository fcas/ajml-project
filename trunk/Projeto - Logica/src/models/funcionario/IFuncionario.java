package models.funcionario;

public interface IFuncionario {
 
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
 
