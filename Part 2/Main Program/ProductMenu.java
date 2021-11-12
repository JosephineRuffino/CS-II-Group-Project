import java.util.*;

public class ProductMenu {

	public void ProductMenu (Map ProductsData)
	{
		int Option, productID, productQuantity;
		String productName, YesNo;
		double productPrice;
		boolean control = true, c1=true, c2=true, c3=true, c5=true;
		
		while (control==true)
		{
			c1=true;
			c2=true;
			c3=true;
			c5=true;
			System.out.println("PRODUCTS MENU\n");
			System.out.println("(1) Create");
			System.out.println("(2) Modify");
			System.out.println("(3) Delete");
			System.out.println("(4) Print");
			System.out.println("(5) Search");
			System.out.println("(6) Main Menu");
			System.out.println("Type the number where you want to go: ");
			Scanner num=new Scanner(System.in);
			Option=num.nextInt();
			
			if (Option==1)
			{
				while (c1==true)
				{
					System.out.println("");
					System.out.println("Create new product\n");
					System.out.println("Enter product ID: ");
					Scanner ID=new Scanner(System.in);
					productID=ID.nextInt();
				//Convert ID to string in order to count digits
					String digits = Integer.toString(productID);
					
				//productID needs to be 4 digits					
					if (digits.length()==4)
					{	
					System.out.println("Enter product name: ");
					Scanner n=new Scanner(System.in);
					productName=n.nextLine();
					
					System.out.println("Enter product quantity: ");
					Scanner q=new Scanner(System.in);
					productQuantity=q.nextInt();
					
					System.out.println("Enter product price: ");
					Scanner pr=new Scanner(System.in);
					productPrice=pr.nextDouble();
					
					//Creates product object from 'product' class
					Product p=new Product(productID, productName, productQuantity, productPrice);
					//Add to Map
					ProductsData.put(productID, p);
					 
					System.out.println("Product has been created.\n");
					System.out.println("Would you like to add another product? (Y, N)");
					Scanner o=new Scanner(System.in);
					YesNo=o.nextLine();
					
					if (YesNo.intern()=="N" || YesNo.intern() == "n")
						{
						c1=false;
						}
					else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
						{
						System.out.println("Wrong selection, try again.\n");
						c1=false;
						}
					}
					
				//Error and loop back if ID is not 4 digits					
					else if (digits.length()>4 || digits.length()<4)
					{	
					System.out.println("ID needs to be 4 numbers.  Please try again.");
					}
				}
			}
			else if (Option==2)
			{
				while (c2==true)
				{
					System.out.println("MODIFY PRODUCT\n");
					System.out.println("Enter product ID: ");
					Scanner id=new Scanner(System.in);
					productID=id.nextInt();
					
					Product p = (Product) ProductsData.get(productID);
					
					System.out.println("Input new name: ");
					Scanner na=new Scanner(System.in);
					productName=na.nextLine();
					
					System.out.println("Input new quantity: ");
					Scanner qu=new Scanner(System.in);
					productQuantity=qu.nextInt();
					
					System.out.println("Input new price: ");
					Scanner pr=new Scanner(System.in);
					productPrice=pr.nextDouble();
					
					System.out.println("Product changed.\n");
					
					p.modify(productName, productQuantity, productPrice);
					
					System.out.println("Would you like to modify another product? (Y,N)");
					Scanner o=new Scanner(System.in);
					YesNo=o.nextLine();
					
						if (YesNo.intern()=="N" || YesNo.intern() == "n")
							{
							c2=false;
							}
						else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
							{
							System.out.println("Wrong selection, try again.\n");
							c2=false;
							}
				}
			}
			else if (Option==3)
			{
				while (c3==true)
				{
					System.out.println("DELETE PRODUCT\n");
					System.out.println("Enter product ID");
					Scanner id=new Scanner(System.in);
					productID=id.nextInt();
					
					ProductsData.remove(productID);
					
					System.out.println("Product deleted.\n");
					System.out.println("Would you like to delete another product? (Y,N)");
					
					Scanner o=new Scanner(System.in);
					YesNo=o.nextLine();
					
						if (YesNo.intern()=="N" || YesNo.intern() == "n")
							{
							c3=false;
							}
						else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
							{
							System.out.println("Wrong selection, try again\n");
							c3=false;
							}
				}
			}
			else if (Option==4)
			{
				for (Object key : ProductsData.keySet())
				{
					Product value = (Product) ProductsData.get(key);
					System.out.println(value + "\n");
				}
			}
			else if (Option==5)
			{
				while (c5==true)
				{
					System.out.println("SEARCH PRODUCTS\n");
					System.out.println("Enter product ID");
					Scanner id=new Scanner(System.in);
					productID=id.nextInt();
					
					System.out.println("Product: " + ProductsData.get(productID));
					System.out.println("Would you like to search for another product? (Y,N)");
					
					Scanner o=new Scanner(System.in);
					YesNo=o.nextLine();
					
						if (YesNo.intern()=="N" || YesNo.intern() == "n")
							{
							c5=false;
							}
						else if (YesNo.intern() != "Y" || YesNo.intern() != "y")
							{
							System.out.println("Wrong selection, try again\n");
							c5=false;
							}
				}
			}
			else if (Option==6)
			{
				control=false;
			}
			else if (Option != 1 || Option != 2 || Option != 3 || Option != 4 || Option != 5)
			{
				System.out.println("Wrong selection, try again\n");
			}
			}
		}
	}

