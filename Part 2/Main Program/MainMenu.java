import java.util.*;

public class MainMenu {

	public static void main (String [] args)
	{
		boolean control = true;
		int option;
		
		//Customers Data and Menu
		Map<Integer, Customer> CustomersData = new TreeMap<Integer, Customer>();
		Customer c1 = new Customer(2001, "John", "Smith",500, "Ave K" , 3403500);
		Customer c2 = new Customer(2002, "Mary", "Lane",221,"Main Street", 3403515);
		Customer c3 = new Customer(2003, "Noe", "Soto",  132, "Apple", 3052361);
		Customer c4 = new Customer(2004, "Beida", "Ortiz",209, "Ave G", 3403210);
		Customer c5 = new Customer(2005, "Josephine", "Ruffino", 310,"Ranger", 3404223);
		
		CustomersData.put(2001, c1);
		CustomersData.put(2002, c2);
		CustomersData.put(2003, c3);
		CustomersData.put(2004, c4);
		CustomersData.put(2005, c5);
		
		CustomerMenu menuC = new CustomerMenu();
		
		//Products Data and Menu
		Map<Integer, Product> ProductsData = new TreeMap<Integer, Product>();
		Product p1 = new Product(3001, " 500Gb Hard drive", 50 , 50);
		Product p2 = new Product(3002, " 1Tb Hard drive", 30 , 100);
		Product p3 = new Product(3003, " 32Gb USB Drive", 50 , 15);
		Product p4 = new Product(3004, " 64Gb USB Drive", 30 , 25);
		Product p5 = new Product(3005, " VGA Cable", 50 , 15);
		
		ProductsData.put(3001, p1);
		ProductsData.put(3002, p2);
		ProductsData.put(3003, p3);
		ProductsData.put(3004, p4);
		ProductsData.put(3005, p5);
		
		ProductMenu menuP = new ProductMenu();
		
		////Services Data and Menu
		Map<Integer, Service> ServicesData = new TreeMap<Integer, Service>();
		Service s1 = new Service(4001, "Computer Repair", 50);
		Service s2 = new Service(4002, "Virus Removal", 40);
		Service s3 = new Service(4003, "Computer Reinstall", 120);
		Service s4 = new Service(4004, "Screen Replacement", 50);
		Service s5 = new Service(4005, "Computer Install", 60);
	 
		ServicesData.put(4001, s1);
		ServicesData.put(4002, s2);
		ServicesData.put(4003, s3);
		ServicesData.put(4004, s4);
		ServicesData.put(4005, s5);
		
		ServiceMenu menuS = new ServiceMenu(); 
		
		//Invoices Data and Menu
		Map <Integer, Invoice> InvoicesData = new TreeMap<Integer, Invoice>();
		Invoice i1 = new Invoice(1001, c2, s3);
		Invoice i2 = new Invoice(1002, 2, c4, s1, p4);
		Invoice i3 = new Invoice(1003, 3, c3, p2);
		Invoice i4 = new Invoice(1004, 1, c5, p1);
		Invoice i5 = new Invoice(1005, c4, s1);
		
		InvoicesData.put(1001, i1);
		InvoicesData.put(1002, i2);
		InvoicesData.put(1003, i3);
		InvoicesData.put(1004, i4);
		InvoicesData.put(1005, i5);
		
		InvoiceMenu menuI = new InvoiceMenu();
		
		
		while (control == true)
		{
			System.out.println("Welcome to IT SERVICE MANAGEMENT");
			System.out.println("(1) Costumers");
			System.out.println("(2) Products");
			System.out.println("(3) Services");
			System.out.println("(4) Invoices");
			System.out.println("(5) Exit");
			Scanner o = new Scanner (System.in);
			option = o.nextInt();
			
			if (option == 1)
			{
				menuC.CustomerMenu(CustomersData);//Call Services menu class
			}
			else if (option == 2)
			{
				menuP.ProductMenu(ProductsData);//Call Products menu class
			}
			else if (option == 3)
			{
				menuS.ServiceMenu(ServicesData);//Call Services menu class 
			}
			else if (option == 4)
			{
				menuI.InvoiceMenu(CustomersData, ServicesData, ProductsData, InvoicesData);//Call Invoices Menu
			}
			else if (option == 5)
			{
				System.out.println("Good Bye");
				control = false;
			}
		}	
	}
}