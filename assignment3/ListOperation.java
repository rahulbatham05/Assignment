package assignment3;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {
	
//	Create a list of numbers 33,44,55,66,77,88 and perform below operation
//	Remove second element from list using index
//	Remove second element from list using value
//	Add 90 at index 3
//	Get the length of list
//	Print all values from list using any values
//	Convert List into array.
	
	public static void main(String[] args) {
		
		List<Integer> Numbers=new ArrayList<>();
		Numbers.add(33);
		Numbers.add(44);
		Numbers.add(55);
		Numbers.add(66);
		Numbers.add(77);
		Numbers.add(88);
	
		System.out.println(Numbers.remove(1));
		System.out.println(Numbers);
	//	System.out.println(Numbers.remove(55));
		
		for(int i=0; i<Numbers.size();i++)
		{
			if(Numbers.get(i)==55)
				Numbers.remove(i);
		}
		
		System.out.println(Numbers);
		Numbers.add(3, 90);
		System.out.println(Numbers);
		System.out.println("Length of list is "+Numbers.size());
		for(int i=0; i<Numbers.size();i++)
		{
			System.out.println(Numbers.get(i));
		}
		
		int [] arr=new int [Numbers.size()];
		
		for(int i=0;i<Numbers.size();i++)
		{
			arr[i]=Numbers.get(i);
			System.out.println("Values of array is" +arr[i]);
		}
		
		
				
		
		
	}

}
