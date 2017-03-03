package com.java_stru;
import java.util.*;

public class BracketMatch {
	void match(String a) throws Exception{
		/*括号匹配练习version2     核心思想,左括号入栈，右括号时左括号出栈，如果右括号时左为空右多，
		 * 如果右括号时左不匹配顺序错,如果全部结束栈不空左多，否则全部正确*/
//		String a="((}(]((a+(2*4)+())";//待匹配字符串//
		int i=a.length();
		Stack<Character> judge=new Stack<Character>();
		
		char[] m=a.toCharArray();
        for (char c : m) {
			if(c=='(' || c=='{'||c=='[')
				judge.push(c);
			if(c==')'||c==']'||c=='}'){			
				if(judge.isEmpty()){
					System.out.println("右括号多了");
					break;
					
				}
				else {
				char seqJudge=judge.pop();
				if(!((c==')'&&seqJudge=='(')||(c==']'&&seqJudge=='[')||(c=='}'&&seqJudge=='{'))){
					System.out.println("括号次序不正确");
					break;
					
				}
				}
			}
				
				i--;
		}
       if(i==0&&judge.isEmpty()) System.out.println("匹配正确");
        else if (i==0&&!(judge.isEmpty())) {
			System.out.println("左括号多了");
		}
	}

}
