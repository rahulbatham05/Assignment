package assignment4;

import java.util.ArrayList;
import java.util.List;

//Create a list of values and print the second element, second last element.
//Input – 10,45, 90,45, 23, 90, 44
//Output – 45,90

public class SecondElement {

	public static void main(String[] args) {
		
		List<Integer> number=new ArrayList<>();
		number.add(10);
		number.add(45);
		number.add(90);
		number.add(45);
		number.add(23);
		number.add(90);
		number.add(44);
		
		System.out.println("Size of list is "+number.size());

		for(int i=0;i<number.size();i++)
		{
			if(i==1||i==(number.size()-2))
			{
			System.out.println("Values are "+number.get(i));
			}
		}
	}

}
