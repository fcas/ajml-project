package models.funcionario;

import dao.Funcionario;

public class Estoquista extends Funcionario {
 
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public void setRg(String rg) {
		super.setRg(rg);
	}

	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}

	@Override
	public void setDataNascimento(String dataNascimento) {
		super.setDataNascimento(dataNascimento);
	}

	@Override
	public void setCargo(String cargo) {
		super.setCargo(cargo);
	}

	@Override
	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
}
 
