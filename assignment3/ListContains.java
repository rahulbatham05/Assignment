package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListContains {

	public static void main(String[] args) {
		
		List<String> L=new ArrayList<>();
		L.add("Web Automation");
		L.add("API Automation");
		L.add("Mobile Automation");
		
		Iterator<String> I=L.iterator();
		
		while(I.hasNext())
		{
			
			if(I.next().contains("Mobile")==true)
			{
				System.out.println("True");	
			}
			else
				System.out.println("False");
			
		}

	}

}
