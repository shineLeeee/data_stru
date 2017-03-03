package com.java_stru;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Plalindrome {
	void match(String test){
		Stack<Character> a=new Stack();
		LinkedList<Character> b=new LinkedList();
		char[] raw=test.toCharArray();
		for (char perChar : raw) {
			a.push(perChar);
			b.add(perChar);
		}
		while(!a.isEmpty()){
			char perA=a.pop();
			char perB=b.remove();
			if(perA!=perB){
				System.out.println("非回文");
				break;
			}
		}
		if (a.isEmpty()) 
		System.out.println("是回文");
		
	}

}
