package assignment4;

import java.util.ArrayList;
import java.util.List;

public class RevserseList {

	public static void main(String[] args) {
		
		List<String> L=new ArrayList<>();
		L.add("Java");
		L.add("Selenium");
		L.add("TestNG");
		L.add("Git");
		L.add("GitHub");
		
		for(int i=L.size()-1; i>=0;i--)
		{
			System.out.println(L.get(i));
		}
	}

}
