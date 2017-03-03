package com.java_stru;

public class BruteForce {
	void match(String sub,String obj){
		char[] objl=obj.toCharArray();
		char[] subl=sub.toCharArray();
		int i = 0, j=0;
		while (i<obj.length()&&j<sub.length()){
			if(objl[i]==subl[j]){
				i++;
				j++;
			}
			else {
				i=i-j+1;
				j=0;
			}
		}
		if(j==sub.length())
			System.out.println("Æ¥Åä³É¹¦");
		else {
			System.out.println("Æ¥ÅäÊ§°Ü");
		}
		
	}

}
