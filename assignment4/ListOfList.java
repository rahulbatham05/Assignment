package assignment4;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		List<Integer>l2=new ArrayList<>();
		//List<Integer>l3=new ArrayList<>();
		l2.add(9);
		l2.add(19);
		l2.add(29);
		List<Integer>l3=new ArrayList<>();
		l3.add(7);
		l3.add(17);
		l3.add(27);
		
		List<List<Integer>> LOL=new ArrayList<>();
		LOL.add(l1);
		LOL.add(l2);
		LOL.add(l3);
		System.out.println("Final list is"+LOL);
		

	}

}
