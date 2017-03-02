package com.java_stru;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SeqList sl=new SeqList(100);
		for(int i=0;i<100;i++){
			sl.insert(i, new Integer(i+1));
		}
		
		ArrayList<String> ssl=new ArrayList<>();
		ssl.add("world");
		LinkedList<Integer> elk=new LinkedList<>();
		
		
		System.out.print(sl.getData(5));
		

	}
	

}
