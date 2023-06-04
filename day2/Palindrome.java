package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=34343;
		int org_num=num;
		int check=0;
		int temp=0;
		//System.out.println("Enter the number: "+num);		
	for(int i=num; i>0;)
	{
		
		temp=i%10;
		check=(check*10)+temp;
		i=i/10;
		
	}
		if(org_num==check)
		{
			
			System.out.println(check+ " is a Palindrome number.");
		}

		
		else
		{
			System.out.println(check+ " is not a Palindrome number.");
		}

	}

}

/* Output:
 *  Enter the number: 34343
34343 is a Palindrome number.  */

/*Enter the number: 12345
54321 is not a Palindrome number.*/

