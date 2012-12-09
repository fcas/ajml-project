package mercadoria;

public abstract class AbstractMercadoria implements InterfaceMercadoria {
 
	private double preco;
	private String ID;
	private String nome;
	
	
	public double getPreco() {
		return preco;
	}

	public String getID() {
		return ID;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
 
