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
			super.setSalario(salario);
		}
		
		
	 
}
 
