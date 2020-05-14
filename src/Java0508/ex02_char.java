/*
    Date : 2020.05.08
  	Author : SEO
  	Description : Java 기본 설정
  	version : 1.0 
  
  
  
 */
package Java0508;

public class ex02_char {
	
	public static void main(String[] agrs) {
		
		// 문자형 변수타입 char(2byte)
		
		char ch1;
		ch1 = 'A'; //65
		
		System.out.println("A");
		System.out.println(ch1);
		System.out.println((int)ch1);
		// 문자형을 숫자로 바꿀때 변수명 앞에 (int)
		
		char ch2 = 'B';
		System.out.println((int)ch2);
		
		char ch3 = 'a';//97
		char ch4 = 'b';//98
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		
		int num1 = 65;
		System.out.println((char)num1);
		// 숫자를 문자형으로 바꿀때 변수명 앞에 (char)
		
		char seo = '서';
		char seo1 = '재';
		char seo2 = '언';
		System.out.println((int)seo);
		System.out.println((int)seo1);
		System.out.println((int)seo2);
		
		int num2 = 49436;
		int num3 = 51116;
		int num4 = 50616;		
		System.out.println((char)num2);
		System.out.println((char)num3);
		System.out.println((char)num4);
		
		char ch6 = 'ぁ';
		System.out.println((int)ch6);
		
		
		}
	

}
