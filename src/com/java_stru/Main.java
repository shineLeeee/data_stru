package com.java_stru;

import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SeqList sl=new SeqList(100);
		for(int i=0;i<100;i++){
			sl.insert(i, new Integer(i+1));
		}
		//测试顺序表
//		ArrayList<String> ssl=new ArrayList<>();
//		ssl.add("world");
		//测试单链表
//		LinkedList<Integer> elk=new LinkedList<>();
//		
//		elk.addFirst(1);
//		elk.add(20);
//		elk.add(30);
//		elk.add(40);
//		elk.add(2,100);
//		elk.remove(1);
//		for(int x=0;x<3;x++){
//			System.out.println(elk.get(x));
//		}
//		Stack<String> stack=new Stack<>();
//		
//		System.out.print(sl.getData(5));
		//测试栈
//		Stack stack=new Stack<Integer>();
//		int test[]={1,2,3,4};
//		stack.push(4);
//		stack.push(3);
//		stack.push(2);
//		stack.push(1);
//		for (int i=stack.size();i>0;i--) {
//			System.out.println(stack.pop());
//			System.out.println(stack.get(i));
		/*括号匹配练习version2     核心思想,左括号入栈，右括号时左括号出栈，如果右括号时左为空右多，
		 * 如果右括号时左不匹配顺序错,如果全部结束栈不空左多，否则全部正确*/
//		String a="((}(]((a+(2*4)+())";//待匹配字符串//
//		int i=a.length();
//		Stack<Character> judge=new Stack<Character>();
//		char[] m=a.toCharArray();
//        for (char c : m) {
//			if(c=='(' || c=='{'||c=='[')
//				judge.push(c);
//			if(c==')'||c==']'||c=='}'){			
//				if(judge.isEmpty()){
//					System.out.println("右括号多了");
//					break;
//				}
//				else {
//				char seqJudge=judge.pop();
//				if(!((c==')'&&seqJudge=='(')||(c==']'&&seqJudge=='[')||(c=='}'&&seqJudge=='{'))){
//					System.out.println("括号次序不正确");
//					break;
//				}
//				}
//			}
//				
//				i--;
//		}
//        if(i==0&&judge.isEmpty()) System.out.println("匹配正确");
//        else if (i==0&&!(judge.isEmpty())) {
//			System.out.println("左括号多了");
//		}

		
		
		
		}
		}
		
		

	
	


