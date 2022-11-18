package assignment3;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(21);
		l1.add(32);
		l1.add(22);
		l1.add(54);
		l1.add(77);
		l1.add(110);
		l1.add(99);
		l1.add(132);
		
		for(int a:l1)
		{
			System.out.println("List values are "+a);
		}
		

	}

}
