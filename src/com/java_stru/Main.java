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
		/*����ƥ����ϰversion2     ����˼��,��������ջ��������ʱ�����ų�ջ�����������ʱ��Ϊ���Ҷ࣬
		 * ���������ʱ��ƥ��˳���,���ȫ������ջ������࣬����ȫ����ȷ*/
//		String a="((}(]((a+(2*4)+())";//��ƥ���ַ���//
//		int i=a.length();
//		Stack<Character> judge=new Stack<Character>();
//		char[] m=a.toCharArray();
//        for (char c : m) {
//			if(c=='(' || c=='{'||c=='[')
//				judge.push(c);
//			if(c==')'||c==']'||c=='}'){			
//				if(judge.isEmpty()){
//					System.out.println("�����Ŷ���");
//					break;
//				}
//				else {
//				char seqJudge=judge.pop();
//				if(!((c==')'&&seqJudge=='(')||(c==']'&&seqJudge=='[')||(c=='}'&&seqJudge=='{'))){
//					System.out.println("���Ŵ�����ȷ");
//					break;
//				}
//				}
//			}
//				
//				i--;
//		}
//        if(i==0&&judge.isEmpty()) System.out.println("ƥ����ȷ");
//        else if (i==0&&!(judge.isEmpty())) {
//			System.out.println("�����Ŷ���");
//		}
		//����˼������ջ������һ����С��������ȼ�
		String pre="5*(3+4)-6";
		char[] preArr=pre.toCharArray();
		Stack<Character> operator=new Stack<Character>();//��������
		Stack<Character> formula=new Stack<Character>();//��Ž����
		formula.push('#');//��ֹ��
		Map map=new HashMap<>();
		map.put('*', 4);
		map.put('/', 4);
		map.put('+', 3);
		map.put('-', 2);
		map.put('#', 0);//�������ȼ�ӳ��
		
	    Character former='#';
		Pattern pattern=Pattern.compile("[0-9]*");
		for (Character perChar : preArr) {
//			System.out.println(pattern.matcher(perChar+"").matches());
			if(pattern.matcher(perChar+"").matches()){
				formula.push(perChar);
			}
			else{
				Character latter=perChar;
				int latterInt=Integer.parseInt(map.get(latter).toString());
				int formerInt=Integer.parseInt(map.get(former).toString());
				if(latterInt>formerInt){
					operator.push(perChar);//�����ǰ�����ȼ��ߣ�push��operator��ı�former
					former=perChar;
				}
				else {
					formula.push(operator.pop());//�����ǰ�����ȼ��ͣ���ǰ��push��formula��޸�perCharΪformer
					operator.push(perChar);
					former=perChar;
					}
			}
		}
		for (Character character : operator) {//��ʣ��������ѹ����
			formula.push(operator.pop());
		}
		for (Character character : formula) {//�����
			System.out.print(character);
		}
		
		
		
		
		}
		}
		
		

	
	


