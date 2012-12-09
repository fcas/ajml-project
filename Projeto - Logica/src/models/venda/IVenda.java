package models.venda;

public interface IVenda {
	
	public int getID();
	
	public void setID(int iD);
	
	public double getSubtotal();
	
	public void setSubtotal(double subtotal);

	public String getVendedor();

	public void setVendedor(String vendedor);

	public String getDataVenda();

	public void setDataVenda(String dataVenda);

}
