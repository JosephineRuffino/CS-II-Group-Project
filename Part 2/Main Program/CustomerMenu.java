import java.util.*;

public class CustomerMenu {
    public void CustomerMenu (Map CustomersData)
	{
		int choices, customerId,streetNumber;
		long phoneNumber;
		String fName, lName, streetName, YesNo;

		boolean control = true, c1 = true, c2 = true, c3 = true, c5 = true;
		
		while (control == true){
			c1 = true;
			c2 = true;
			c3 = true;
			c5 = true;
			System.out.println("");
			System.out.println("CUSTOMERS MENU\n");
			System.out.println("(1) Create");
			System.out.println("(2) Modify");
			System.out.println("(3) Delete");
			System.out.println("(4) Print");
			System.out.println("(5) Search");
			System.out.println("(6) Main Menu");
		
			System.out.println("Type the number where you want to go:");
			Scanner num = new Scanner(System.in);
			choices = num.nextInt();
			
			
			if (choices == 1)
			{
				while (c1 == true)
				{
					System.out.println("");
					System.out.println("CREATE CUSTOMER\n");
					System.out.println("enter Customer ID (4 numbers): ");
					Scanner id = new Scanner(System.in);
					customerId = id.nextInt();
			
					System.out.println("Enter the Customer's first name");
					Scanner name = new Scanner(System.in);
	                fName = name.nextLine();
	                
	                System.out.println("Enter the Customer's last name");
	                Scanner last = new Scanner(System.in);
	                lName = last.nextLine();
	                
	                System.out.println("Enter the Customer's street name");
	                Scanner st = new Scanner(System.in);
	                streetName = st.nextLine();
	                
	                System.out.println("Enter the street number");
	                Scanner in = new Scanner(System.in);
	                streetNumber = in.nextInt();
	                
	                System.out.println("Enter the Customer's phone number (6 digits");
	                Scanner phone = new Scanner(System.in);
	                phoneNumber = phone.nextLong();
		
					Customer c = new Customer(customerId, fName, lName, streetNumber,  streetName, phoneNumber);
					CustomersData.put(customerId, c);
		
					System.out.println("Customer Created!\n");
					System.out.println("do you want to add another Customer? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
			
			
					if (YesNo.intern() == "N")
					{
						c1 = false;
					}
					else if (YesNo.intern() != "Y")
					{
						System.out.println("Wrong selection, Try again\n");
						c1 = false;
					}
				}
			}
			else if (choices == 2){
				while (c2 == true){
					System.out.println("");
					System.out.println("MODIFY CUSTOMER\n");
					System.out.println("enter Customer ID:");
					Scanner id = new Scanner(System.in);
					customerId = id.nextInt();
					
					Customer c = (Customer) CustomersData.get(customerId); 
					
					System.out.println("Enter new first name: ");
					Scanner name = new Scanner(System.in);
	                fName = name.nextLine();
					
					System.out.println("Enter new last name: ");
					Scanner last = new Scanner(System.in);
	                lName = last.nextLine();
	                
	                
					System.out.println("Enter new street name: ");
					Scanner st = new Scanner(System.in);
	                streetName = st.nextLine();
					
					System.out.println("Enter new street number: ");
					Scanner in = new Scanner(System.in);
	                streetNumber = in.nextInt();
	                
					System.out.println("Enter new phone number: ");
					Scanner phone = new Scanner(System.in);
	                phoneNumber = phone.nextLong();
					
					c.modify(fName, lName, streetNumber, streetName, phoneNumber);
					
					System.out.println("Do you want to modify another Customer? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N")
					{
						c2 = false;
					}
					else if (YesNo.intern() != "Y")
					{
						System.out.println("Wrong selection, Try again\n");
						c2 = false;
					}
			
			
				}
			}
			else if (choices == 3){
				while (c3 == true){
					System.out.println("");
					System.out.println("DELETE CUSTOMER\n");
					System.out.println("Enter Customer ID");
					Scanner id = new Scanner(System.in);
					customerId = id.nextInt();
			
					CustomersData.remove(customerId);
			
					System.out.println("Customer was Deleted!\n");
					System.out.println("do you want to delete another customer? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N")
					{
						c3 = false;
					}
					else if (YesNo.intern() != "Y")
					{
						System.out.println("Wrong selection, Try again\n");
						c3 = false;
					}
				}
			}
			else if (choices == 4)
			{
				for (Object key : CustomersData.keySet())
				{
					Customer value = (Customer) CustomersData.get(key);
					System.out.println(value + "\n");
				}
	
			}
			else if (choices == 5)
			{
				while (c5 == true)
				{
					System.out.println("");
					System.out.println("SEARCH CUSTOMER\n");
					System.out.println("enter Customer ID");
					Scanner id = new Scanner(System.in);
					customerId = id.nextInt();
			
					System.out.println("Customer: " + CustomersData.get(customerId));
			
					System.out.println("do you want to Search another Service? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N")
					{
						c5 = false;
					}
					else if (YesNo.intern() != "Y")
					{
						System.out.println("Wrong selection, Try again\n");
						c5 = false;
					}
				}
			}
			else if (choices == 6){
				control = false;
			}
			else if (choices != 1 || choices != 2 || choices != 3 || choices != 4 || choices != 5)
			{
				System.out.println("Wrong selection, Try again\n");
			}
		}
	}
		
}