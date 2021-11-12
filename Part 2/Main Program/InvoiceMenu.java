import java.util.*;

public class InvoiceMenu {
	
	public void InvoiceMenu (Map CustomersData, Map ServicesData, Map ProductsData, Map InvoicesData)
	{
		int option, InvoiceID, CustomerID, ProductID, ServiceID, QuantityP = 0, SorP, printInvoice;
		String YesNo;
		//double ;
		boolean control = true, c1 = true, c2 = true, c3 = true, c5 = true, pcontrol = true;
		
		while (control == true) 
		{
			c1 = true;
			c2 = true;
			c3 = true;
			c5 = true;
			System.out.println("");
			System.out.println("INVOICES MENU\n");
			System.out.println("(1) Create");
			System.out.println("(2) Modify");
			System.out.println("(3) Delete");
			System.out.println("(4) Print Invoice");
			System.out.println("(5) Search");
			System.out.println("(6) Main Menu");
			System.out.println("Type the number where you want to go:");
			Scanner num = new Scanner(System.in);
			option = num.nextInt();
		
		if (option == 1)
		{
			while (c1 == true)
			{
				pcontrol = true;
				
				System.out.println("CREATE INVOICE\n");
				System.out.println("Invoice ID: ");
				Scanner id = new Scanner (System.in);
				InvoiceID = id.nextInt();
			
				System.out.println("Customer ID: ");
				Scanner cid = new Scanner (System.in);
				CustomerID = cid.nextInt();
				
				System.out.println("What do you want to include?");
				System.out.println("(1)Service");
				System.out.println("(2)Product");
				System.out.println("(3)Both");
				Scanner sp = new Scanner (System.in);
				SorP = sp.nextInt();
				
				if (SorP == 1)
				{
					System.out.println("Service ID:");
					Scanner sid = new Scanner (System.in);
					ServiceID = sid.nextInt();
					
					Customer c = (Customer) CustomersData.get(CustomerID);
					Service s = (Service) ServicesData.get(ServiceID);
					
					Invoice i = new Invoice(InvoiceID, c, s);
				    InvoicesData.put(InvoiceID, i);
					
					System.out.println("Invoice Created!\n");
					c1 = false;
					
				}
				else if (SorP == 2)
				{
					System.out.println("Product ID:");
					Scanner pid = new Scanner (System.in);
					ProductID = pid.nextInt();
					
					while (pcontrol == true)
					{	
						System.out.println("How many products did you sell? (input the number): ");
						Scanner qp = new Scanner (System.in);
						QuantityP = qp.nextInt();
			
						if (QuantityP == 0)
						{
							System.out.println("you need to input at least 1");
						}
						else
						{
							System.out.println("Got it!");
							pcontrol = false;
						}
					}
					
					Customer c = (Customer) CustomersData.get(CustomerID);
					Product p = (Product) ProductsData.get(ProductID);
					
					Invoice i = new Invoice(InvoiceID, QuantityP, c, p);
				    InvoicesData.put(InvoiceID, i);
					
					System.out.println("Invoice Created!\n");
					c1 = false;
				}
				else if (SorP == 3)
				{
					System.out.println("Service ID:");
					Scanner sid = new Scanner (System.in);
					ServiceID = sid.nextInt();
					
					System.out.println("Product ID:");
					Scanner pid = new Scanner (System.in);
					ProductID = pid.nextInt();
					
					while (pcontrol == true)
					{	
						System.out.println("How many products did you sell? (input the number): ");
						Scanner qp = new Scanner (System.in);
						QuantityP = qp.nextInt();
			
						if (QuantityP == 0)
						{
							System.out.println("you need to input at least 1");
						}
						else
						{
							System.out.println("Got it!");
							pcontrol = false;
						}
					}
					
							Customer c = (Customer) CustomersData.get(CustomerID);
							Service s = (Service) ServicesData.get(ServiceID);
							Product p = (Product) ProductsData.get(ProductID);
			
							Invoice i = new Invoice(InvoiceID, QuantityP, c, s, p);
							InvoicesData.put(InvoiceID, i);
			
							System.out.println("Invoice Created!\n");
							c1 = false;
				}
				else
				{
					System.out.println("Wrong input, try again\n");
				}
			}
		}
		else if (option == 2)
		{
		}
		else if (option == 3)
		{
		}
		else if (option == 4)
		{
			System.out.println("PRINT INVOICE\n");
			System.out.println("Invoice ID: ");
			Scanner iid = new Scanner (System.in);
			printInvoice = iid.nextInt();
			
			Invoice value = (Invoice) InvoicesData.get(printInvoice);
			System.out.println("__________________________________");
			System.out.println("\n" + value + "\n");
			System.out.println("__________________________________");	
		}
		else if (option == 6)
		{
			control = false;
		}
		else
		{
			System.out.print("Wrong selection, please try again");
		}
		
		
		}	
	}
}