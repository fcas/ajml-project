package models.funcionario;


public class Estoquista extends Funcionario {
	
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
	  @
	  @ public constraint
	  @ \old(salario) <= salario; @*/
	
	/*@
	  @ assignable ID, subtotal, vendedorRG, dataVenda, qtdVendas;
	  @ ensures cargo.equals("")
	  @ 		&& cpf.equals("")
	  @ 		&& dataNascimento.equals("")
	  @ 		&& nome.equals("")
	  @ 		&& rg.equals("")
	  @ 		&& salario == 0; @*/
	public Estoquista() {
		this.cargo = "";
		this.cpf = "";
		this.dataNascimento ="";
		this.nome = ""; 
		this.rg = ""; 
		this.salario = 0;  
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
 
