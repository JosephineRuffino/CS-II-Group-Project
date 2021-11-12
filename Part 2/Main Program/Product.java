
public class Product {
	//create variables
	private int productID;
	private String productName;
	private int productQuantity;
	private double productPrice;
	
	public Product (int productID, String productName, int productQuantity, double productPrice) //construct the product class 
	{
		this.productID=productID;
		this.productName=productName;
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
	}
	
	public void modify (String productName, int productQuantity, double productPrice) //construct a product after new inputs are entered 
	{
		this.productName=productName;
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
	}
	
	public String getProductName() //returns a product name 
	{
		return productName;
	}
	
	public double getProductPrice() // returns a product price 
	{
		return productPrice;
	}
	
	public String toString() //constructs and prints the sentence for a product 
	{
		return productID + " " + productName + " $" + productPrice;
	}
}
