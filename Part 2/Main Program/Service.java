	
public class Service {
	         //create variables
		private int serviceID;
		private double serviceCharge;
		private String serviceType;
		
		public Service (int serviceID, String serviceType, double serviceCharge) //construct the Service class 
		{
			this.serviceID = serviceID;
			this.serviceType = serviceType;
			this.serviceCharge = serviceCharge;
		}
		
		public void modify (String serviceType, double serviceCharge) //construct a service after new inputs are entered 
		{
			this.serviceType = serviceType;
			this.serviceCharge = serviceCharge;
		}
		
		public String getServiceType() //resturns services type 
		{
			return serviceType;
		}
		
		public double getServiceCharge() //returns service charge 
		{
			return serviceCharge;
		}
		
		public String toString() //construct and print sentence for services 
		{
			return serviceID + " " + serviceType + " $" + serviceCharge;
		}
	}
	
