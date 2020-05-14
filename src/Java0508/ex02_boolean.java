/*
 	Date : 2020.05.08
  	Author : SEO
  	Description : Java 기본 설정
  	version : 1.0  
  
 
 */



package Java0508;

public class ex02_boolean {
	public static void main(String[] agrs) {
		// 논리형
		// boolean ( Y / N ) =>> true / false
		
		int num1,num2;
		num1 = 1;
		num2 = 2;
		
		boolean bool1 = true;
		System.out.println(bool1);
		
		boolean bool2 = false;
		System.out.println(bool2);
		
		boolean bool3;
		
		
		if(num1>num2) { // num1 값이 num2보다 크다 
			bool3 = false; // num1 값이 num2보다 적기 때문에 false
		} else { 
			bool3 = true;
		}
		
		System.out.println(bool3);
		
		
		
	}

}
