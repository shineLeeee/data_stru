package com.java_stru;
import java.util.*;

public class BracketMatch {
	void match(String a) throws Exception{
		/*����ƥ����ϰversion2     ����˼��,��������ջ��������ʱ�����ų�ջ�����������ʱ��Ϊ���Ҷ࣬
		 * ���������ʱ��ƥ��˳���,���ȫ������ջ������࣬����ȫ����ȷ*/
//		String a="((}(]((a+(2*4)+())";//��ƥ���ַ���//
		int i=a.length();
		Stack<Character> judge=new Stack<Character>();
		
		char[] m=a.toCharArray();
        for (char c : m) {
			if(c=='(' || c=='{'||c=='[')
				judge.push(c);
			if(c==')'||c==']'||c=='}'){			
				if(judge.isEmpty()){
					System.out.println("�����Ŷ���");
					break;
					
				}
				else {
				char seqJudge=judge.pop();
				if(!((c==')'&&seqJudge=='(')||(c==']'&&seqJudge=='[')||(c=='}'&&seqJudge=='{'))){
					System.out.println("���Ŵ�����ȷ");
					break;
					
				}
				}
			}
				
				i--;
		}
       if(i==0&&judge.isEmpty()) System.out.println("ƥ����ȷ");
        else if (i==0&&!(judge.isEmpty())) {
			System.out.println("�����Ŷ���");
		}
	}

}
