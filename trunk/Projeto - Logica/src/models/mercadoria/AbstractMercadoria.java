package models.mercadoria;

public abstract class AbstractMercadoria implements InterfaceMercadoria {
 
	private double preco; //@ in ipreco;
	/*@ protected represents
	 @ ipreco = preco; @*/

	private String ID; //@ in iID;
	/*@ protected represents
	 @ iID = ID; @*/

	private String nome; //@ in inome;
	/*@ protected represents
	 @ inome = nome; @*/
	
	
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
	
	
}
 
