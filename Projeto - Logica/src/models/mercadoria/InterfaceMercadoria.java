package models.mercadoria;

public interface InterfaceMercadoria {
	//@ public model instance double ipreco;
	//@ public model instance double iID;
	//@ public model instance double inome;
 
	/*@ requires preco >= 0;
	  @ ensures ipreco == novoPreco; @*/
	public void setPreco(double novoPreco);
	
	public double getPreco();
	
	public void setID(String ID);
	
	public String getID();
	
	public void setNome(String nome);
	
	public String getNome();
}
 
