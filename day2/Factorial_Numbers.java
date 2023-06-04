package week1.day2;

public class Factorial_Numbers {

	public static void main(String[] args) {
		
		int n=5,fact=1;
		 
        for(int i=1;i<=n;i++)
  	  {

    	   fact=fact*i;
	 	  }

        System.out.println("Factorial of "+n+" is: "+fact);    
	}

}

/* Output:
 * Factorial of 10 is: 120 */
 