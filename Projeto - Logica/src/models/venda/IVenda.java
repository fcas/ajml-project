package models.venda;

public interface IVenda {
	
	public int getID();
	
	public void setID(int iD);
	
	public double getSubtotal();
	
	public void setSubtotal(double subtotal);

	public String getVendedorRG();

	public void setVendedorRG(String vendedorRG);

	public String getDataVenda();

	public void setDataVenda(String dataVenda);
	
	public int getQtdVendas();
	
	public void setQtdVendas(int qtdVendas);

}
