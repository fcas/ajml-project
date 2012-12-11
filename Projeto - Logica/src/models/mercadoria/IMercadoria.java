package models.mercadoria;

public interface IMercadoria {
	//@ public model instance double ipreco;
	//@ public model instance String iID;
	//@ public model instance String inome;
	//@ public model instance String icor;
	//@ public model instance String itamanho;
	//@ public model instance String iproduto;

	/*@
	  @ ensures \result == ipreco; @*/
	public /*@ pure @*/double getPreco();

	/*@
	  @ ensures \result == iID; @*/
	public /*@ pure @*/ int getID();

	/*@
	  @ ensures \result == inome; @*/
	public /*@ pure @*/ String getNome();

	/*@
	  @ ensures \result == icor; @*/
	public /*@ pure @*/ String getCor();

	/*@
	  @ ensures \result == itamanho; @*/
	public /*@ pure @*/ String getTamanho();
	
	/*@
	  @ ensures \result == iproduto; @*/
	public /*@ pure @*/ String getProduto();

	/*@
	  @ requires novoPreco >= 0;
	  @ assignable ipreco;
	  @ ensures ipreco == novoPreco; @*/
	public void setPreco(double novoPreco);

	/*@
	  @ requires novoNome != null;
	  @ assignable inome; 
	  @ ensures inome == novoNome; @*/
	public void setNome(String novoNome);

	/*@
	  @ requires novaCor != null;
	  @ assignable icor;
	  @ ensures icor == novaCor; @*/
	public void setCor(String novaCor);

	/*@
	  @ requires novoTamanho.equalsIgnoreCase("P")
	  @           || novoTamanho.equalsIgnoreCase("M")
	  @           || novoTamanho.equalsIgnoreCase("G")
	  @           || novoTamanho.equalsIgnoreCase("GG");
	  @ assignable itamanho;
	  @ ensures itamanho == novoTamanho; @*/
	public void setTamanho(String novoTamanho);
	
	/*@
	  @ requires novoProduto != null;
	  @ assignable iproduto;
	  @ ensures iproduto == novoProduto; @*/
	public void setProduto(String novoProduto);
}
