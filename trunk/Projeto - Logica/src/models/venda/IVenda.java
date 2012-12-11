package models.venda;

public interface IVenda {
	//@ public model instance int iID;
	//@ public model instance double isubtotal;
	//@ public model instance String ivendedorRG;
	//@ public model instance String idataVenda;
	//@ public model instance int iqtdVendas;
	
	/*@
	  @ ensures \result == iID; @*/
	public int getID();
	
	/*@
	  @ ensures \result == isubtotal; @*/
	public double getSubtotal();

	/*@
	  @ ensures \result == ivendedorRG; @*/
	public String getVendedorRG();

	/*@
	  @ ensures \result == idataVenda; @*/
	public String getDataVenda();

	/*@
	  @ ensures \result == iqtdVendas; @*/
	public int getQtdVendas();

	/*@
	  @ requires iD >= 0;
	  @ assignable iID;
	  @ ensures iID == iD; @*/
	public void setID(int iD);
	
	/*@
	  @ requires subtotal >= 0;
	  @ assignable isubtotal;
	  @ ensures isubtotal == subtotal; @*/
	public void setSubtotal(double subtotal);

	/*@
	  @ requires vendedorRG != null;
	  @ assignable ivendedorRG;
	  @ ensures ivendedorRG == vendedorRG; @*/
	public void setVendedorRG(String vendedorRG);
	
	/*@
	  @ requires dataVenda != null;
	  @ assignable idataVenda;
	  @ ensures idataVenda == dataVenda; @*/
	public void setDataVenda(String dataVenda);
	
	/*@
	  @ requires qtdVendas >= 0;
	  @ assignable iqtdVendas;
	  @ ensures iqtdVendas == qtdVendas; @*/
	public void setQtdVendas(int qtdVendas);

}
