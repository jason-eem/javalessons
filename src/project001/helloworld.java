package project001;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//For loop, print numbers which divided by 3 equal to 0
		/*for(int a=1;a<=1000;a++)
			if(a%3==0) {
				System.out.println(a);
			}
			*/
		
		//while loop
		/*for(int a=1;a<=1000;a++)
			while(a%3==0) {
				System.out.println(a);
				a++;
			}
			*/
		
		//Prime numbers
		  /* 
		   int a =0;
	       int numb =0;
	       // String for output
	       String  primeNumbers = "";

	       for (a = 1; a <= 1000; a++)         
	       { 		  	  
	          int counter=0; 	  
	          for(numb =a; numb>=1; numb--)
		  {
	             if(a%numb==0)
		     {
	 		counter = counter + 1; //if a%numb==0, add +1 to counter 
		     }
		  }
		  if (counter ==2) 
		  {
		     //Prime number to the String
		     primeNumbers = primeNumbers + a + " "; //if counter==2, then loop again
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 1000 are :");
	       System.out.println(primeNumbers);
	   }
		*/
		
		//Nested loop
		/*for (int a = 1; a <= 7; a++) {
			for (int b = 7; b >= a; b--) {
			System.out.print("*");
			}
			System.out.println();
			}
			*/
		
		//Complex Line
		/*
		int x,y,z; //xyz for inner and outer line

		for (x=1; x <= 3; x++) 
		{
		  for (y = 1; y <= x; y++)
		      System.out.print(y);

		  for (z = 7 - x; z >= 1; z--) 
		     System.out.print("*"); //output with *

		  System.out.println("");
		      }
			*/
		
	}
	
}	


