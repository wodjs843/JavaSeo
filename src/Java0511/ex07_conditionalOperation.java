/*
 	Date : 2020.05.11
  	Author : SEO
  	Description :  조건 연산자(conditionalOperation)
  	version : 1.1           
  
  
 */




	package Java0511;

		public class ex07_conditionalOperation {
			
			public static void main(String[] args) {
				
				// 삼항 연산자
				
				// (조건식) ? 참일때 값 : 거짓일때 값;
				int inAge = 29;
				int hoonAge = 50;
				
				char resultChar;
				int resultInt;
				String resultStr;
				// (조건식) ? 참일때 값 : 거짓일때 값;
				resultChar = (inAge > hoonAge) ? 'O' : 'X';
				
				resultInt = (inAge > hoonAge) ? '0' : '1';
				
				resultStr = (inAge > hoonAge) ? "참일경우" : "거짓일경우";
				// 문제
				// 조건연산자를 사용하여  10이 짝수인 경우에는 true,
				// 홀수인 경우에는 false 출력하는 조건연산자를 작성하시오.
				
				System.out.println("resultChar: "+ resultChar);
				System.out.println("resultInt:"  + resultInt);
				System.out.println("rsultStr : " + resultStr);
				
				
				int num = 10;
				boolean resultEven=true ;
				
				// 조건 연산자 작성
				
				System.out.println(resultEven);
				
			resultEven = (num%2 == 0) ? true : false ;
			System.out.println(resultEven);
		
			
				
				
				
			
				
				
				
				
				
				
			
				
			}

}
