/*
 	Date : 2020.05.14
  	Author : SEO
  	Description :  4일차 정리
  	version : 1.0                 
  
  
 */




	package java0513;

		public class Ex00_day4_Summary {
			
			public	static void main(String[]agrs) {
				
				// 1. 반복문 for문
				
				/*
				  	for (초기화식; 조건식; 증감식){
				  		 수행할 반복문 내용
				  	
				  	}
				  ☆초기화식 int i = 1;
				  ☆조건식 i<=10;
				  ☆(참일경우)수행할 반복문 내용
				  (거짓일경우) 반복문 종료
				 ☆증감식 
				 ☆조건식 
				  
				  
				 */
				// 2.중첩 for문 ex)구구단
				/*
				 	for(초기화식;조건식;증감식){
				 	
				 		for(초기화식;조건식;증감식){
				 			수행할 반복문 내용
				 			// (외부 for문 x 내부 for문)
				 			 
				 		}
				 		// 내부 for문 반복내용
				 		// 내부 for문 횟수
				 		
				 	}
				 */
				// 3. continue 문 ex)홀수, 짝수 구하기
				// 반복문과 함게 사용
				// continue 가 실행되면 이후 반복문 내용은 실행되지않는다.
				//	다시 증감식으로 
				
				
				/*
				  for(초기화식;조건식;증감식){
				  		
				  		수행할 반복문내용1;
				  		continue;
				  		
				  		수행할 반복문내용2;
				  		수행할 반복문내용3;
					}
				 */
				// 4. 별찍기 예제
				// 한줄씩 주석을 달아서 빠른 이해를 돕는다.
				
				// 5.while문
				// 1) for 와 비슷하게 사용
				
				/*
				  		초기화식
				  		while(조건식){
				  			반복할 내용
				  			증감식
				  		
				  		}
				  
				  
				 */
				int i = 0; //초기화식
				while(i<=10) { // 조건식
					System.out.println(i+" ");//반복문내용
					i++; // 증감식
					
				}
				System.out.println();
				System.out.println("while문 이후 i값 : " + i);
			
				// (2) 반복횟수를 정하지않고 사용하는 방법

		  		/*
		  		  	boolean 조건변수 = true;
		  		  	
		  		  	while(조건변수){
		  		  		반복할 내용
		  		  		//반복문 종료
		  		  		1) 조건 변수를 false로 만들기
		  		  		2) break;
		  		  	}
		  		  */
			
			
			}

}
