package com.java_stru;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SeqList sl=new SeqList(100);
		for(int i=0;i<100;i++){
			sl.insert(i, new Integer(i+1));
		}
		//≤‚ ‘À≥–Ú±Ì
//		ArrayList<String> ssl=new ArrayList<>();
//		ssl.add("world");
		//≤‚ ‘µ•¡¥±Ì
		LinkedList<Integer> elk=new LinkedList<>();
		
		elk.addFirst(1);
		elk.add(20);
		elk.add(30);
		elk.add(40);
		elk.add(2,100);
		elk.remove(1);
		for(int x=0;x<3;x++){
			System.out.println(elk.get(x));
		}
		Stack<String> stack=new Stack<>();
		
		System.out.print(sl.getData(5));
		

	}
	

}
