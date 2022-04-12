package JavaInterview;

public class PrimeNumber
{

	public static void main(String[] args)
	{

		// print the  0 to 100 prime number 
		  int number;
		  int totalprimenumber=0;
		  
		
		for (int i=2; i<=100;i++) {
			number=0;
			
			for(int  j=2; j<=i/2;j++) 
			{
				
				if(i%j==0) {
					number++;
					
				}
				
			}
				if(number==0) {
					System.out.print("  "+i);
					totalprimenumber++;
					
					
				}
			

			
		}
		
	    
		//System.out.println(totalprimenumber);
		
		
    }
	
}