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

	/*@
	  @ public initially ID == 0
	  @ 			&& subtotal == 0
	  @ 			&& vendedorRG.equals("")
	  @ 			&& dataVenda.equals("")
	  @ 			&& qtdVendas == 0;
	  @
	  @ public invariant ID >= 0
	  @ 			&& subtotal >= 0
	  @ 			&& vendedorRG != null
	  @ 			&& dataVenda != null
	  @ 			&& qtdVendas >= 0;
	  @ public invariant vendedorRG.length() <= 9;@*/
	
	
	/*@
	  @ ensures ID == 0
	  @ 			&& subtotal == 0
	  @ 			&& vendedorRG.equals("")
	  @ 			&& dataVenda.equals("")
	  @ 			&& qtdVendas == 0; @*/
	public Venda() {
		this.ID = 0;
		this.subtotal = 0;
		this.vendedorRG = ""; 
		this.dataVenda = ""; 
		this.qtdVendas = 0;
	}
	
	
	public /*@ pure @*/ int getID() {
		return ID;
	}
	
	
	public /*@ pure @*/ double getSubtotal() {
		return subtotal;
	}

	
	public /*@ pure @*/ String getVendedorRG() {
		return vendedorRG;
	}

	
	public /*@ pure @*/ String getDataVenda() {
		return dataVenda;
	}

	
	public /*@ pure @*/ int getQtdVendas() {
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
