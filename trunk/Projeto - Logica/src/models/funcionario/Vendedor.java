package models.funcionario;


public class Vendedor extends Funcionario {
	 
		private int quantidadeVendas = 0; 
		
		public int getQuantidadeVendas() {
			return quantidadeVendas;
		}
		
		public void setQuantidadeVendas(int quantidadeVendas) {
			this.quantidadeVendas = quantidadeVendas;
		}
		
		public void incrementarQtdVendas(){
			quantidadeVendas++;
		}
	
		
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

		
		public void setCargo(String cargo) {
			super.setCargo(cargo);
		}

		
		public void setSalario(double salario) {
			super.setSalario(salario);
		}
		
		
	 
}
 
