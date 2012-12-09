package models.mercadoria;

public class Mercadoria implements IMercadoria {
 
	private double preco; //@ in ipreco;
	/*@ protected represents
	 @ ipreco = preco; @*/

	private String ID; //@ in iID;
	/*@ protected represents
	 @ iID = ID; @*/

	private String nome; //@ in inome;
	/*@ protected represents
	 @ inome = nome; @*/
	
	private String cor; //@ in icor;
	/*@ protected represents
	 @ icor = nome; @*/
	
	
	private String tamanho; //@ in itamanho;
	/*@ protected represents
	 @ itamanho = nome; @*/
	
	private String produto;
	
	
	public String getProduto() {
		return produto;
	}

	//@ ensures \result == preco;
	public /*@ pure @*/ double getPreco() {
		return preco;
	}

	//@ ensures \result == ID;
	public String getID() {
		return ID;
	}
	
	//@ ensures \result == nome;
	public String getNome() {
		return nome;
	}
	
	public String getCor() {
		return cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	//@ ensures ID == novoID;
	public void setID(String novoID) {
		this.ID = novoID;
	}
	
	//@ ensures preco == novoPreco;
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;	
	}
	
	//@ ensures nome == novoNome
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	//@ ensures cor == novaCor
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}

	//@ ensures tamanho == novoTamanho
	public void setTamanho(String novoTamanho) {
		this.tamanho = novoTamanho;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
}
 
