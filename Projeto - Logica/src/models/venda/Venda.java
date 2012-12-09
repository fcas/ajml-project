package models.venda;

public class Venda implements IVenda {

	private int ID; 
	private double subtotal;
	private String vendedorRG;
	private String dataVenda;
	private int QtdVendas;

	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public double getSubtotal() {
		return subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public String getVendedorRG() {
		return vendedorRG;
	}

	public void setVendedorRG(String vendedorRG) {
		this.vendedorRG = vendedorRG;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	public int getQtdVendas() {
		return QtdVendas;
	}
	
	public void setQtdVendas(int qtdVendas) {
		QtdVendas = qtdVendas;
	}

}
