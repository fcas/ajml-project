package models.funcionario;


public class Gerente extends Funcionario {
	 
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
		 @ ensures cargo.equals("Gerente"); @*/
		public void setCargo(String cargo) {
			super.setCargo(cargo);
		}

		
		public void setSalario(double salario) {
			
		}

		
		public double getSalario() {
			
			return 0;
		}
	 
}
 
