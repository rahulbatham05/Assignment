package assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
	
	

	public static void main(String[] args) {
		int sum=0;
		List<Integer> l1=new ArrayList<>();
		l1.add(21);
		l1.add(32);
		l1.add(22);
		l1.add(54);
		l1.add(77);
		l1.add(110);
		l1.add(99);
		l1.add(132);
		
		for(int i=0; i<l1.size();i++)
		{
			
			sum=sum+l1.get(i);
			
		}
		System.out.println("Sum of all numbsers are "+sum);
		


	}

	
}
