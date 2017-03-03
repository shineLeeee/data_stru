package com.java_stru;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class FormulaMatch {
	void match(String pre){
//		����˼������ջ������һ����С��������ȼ�
//		String pre="(3+4)*6+3*1+3*4";
		char[] preArr=pre.toCharArray();
		Stack<Character> operator=new Stack<Character>();//��������
		Stack<Character> formula=new Stack<Character>();//��Ž����
		Map map=new HashMap<>();
		map.put('*', 2);
		map.put('/', 2);
		map.put('+', 1);
		map.put('-', 1);
		map.put('#', 0);//�������ȼ�ӳ��
		map.put('(', 0);
	    Character former='#';
	    char judge;
		Pattern pattern=Pattern.compile("[0-9]*");
		for (Character perChar : preArr) {
//			System.out.println(pattern.matcher(perChar+"").matches());
			if(pattern.matcher(perChar+"").matches()){
				formula.push(perChar);
			}
			else{
				if(perChar=='('){//������һ���ж���Ϊ������������������ջ
					operator.push('(');
					former=perChar;
					}
				else if(perChar!=')'){
				Character latter=perChar;
				int latterInt=Integer.parseInt(map.get(latter).toString());
				int formerInt=Integer.parseInt(map.get(former).toString());
				if(latterInt>formerInt){
					operator.push(perChar);//�����ǰ�����ȼ��ߣ�push��operator��ı�former
					former=perChar;
				}
				else {
					formula.push(operator.pop());//�����ǰ�����ȼ��ͣ���ǰ��push��formula��,��ǰ��ջ��former
					operator.push(perChar);
					former=perChar;
					}
				}
				else {//������������ֱ��pop
					do {
						judge=operator.pop();
//					    System.out.println(judge);
					    formula.push(judge);
					} while (judge=='(');
					
					judge='\0';
					operator.pop();
					if(!operator.isEmpty())
					former=operator.lastElement();
//					System.out.println("���ڵ����һ����"+former);
				}
			}
		}
		while(!operator.isEmpty()){
			formula.push(operator.pop());
		}
		
		for (Character character : formula) {//�����
			System.out.print(character);
		}
	}

}
