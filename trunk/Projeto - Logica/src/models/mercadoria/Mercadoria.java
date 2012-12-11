package models.mercadoria;

public class Mercadoria implements IMercadoria {
 
	private /*@ spec_public @*/ double preco; //@ in ipreco;
	/*@ protected represents
	  @ ipreco = preco; @*/

	private /*@ spec_public @*/ int ID; //@ in iID;
	/*@ protected represents
	  @ iID = ID; @*/

	private /*@ spec_public @*/ String nome; //@ in inome;
	/*@ protected represents
	  @ inome = nome; @*/
	
	private /*@ spec_public @*/ String cor; //@ in icor;
	/*@ protected represents
	  @ icor = cor; @*/
	
	private /*@ spec_public @*/ String tamanho; //@ in itamanho;
	/*@ protected represents
	  @ itamanho = tamanho; @*/
	
	private /*@ spec_public @*/ String produto;//@ in iproduto;
	/*@ protected represents
	  @ iproduto = produto; @*/

	/*@ also
	  @ ensures \result == preco; @*/
	public /*@ pure @*/ double getPreco() {
		return preco;
	}

	/*@ also
  	  @ ensures \result == ID;@*/
	public int getID() {
		return ID;
	}
	
	/*@ also
	  @ ensures \result == nome;@*/
	public String getNome() {
		return nome;
	}
	
	/*@ also
	  @ ensures \result == cor;@*/
	public String getCor() {
		return cor;
	}

	/*@ also
	  @ ensures \result == tamanho;@*/
	public String getTamanho() {
		return tamanho;
	}
	
	/*@  also
	  @ ensures \result == produto;@*/
	public String getProduto() {
		return produto;
	}
	
	
	/*@  also
	  @ requires novoPreco > 0;
	  @ assignable preco;
	  @ ensures preco == novoPreco; @*/
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;	
	}
	
	/*@  also
	  @ requires novoNome != null;
	  @ assignable nome;
	  @ ensures nome == novoNome; @*/
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	/*@  also
	  @ requires novaCor != null;
	  @ assignable cor;
	  @ ensures cor == novaCor; @*/
	public void setCor(String novaCor) {
		this.cor = novaCor;
	}

	/*@  also
	  @ requires novoTamanho.equalsIgnoreCase("P")
	  @           || novoTamanho.equalsIgnoreCase("M")
	  @           || novoTamanho.equalsIgnoreCase("G")
	  @           || novoTamanho.equalsIgnoreCase("GG");
	  @ assignable tamanho;
	  @ ensures tamanho == novoTamanho; @*/
	public void setTamanho(String novoTamanho) {
		this.tamanho = novoTamanho;
	}

	/*@  also
	  @ requires novoProduto != null;
	  @ assignable produto;
	  @ ensures produto == novoProduto; @*/
	public void setProduto(String novoProduto) {
		this.produto = produto;
	}
}
 
