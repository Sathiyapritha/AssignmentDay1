package week1.day2;

public class Positive_Convert {
	 public static void main(String args[]) 
	    {
			int num=-40; 
			int number = 0;
			 if(num<0)
			 {
				 number=num*-1;
	 
	  System.out.println("The given negative number " +num +" converted into positive number is : "+number);
	    }
			 else {
				 
				 System.out.println("The given number " +num +" cannot convert into positive number.");
			 }
}
}
/* Output :
The given negative number -40 converted into positive number is : 40 

The given negative number -20 converted into positive number is : 20

-------------------------------------------------------------------------------

The given number 55 cannot convert into positive number.

*/
