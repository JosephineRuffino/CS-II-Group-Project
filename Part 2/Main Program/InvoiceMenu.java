import java.util.*;

public class InvoiceMenu {
	
	public void InvoiceMenu (Map CustomersData, Map ServicesData, Map ProductsData, Map InvoicesData)
	{
		//declares variables
		int option, InvoiceID, CustomerID, ProductID, ServiceID, QuantityP = 0, SorP, printInvoice;
		String YesNo;
		boolean control = true, c1 = true, c2 = true, pcontrol = true;
		
		while (control == true) 
		{
			c1 = true;
			c2 = true;
			System.out.println("");
			//print the invoices menu 
			System.out.println("INVOICES MENU\n");
			System.out.println("(1) Create");
			System.out.println("(2) Delete");
			System.out.println("(3) Print Invoice");
			System.out.println("(4) Main Menu");
			System.out.println("Type the number where you want to go:");
			Scanner num = new Scanner(System.in);
			option = num.nextInt(); //scan user input for the menu 
		
		if (option == 1)
		{
			while (c1 == true) //option 1 will allow the user to create an invoice 
			{
				pcontrol = true;
				
				System.out.println("CREATE INVOICE\n");
				System.out.println("Invoice ID: ");
				Scanner id = new Scanner (System.in);
				InvoiceID = id.nextInt();
			        //Convert ID to string in order to count digits
				String digits = Integer.toString(InvoiceID);
					
			        //invoiceID needs to be 4 digits					
				if (digits.length()==4)
				{			
				System.out.println("Customer ID: ");
				Scanner cid = new Scanner (System.in);
				CustomerID = cid.nextInt();
				
				System.out.println("What do you want to include?"); //Prompt the user 
				System.out.println("(1)Service");
				System.out.println("(2)Product");
				System.out.println("(3)Both"); 
				Scanner sp = new Scanner (System.in);
				SorP = sp.nextInt(); //scan user input 
				
				if (SorP == 1) //if user chooses only a service create new invoice 
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
				else if (SorP == 2) //if user chooses only a product create new invoice
				{
					System.out.println("Product ID:");
					Scanner pid = new Scanner (System.in);
					ProductID = pid.nextInt();
					
					while (pcontrol == true)
					{	
						System.out.println("How many products did you sell? (input the number): ");
						Scanner qp = new Scanner (System.in);
						QuantityP = qp.nextInt(); //gets the quantity of items sold 
			
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
					
					Customer c = (Customer) CustomersData.get(CustomerID); //get information from CustomersData map using the customerId 
					Product p = (Product) ProductsData.get(ProductID); // get information from ProductsData map using the productId
	
					Invoice i = new Invoice(InvoiceID, QuantityP, c, p); //create and constructs new invoice using "Invoice" class
				    InvoicesData.put(InvoiceID, i);
					
					System.out.println("Invoice Created!\n");
					c1 = false; //back to invoice menu 
				}
				else if (SorP == 3) // if user choses to add both a service and a product 
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
			
						if (QuantityP <= 0)
						{
							System.out.println("you need to input at least 1");
						}
						else
						{
							System.out.println("Got it!");
							pcontrol = false;
						}
					}
					                 //call each info from the maps
							Customer c = (Customer) CustomersData.get(CustomerID);
							Service s = (Service) ServicesData.get(ServiceID);
							Product p = (Product) ProductsData.get(ProductID);
			
							Invoice i = new Invoice(InvoiceID, QuantityP, c, s, p); //constructs new invoice 
							InvoicesData.put(InvoiceID, i); 
			
							System.out.println("Invoice Created!\n");
							c1 = false;//back to invoice menu 
					}
				}
			        //Error and loop back if ID is not 4 digits
				else if (digits.length()>4 || digits.length()<4)
					{
					System.out.println("ID needs to be 4 numbers. Please try again.");
					}
				}
		}
		else if (option == 2) //deletes an invoice using invoiceId
		{
			while (c2 == true)
				{
					System.out.println("");
					System.out.println("DELETE INVOICE\n");
					System.out.println("enter Invoice ID");
					Scanner id = new Scanner(System.in);
					InvoiceID = id.nextInt();
			
					InvoicesData.remove(InvoiceID);
			
					System.out.println("Invoice Deleted!\n");
					System.out.println("do you want to delete another Service? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N" || YesNo.intern() == "n" || YesNo.intern() == "Y" || YesNo.intern() == "y")
					{
						c2 = false;
					}
					else if (YesNo.intern() != "Y" || YesNo.intern() != "y" || YesNo.intern() != "N" || YesNo.intern() != "n")
					{
						System.out.println("Wrong selection, Try again\n");
						c2 = false;
					}
				}
		}
		else if (option == 3) //prints desired invoice
		{
			System.out.println("PRINT INVOICE\n");
			System.out.println("Invoice ID: ");
			Scanner iid = new Scanner (System.in);
			printInvoice = iid.nextInt();
			
			Invoice value = (Invoice) InvoicesData.get(printInvoice);//calls the printInvoice method in the Invoice class 
			System.out.println("__________________________________");
			System.out.println("\n" + value + "\n");
			System.out.println("__________________________________");	
		}
		else if (option == 4)
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
