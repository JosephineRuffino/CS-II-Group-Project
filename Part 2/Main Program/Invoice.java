import java.util.*;

public class Invoice {
	
	private int QuantityP, InvoiceID;
	private Customer c1;
	private Service s1;
	private Product p1;
	private double total, totalCharge, ServiceCharge, ProductPrice;
	
	public Invoice (int InvoiceID, int QuantityP, Customer c, Service s, Product p)
	{
		this.InvoiceID = InvoiceID;
		this.QuantityP = QuantityP;
		c1 = c;
		s1 = s;
		p1 = p;
		
		ServiceCharge = s1.getServiceCharge();
		ProductPrice = p1.getProductPrice();
		
		total = (ServiceCharge + (ProductPrice * QuantityP)) * 0.05125;
		
		totalCharge = (ServiceCharge + (ProductPrice * QuantityP)) + total;
		
	}
	
	public Invoice (int InvoiceID, int QuantityP, Customer c, Product p)
	{
		this.InvoiceID = InvoiceID;
		this.QuantityP = QuantityP;
		c1 = c;
		p1 = p;
		
		ProductPrice = p1.getProductPrice();
		
		total = (ProductPrice * QuantityP) * 0.05125;
		
		totalCharge = (ProductPrice * QuantityP) + total;
	}
	
	public Invoice (int InvoiceID, Customer c, Service s)
	{
		this.InvoiceID = InvoiceID;
		this.QuantityP = QuantityP;
		c1 = c;
		s1 = s;
		
		ServiceCharge = s1.getServiceCharge();
		
		total = ServiceCharge * 0.05125;
		
		totalCharge = ServiceCharge + total;
	}
	
	
	public String toString()
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
	