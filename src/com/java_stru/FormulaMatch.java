package com.java_stru;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

public class FormulaMatch {
	void match(String pre){
//		核心思想是用栈来保存一个由小到大的优先级
//		String pre="(3+4)*6+3*1+3*4";
		char[] preArr=pre.toCharArray();
		Stack<Character> operator=new Stack<Character>();//存放运算符
		Stack<Character> formula=new Stack<Character>();//存放结果表
		Map map=new HashMap<>();
		map.put('*', 2);
		map.put('/', 2);
		map.put('+', 1);
		map.put('-', 1);
		map.put('#', 0);//设置优先级映射
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
				if(perChar=='('){//单独做一个判断是为了让左括号无条件进栈
					operator.push('(');
					former=perChar;
					}
				else if(perChar!=')'){
				Character latter=perChar;
				int latterInt=Integer.parseInt(map.get(latter).toString());
				int formerInt=Integer.parseInt(map.get(former).toString());
				if(latterInt>formerInt){
					operator.push(perChar);//后面比前面优先级高，push进operator里，改变former
					former=perChar;
				}
				else {
					formula.push(operator.pop());//后面比前面优先级低，把前面push进formula里,当前进栈变former
					operator.push(perChar);
					former=perChar;
					}
				}
				else {//当碰到右括号直接pop
					do {
						judge=operator.pop();
//					    System.out.println(judge);
					    formula.push(judge);
					} while (judge=='(');
					
					judge='\0';
					operator.pop();
					if(!operator.isEmpty())
					former=operator.lastElement();
//					System.out.println("现在的最后一个是"+former);
				}
			}
		}
		while(!operator.isEmpty()){
			formula.push(operator.pop());
		}
		
		for (Character character : formula) {//看结果
			System.out.print(character);
		}
	}

}
