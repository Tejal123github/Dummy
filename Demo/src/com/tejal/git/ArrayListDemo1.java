package com.tejal.git;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
//creating list of names
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("Teju");
		nameList.add("yash");
		nameList.add("ram");
		nameList.add("shym");
		
		//using iterator
		Iterator<String> itr=nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//using for-each loop
		for(String str:nameList) {
			System.out.println(nameList);
		}
		
	}

}
