package models.funcionario;


public class Vendedor extends Funcionario {
	
		private /*@ spec_public @*/ int quantidadeVendas; 
		
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
		  @ public invariant quantidadeVendas >= 0;
		  @ public initially quantidadeVendas == 0;
		  @
		  @ public constraint
		  @ \old(salario) <= salario;
		  @*/
		
		
		/*@
		  @ assignable ID, subtotal, vendedorRG, dataVenda, qtdVendas;
		  @ ensures cargo.equals("")
		  @ 		&& cpf.equals("")
		  @ 		&& dataNascimento.equals("")
		  @ 		&& nome.equals("")
		  @ 		&& rg.equals("")
		  @ 		&& salario == 0
		  @ 		&& quantidadeVendas == 0; @*/
		public Vendedor() {
			this.cargo = "";
			this.cpf = "";
			this.dataNascimento ="";
			this.nome = ""; 
			this.rg = ""; 
			this.salario = 0; 
			this.quantidadeVendas = 0;
		}
		
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
 
