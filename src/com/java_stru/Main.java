package com.java_stru;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String aString="testcase";
//		switch (aString) {
//		case "it":
//			System.out.println("not this one");
//			break;
//		case "testcase":
//			System.out.println("this one");
//			break;
//		default:
//			System.out.println("none");
//			break;
//		}
//		char[][] a={{'a','b','c'},{'a','c','e'},{'a','t','m'}};
//		Arrays.sort(a);
//		int i=0,j=0;
//		while(i<a.length){
//			while(j<a[i].length){
//				System.out.print(a[i][j]+" ");
//				j++;
//			}
//			i++;
//			j=0;
//			System.out.println();
//		}
//		archive ar=new archive(8);	
//		Scanner scanner=new Scanner(System.in);
//		String input=scanner.nextLine();
//		String[] inputStrings=input.split(",");
//		for(String per:inputStrings){
//			System.out.println(per);
//		}
//		quadrangle q=new quadrangle();
//		parallelogram p=new parallelogram();
//		square s=new square();
//		if (s instanceof parallelogram) {
//			System.out.println("��������ƽ���ı�����Ķ���");
//		}
//		else {
//			System.out.println("�����εĶ�����ƽ���ı��εĶ���");
//		}//��������Ǹ�������ʵ��
//		if (q instanceof parallelogram) {
//			System.out.println("ʵ���˽ӿ�");
//		}else {
//			System.out.println("û��ʵ�ֽӿ�");
//		}
		
	}


}
//**********����instanceof*******/
class quadrangle{
	
}
class parallelogram extends quadrangle{
	
}
class square extends parallelogram{
	
}

//class archive{
//	archive(int a){
//		System.out.println("with variable constructor "+a);
//	}
//	archive() {
//		System.out.println("without variable constructor");
//		// TODO Auto-generated constructor stub
//	}
////	protected void finalize(){
////		this.finalize();
////	}
//	
//}
