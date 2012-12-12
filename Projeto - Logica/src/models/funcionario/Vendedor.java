package models.funcionario;


public class Vendedor extends Funcionario {
	 
		private /*@ spec_public @*/ int quantidadeVendas = 0; 
		
		/*@
		  @ public invariant quantidadeVendas >= 0; @*/
		
		/*@
		  @ ensures \result == quantidadeVendas; @*/
		public /*@ pure @*/ int getQuantidadeVendas() {
			return quantidadeVendas;
		}
		
		/*@ requires novaQuantidadeVendas > 0;
		  @ ensures quantidadeVendas == novaQuantidadeVendas; @*/
		public void setQuantidadeVendas(int novaQuantidadeVendas) {
			this.quantidadeVendas = novaQuantidadeVendas;
		}
		
		/*@
		  @ ensures quantidadeVendas == \old(quantidadeVendas) + 1;@*/
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
		
		/*@
		 @ also
		 @ ensures cargo.equals("Vendedor"); @*/
		public void setCargo(String cargo) {
			super.setCargo(cargo);
		}

		public void setSalario(double salario) {
			super.setSalario(salario);
		}

}
 
