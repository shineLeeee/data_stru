package com.java_stru;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		SeqList sl=new SeqList(100);
//		for(int i=0;i<100;i++){
//			sl.insert(i, new Integer(i+1));
//		}
		//����˳���
//		ArrayList<String> ssl=new ArrayList<>();
//		ssl.add("world");
		//���Ե�����
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
		//����ջ
//		Stack stack=new Stack<Integer>();
//		int test[]={1,2,3,4};
//		stack.push(4);
//		stack.push(3);
//		stack.push(2);
//		stack.push(1);
//		for (int i=stack.size();i>0;i--) {
//			System.out.println(stack.pop());
//			System.out.println(stack.get(i));
		
////		����˼������ջ������һ����С��������ȼ�
//		String pre="(3+4)*6+3*1+3*4";
//		char[] preArr=pre.toCharArray();
//		Stack<Character> operator=new Stack<Character>();//��������
//		Stack<Character> formula=new Stack<Character>();//��Ž����
//		Map map=new HashMap<>();
//		map.put('*', 2);
//		map.put('/', 2);
//		map.put('+', 1);
//		map.put('-', 1);
//		map.put('#', 0);//�������ȼ�ӳ��
//		map.put('(', 0);
//	    Character former='#';
//	    char judge;
//		Pattern pattern=Pattern.compile("[0-9]*");
//		for (Character perChar : preArr) {
////			System.out.println(pattern.matcher(perChar+"").matches());
//			if(pattern.matcher(perChar+"").matches()){
//				formula.push(perChar);
//			}
//			else{
//				if(perChar=='('){//������һ���ж���Ϊ������������������ջ
//					operator.push('(');
//					former=perChar;
//					}
//				else if(perChar!=')'){
//				Character latter=perChar;
//				int latterInt=Integer.parseInt(map.get(latter).toString());
//				int formerInt=Integer.parseInt(map.get(former).toString());
//				if(latterInt>formerInt){
//					operator.push(perChar);//�����ǰ�����ȼ��ߣ�push��operator��ı�former
//					former=perChar;
//				}
//				else {
//					formula.push(operator.pop());//�����ǰ�����ȼ��ͣ���ǰ��push��formula��,��ǰ��ջ��former
//					operator.push(perChar);
//					former=perChar;
//					}
//				}
//				else {//������������ֱ��pop
//					do {
//						judge=operator.pop();
////					    System.out.println(judge);
//					    formula.push(judge);
//					} while (judge=='(');
//					
//					judge='\0';
//					operator.pop();
//					if(!operator.isEmpty())
//					former=operator.lastElement();
////					System.out.println("���ڵ����һ����"+former);
//				}
//			}
//		}
//		while(!operator.isEmpty()){
//			System.out.println(formula.push(operator.pop()));
//		}
//		
//		for (Character character : formula) {//�����
//			System.out.print(character);
//		}
		BracketMatch matcher=new BracketMatch();
		matcher.match("a(b)c[]d[]]");
		
		
		
		
		}
		}
		
		

	
	


