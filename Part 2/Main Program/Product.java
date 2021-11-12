
public class Product {
	
	private int productID;
	private String productName;
	private int productQuantity;
	private double productPrice;
	
	public Product (int productID, String productName, int productQuantity, double productPrice)
	{
		this.productID=productID;
		this.productName=productName;
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
	}
	
	public void modify (String productName, int productQuantity, double productPrice)
	{
		this.productName=productName;
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public double getProductPrice()
	{
		return productPrice;
	}
	
	public String toString()
	{
		return productID + " " + productName + " $" + productPrice;
	}
}