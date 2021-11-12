	
public class Service {
		private int serviceID;
		private double serviceCharge;
		private String serviceType;
		
		public Service (int serviceID, String serviceType, double serviceCharge)
		{
			this.serviceID = serviceID;
			this.serviceType = serviceType;
			this.serviceCharge = serviceCharge;
		}
		
		public void modify (String serviceType, double serviceCharge)
		{
			this.serviceType = serviceType;
			this.serviceCharge = serviceCharge;
		}
		
		public String getServiceType()
		{
			return serviceType;
		}
		
		public double getServiceCharge()
		{
			return serviceCharge;
		}
		
		public String toString()
		{
			return serviceID + " " + serviceType + " $" + serviceCharge;
		}
	}
	