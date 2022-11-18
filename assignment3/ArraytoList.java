package assignment3;

import java.util.ArrayList;

import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		
		int [] A1=new int [5];
		A1[0]=20;
		A1[1]=545;
		A1[2]=98;
		A1[3]=54;
		A1[4]=87;
		
		
		List<Integer> L1=new ArrayList<>(); 
		
		for(int i=0; i<A1.length;i++)
		{
			L1.add(A1[i]);
		}
		System.out.println(L1);
		
	//	List<Integer> L2=new ArrayList<>(A1);
		
	//	List<Integer> L3=Arrays.asList(A1);
		

	}

}
