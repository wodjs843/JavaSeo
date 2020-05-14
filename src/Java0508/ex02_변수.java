/*
Date :
Autor :
Desctiption :
version :
*/
package Java0508;

public class ex02_변수 {

	public static void main(String[] args) {
		
		// 변수 : 프로그램 실행에 필요한 데이터를 저장하기
		// 위해 메모리 공간을 할당하고, 이름을 부여한 것 
	
		// var num = 0;
		// [변수 타입] [변수 명] = [변수 값]
	
		int age =35;
		
		int age1; // 변수 선언
		
		age1 = 35; // 변수 초기화
		
		// 1byte = 8bit 
		// 1byte = -2^7 ~ (2^7)-1
		// int : -2,147,483,648 ~ 2,147,483,647
		// long : 매우 크다
		//8byte = 64bit
		
		// 변수 타입		1byte		2byte		4byte		8byte	
		
		// 1. 정수형 : 	byte					int			iong
		// 2. 실수형 :	byte					float		bouble
		// 3. 문자형 :	
		// 4. 논리형 :
		
		byte bnum1 = -128;
		byte bnum2 = 127;
		
		// byte는 최소 -128 ~ 127까지이기 때문에 -128 아래 수나 127 위에 수는 사용할 수 없다
		
		//int bnum3 = -129;
		//int bnum4 = 128;
		
		//
		//short sNum1 = -32768;
		//short sNum2 =  32767;
		//short sNum3 = -32769;
		//short sNum4 =  32768;
		
		int iNum1 = -2147483648;
		int iNum2 = 2147483647;
		
		//변수 값에는 L을 썼지만 출력은 되지 않는다
		
		long iNum3 = -1322147400083648L;
		long iNum4 =  2123100047483648L;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	
		float pi1 =  3.14f;
		double pi2 = 3.14;
		
		System.out.println(pi1);
		System.out.println(pi2);
		
		// long은 L 추가
		// float는 f 추가
	}
	
}
