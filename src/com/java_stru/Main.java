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
		//≤‚ ‘’ª
//		Stack stack=new Stack<Integer>();
//		int test[]={1,2,3,4};
//		stack.push(4);
//		stack.push(3);
//		stack.push(2);
//		stack.push(1);
//		for (int i=stack.size();i>0;i--) {
//			System.out.println(stack.pop());
//			System.out.println(stack.get(i));
		//¿®∫≈∆•≈‰¡∑œ∞version1
//		String a="a+(2*4)+()))";
//		int i=a.length();
//		Stack<Character> judge=new Stack<Character>();
//		char[] m=a.toCharArray();
//        for (char c : m) {
//			if(c=='(' || c=='{'||c=='[')
//				judge.push(c);
//			if(c==')'||c==']'||c=='}'){
//				if(!judge.isEmpty()) judge.pop();
//				else {
//					System.out.println("”“¿®∫≈∂‡¡À");
//					break;
//				}
//			}
//				
//				i--;
//		}
//        if(i==0&&judge.isEmpty()) System.out.println("∆•≈‰’˝»∑");
//        else if (i==0&&!(judge.isEmpty())) {
//			System.out.println("◊Û¿®∫≈∂‡¡À");
//		}
	    //¿®∫≈∆•≈‰¡™œµ version2
		String a="a+(2*4)+()))";
		int i=a.length();
		Stack<Character> judge=new Stack<Character>();
		char[] m=a.toCharArray();
		
		}
		}
		
		

	
	


