/*
  	Date : 2020.05.11
  	Author : SEO
  	Description :  논리 연산자(logicOperation)
  	version : 1.1          
  
  
 */



		package Java0511;

			public class ex06_logicOperation {
				
				public static void main(String[] args) {
					
					// 논리 연산자 : AND 연산, OR연산, NOT연산
					
					// AND 연산 : && , 
					// A && B 일때, A,B 모두 true 여야 결과가 true
					// A,B 중에 하나라도 false 가 있으면 결과는 false
					
					// OR연산 : || 
					// A || B 일때, A,B 중에 하나라도 true 가 있으면 true
					// A,B모두 false 여야만 결과가 false 
					
					// NOT연산 : !
					// boolean 변수 앞에 사용하면 true 가 false로
					// false가 true 로 바뀜
					
					
					boolean result;
					
					result = true && true;
					System.out.println("true && true :" + result);
					
					result = true && false;
					System.out.println("true && fals :" + result);
					
					result = false && false;
					System.out.println(" false && false :" + result);
					
					result = (5>3) && (3>1);
					System.out.println("(5>3) && (3>1) : " + result);
					
					result = (5>3) && (3<1);
					System.out.println("(5>3) && (3<1) : " + result);
					
					
					
					//OR
					
					result = true || true;
					System.out.println("true || true: " + result);
					result = false || false;
					System.out.println("false || fals : " + result);
					
					result = false || true;
					System.out.println("false || true : " + result);
					
					
					//NOT
					
					result = true;
					
					result = !result;
					System.out.println("!result : " + result);
					
					result = !result;
					System.out.println("!!result : " + result);
					
					
					
							
					result = !false;
					System.out.println("!false : " + result);
					
					
					
				
					
				}

}
