package com.java_stru;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		SeqList lst=new SeqList(10);              //测试建立的单链表 其实可以直接用内建的ArrayList和LinkedList
//		lst.insert(0, 10);
//		lst.insert(1, 11);
//		lst.insert(2, 12);
//		System.out.println(lst.getData(1));
//		BracketMatch matcher=new BracketMatch();  //测试括号匹配
//		matcher.match("a(b)c[]d[]]");
//		FormulaMatch matcher2=new FormulaMatch();  //测试公式匹配
//		matcher2.match("(3+4)*6+3*1+3*4");
//		Plalindrome pl=new Plalindrome();          //测试是否是回文
//		pl.match("abcdefedcba");
//		BruteForce bf=new BruteForce();
//		bf.match("def", "abcdefghifj");             //burteforce字符串匹配测试
//		Sort hSearch=new Sort();
//		hSearch.search(new int[]{6,4,8,7,8});       //交换排序
//		Hanoi hanoi=new Hanoi();
//		hanoi.move(4, "a", "c", "b");				//汉诺塔
		int i=1;
		int b=1;
		while(i<=1500){
			if (b%2==0||b%5==0||b%3==0) {
				i++;
				b++;
			}
			else {
				b++;
			}
		}
		System.out.println(b);
		
		
		
		}
		}
		
		

	
	


