import java.util.*;

public class Invoice {
	//required variables 
	private int QuantityP, InvoiceID;
	private Customer c1;
	private Service s1;
	private Product p1;
	private double total, totalCharge, ServiceCharge, ProductPrice;
	
	public Invoice (int InvoiceID, int QuantityP, Customer c, Service s, Product p) //method if user wants to have both services and products 
	{
		//conntruct invoice variables 
		this.InvoiceID = InvoiceID;
		this.QuantityP = QuantityP;
		c1 = c;
		s1 = s;
		p1 = p;
		
		ServiceCharge = s1.getServiceCharge(); //get services charge 
		ProductPrice = p1.getProductPrice(); // get product price 
		
		total = (ServiceCharge + (ProductPrice * QuantityP)) * 0.05125;  //calculates total cost (tax) 
		 
		totalCharge = (ServiceCharge + (ProductPrice * QuantityP)) + total; //calcualte total charge 
		
	}
	
	public Invoice (int InvoiceID, int QuantityP, Customer c, Product p) // method if user wants to only have a product
	{
		//conntruct invoice variables 
		this.InvoiceID = InvoiceID; 
		this.QuantityP = QuantityP;
		c1 = c;
		p1 = p;
		
		ProductPrice = p1.getProductPrice(); //get procuct price 
		
		total = (ProductPrice * QuantityP) * 0.05125; //calcualte tax 
		
		totalCharge = (ProductPrice * QuantityP) + total; //add it to total charge 
	}
	
	public Invoice (int InvoiceID, Customer c, Service s) //method if the user wants to only have a service
	{
		//conntruct invoice variables 
		this.InvoiceID = InvoiceID;
		this.QuantityP = QuantityP;
		c1 = c;
		s1 = s;
		
		ServiceCharge = s1.getServiceCharge(); //get services charge 
		
		total = ServiceCharge * 0.05125; //calculate tax 
		
		totalCharge = ServiceCharge + total; //add it to total charge 
	}
	
	
	public String toString() //construct and print the sentences  
	{
		if (s1 == null) 
		{
		return "Invoice Number: " + InvoiceID + "\n\n" + c1 + "\n\n Quantity:" + QuantityP + "\n" + p1 + "\n\nTotal charge: $" + totalCharge;
		}
		else if (p1 == null)
		{
			return "Invoice Number: " + InvoiceID + "\n\n" + c1 + "\n\n" + s1 + "\n\nTotal charge: $" + totalCharge;
		}
		else
		{
			return "Invoice Number: " + InvoiceID + "\n\n" + c1 + "\n\n" + s1 + "\nQuantity:" + QuantityP + "\n" + p1 + "\n\nTotal charge: $" + totalCharge;
		}
	}
	
}
	
