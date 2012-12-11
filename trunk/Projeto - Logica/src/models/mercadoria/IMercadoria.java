package models.mercadoria;

public interface IMercadoria {
	// @ public model instance double ipreco;
	// @ public model instance String iID;
	// @ public model instance String inome;
	// @ public model instance String icor;
	// @ public model instance String itamanho;

	/*@
	  @ requires preco >= 0;
	  @ ensures ipreco == novoPreco; @*/
	
	public void setPreco(double novoPreco);

	public double getPreco();

	public void setID(int id);

	public int getID();

	public void setNome(String nome);

	public String getNome();

	public String getCor();

	public void setCor(String novaCor);

	public String getTamanho();

	public void setTamanho(String novoTamanho);
	
	public String getProduto();
	
	public void setProduto(String produto);
}
