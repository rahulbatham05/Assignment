package assignment1;

public class PrimeNumbers {
	

	public static void main(String[] args) {
		int flag;
		String prime="";
		for (int i = 2; i <= 1000; i++) {
			 flag=0;
			for (int j = 1; j <=i; j++) {
				if (i%j == 0)
				{	
				flag=flag+1;
				
				}
				
			}
			if(flag==2)
				//System.out.println("Prime Number is " + i);
			prime=prime+i+" ";
			
		}
		
		
System.out.println( "Prime number is"+ prime+ " ");
	}

}
