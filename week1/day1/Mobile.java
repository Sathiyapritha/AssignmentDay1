package week1.day1;

		public class Mobile 
		{
			
			public void makeCall() 
			{
				
				String mobileModel = "Iphone";
				float mobileWeight = 8.47f;

				System.out.println("Mobile Model name is : "+mobileModel);
				System.out.println("Mobile Weight is : "+mobileWeight);
				System.out.println("MAKE A CALL");
			}
			
			public void sendMsg() 
			{
				
				boolean isFullcharged =true;
				int mobileCost = 79900;

				System.out.println("\nIs Mobile fully charged : "+ isFullcharged);
				System.out.println("Cost of Mobile : Rs"+mobileCost);
				System.out.println("Hi,This is my mobile");
			}
			
								
			public static void main(String[] args)
			{
						
				Mobile a=new Mobile();
				a.makeCall();
				a.sendMsg();
				
				

			}
				
	
		}
