public class Customer{//test
	
    private int customerId,streetNumber;
	private long phoneNumber;
    private String fName, lName, streetName;
  
		public Customer(int customerId, String fName, String lName, int streetNumber, String streetName, long phoneNumber){
		
			this.customerId =customerId;
			this.fName =fName;
			this.lName= lName;
			this.streetName = streetName;
			this.streetNumber= streetNumber;
			this.phoneNumber =phoneNumber;
		}
		
		public void modify (String fName, String lName, int streetNumber, String streetName, long phoneNumber)
		{ //construct new user inputs 
			this.fName =fName;
			this.lName= lName;
			this.streetNumber= streetNumber;
			this.streetName = streetName;
			this.phoneNumber =phoneNumber;
		}

		public String toString()
		{
			return "Customer Id: "+ customerId + "\nName: "+ fName+ " "+ lName+ "\nAdress: "+ streetNumber+ " "+ streetName + "\nPhone Number:  " + phoneNumber;
		}
	}
	
