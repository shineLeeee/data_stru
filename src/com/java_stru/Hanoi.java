package com.java_stru;

public class Hanoi {
	void move(int n,String fromPeg,String toPeg,String aux){
		if(n==1){
			System.out.println("move peg "+n+" from "+fromPeg+" to "+toPeg);
			return;
		}
		move(n-1, fromPeg, aux, toPeg);
		System.out.println("move peg "+n+" from "+fromPeg+" to "+toPeg);
		move(n-1, aux, toPeg, fromPeg);
		
	}

}
