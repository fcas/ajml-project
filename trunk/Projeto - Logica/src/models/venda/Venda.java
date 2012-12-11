package models.venda;

public class Venda implements IVenda {

	private /*@ spec_public @*/ int ID; //@ in iID;
	/*@ protected represents
	  @ iID = ID; @*/
	
	private /*@ spec_public @*/ double subtotal; //@ in isubtotal;
	/*@ protected represents
	  @ isubtotal = subtotal; @*/
	
	private /*@ spec_public @*/ String vendedorRG; //@ in ivendedorRG;
	/*@ protected represents
	  @ ivendedorRG = vendedorRG; @*/
	
	private /*@ spec_public @*/ String dataVenda; //@ in idataVenda;
	/*@ protected represents
	  @ idataVenda = dataVenda; @*/
	
	private /*@ spec_public @*/ int qtdVendas; //@ in iqtdVendas;
	/*@ protected represents
	  @ iqtdVendas = qtdVendas; @*/

	
	public int getID() {
		return ID;
	}
	
	
	public double getSubtotal() {
		return subtotal;
	}

	
	public String getVendedorRG() {
		return vendedorRG;
	}

	
	public String getDataVenda() {
		return dataVenda;
	}

	
	public int getQtdVendas() {
		return qtdVendas;
	}
	
	public void setID(int iD) {
		this.ID = iD;	
	}
	
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	
	public void setVendedorRG(String vendedorRG) {
		this.vendedorRG = vendedorRG;
	}

	
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	public void setQtdVendas(int novaQtdVendas) {
		qtdVendas = novaQtdVendas;
	}

}
