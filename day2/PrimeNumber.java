package week1.day2;

public class PrimeNumber {

	public static void main(String[] args)
	{
	  int num=23;
	  boolean flag=false;
	  
	  for(int i=2; i<num; i++)
	  {
		  //System.out.println("print i value:" +i);
		  if(num%i==0) 
		  {
			  flag=true;
			  break;
		  }// if bracket
		  
	  } // for loop end bracket
	  
	  if(flag==true)
	  
	  {
		  System.out.println(num + " is not a prime number.");
				
	  }
	  else {
		  System.out.println(num + " is a prime number.");
	  }

}// main method bracket
}

//14 is not a prime number
//23 is a prime number.