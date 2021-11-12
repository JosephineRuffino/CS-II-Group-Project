import java.util.*;

public class ServiceMenu {
	
	public void ServiceMenu (Map ServicesData)//Constructor Method requires a Map that is created in the main program
	{
		int Option, ServiceID;
		String ServiceType, YesNo;
		double ServiceCharge;
		boolean control = true, c1 = true, c2 = true, c3 = true, c5 = true;//Control Variables for all the loop menus
		
		while (control == true)
		{
			c1 = true;
			c2 = true;
			c3 = true;
			c5 = true;
			System.out.println("");
			System.out.println("SERVICES MENU\n");
			System.out.println("(1) Create");
			System.out.println("(2) Modify");
			System.out.println("(3) Delete");
			System.out.println("(4) Print");
			System.out.println("(5) Search");
			System.out.println("(6) Main Menu");
			System.out.println("Type the number where you want to go:");
			Scanner num = new Scanner(System.in);
			Option = num.nextInt();
			
			
			if (Option == 1)
			{
				while (c1 == true)
				{
					System.out.println("");
					System.out.println("CREATE SERVICE\n");
					System.out.println("enter service ID (4 numbers):");
					Scanner id = new Scanner(System.in);
					ServiceID = id.nextInt();
				//Convert ID to string in order to count digits
					String digits = Integer.toString(ServiceID);
					
				//productID needs to be 4 digits					
					if (digits.length()==4)
					{			
					System.out.println("enter Service Description (ex. Computer repair):");
					Scanner type = new Scanner(System.in);
					ServiceType = type.nextLine();
		
					System.out.println("enter Service Charge:");
					Scanner charge = new Scanner(System.in);
					ServiceCharge = charge.nextDouble();
		
					Service s = new Service(ServiceID, ServiceType, ServiceCharge);//Create new Service object from 'Service' Class
					ServicesData.put(ServiceID, s);//Add the ID and its 'Service' Object to Map
		
					System.out.println("Service Created!\n");
					System.out.println("do you want to add another Service? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
			
			
					if (YesNo.intern() == "N" || YesNo.intern() == "n")
					{
						c1 = false;
					}
					else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
					{
						System.out.println("Wrong selection, Try again\n");
						c1 = false;
					}
				}
					
				//Error and loop back if ID is not 4 digits					
					else if (digits.length()>4 || digits.length()<4)
					{	
						System.out.println("ID needs to be 4 numbers.  Please try again.");
					}
				}
			}
			else if (Option == 2)
			{
				while (c2 == true)
				{
					System.out.println("");
					System.out.println("MODIFY SERVICE\n");
					System.out.println("enter service ID:");
					Scanner id = new Scanner(System.in);
					ServiceID = id.nextInt();
					
					Service s = (Service) ServicesData.get(ServiceID);//Create a 'Service' to copy the values from Map 'Service' associated with the ServiceID 
					
					System.out.println("Input the new Description: ");
					Scanner type = new Scanner(System.in);
					ServiceType = type.nextLine();
				
					System.out.println("Input the new Charge: ");
					Scanner charge = new Scanner(System.in);
					ServiceCharge = charge.nextDouble();
					System.out.println("Service Changed!\n");
					
					s.modify(ServiceType, ServiceCharge);//call 'modify' method for the 'Service' with the copied information in order to change it
					
					System.out.println("do you want to modify another Service? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N" || YesNo.intern() == "n")
					{
						c2 = false;
					}
					else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
					{
						System.out.println("Wrong selection, Try again\n");
						c2 = false;
					}
			
			
				}
			}
			else if (Option == 3)
			{
				while (c3 == true)
				{
					System.out.println("");
					System.out.println("DELETE SERVICE\n");
					System.out.println("enter service ID");
					Scanner id = new Scanner(System.in);
					ServiceID = id.nextInt();
			
					ServicesData.remove(ServiceID);
			
					System.out.println("Service Deleted!\n");
					System.out.println("do you want to delete another Service? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N" || YesNo.intern() == "n")
					{
						c3 = false;
					}
					else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
					{
						System.out.println("Wrong selection, Try again\n");
						c3 = false;
					}
				}
			}
			else if (Option == 4)
			{
				for (Object key : ServicesData.keySet())
				{
					Service value = (Service) ServicesData.get(key);
					System.out.println(value + "\n");
				}
	
			}
			else if (Option == 5)
			{
				while (c5 == true)
				{
					System.out.println("");
					System.out.println("SEARCH SERVICE\n");
					System.out.println("enter service ID");
					Scanner id = new Scanner(System.in);
					ServiceID = id.nextInt();
			
					System.out.println("Service: " + ServicesData.get(ServiceID));
			
					System.out.println("do you want to Search another Service? (Y,N)");
					Scanner o = new Scanner(System.in);
					YesNo = o.nextLine();
			
					if (YesNo.intern() == "N" || YesNo.intern() == "n")
					{
						c5 = false;
					}
					else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
					{
						System.out.println("Wrong selection, Try again\n");
						c5 = false;
					}
				}
			}
			else if (Option == 6)
			{
				control = false;
			}
			else if (Option != 1 || Option != 2 || Option != 3 || Option != 4 || Option != 5)
			{
				System.out.println("Wrong selection, Try again\n");
			}
		}
	}
}
