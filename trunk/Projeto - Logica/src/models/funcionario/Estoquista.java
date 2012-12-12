package models.funcionario;


public class Estoquista extends Funcionario {
 
	
	public void setNome(String nome) {
		super.setNome(nome);
	}

	
	public void setRg(String rg) {
		super.setRg(rg);
	}

	
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}

	
	public void setDataNascimento(String dataNascimento) {
		super.setDataNascimento(dataNascimento);
	}

	/*@
	 @ also
	 @ ensures cargo.equals("Estoquista"); @*/
	public void setCargo(String cargo) {
		super.setCargo(cargo);
	}

	
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		
	}

	
	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
}
 
