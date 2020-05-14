/*
 	Date : 2020.05.13
  	Author : SEO
  	Description :  continue
  	version : 1.1               
  
  
 */



	package java0513;

		public class ex03_continue {
			
			public static void main(String []agrs) {
				// continue 문은 반복문과 함께 사용
				// 반복문 안에서continue문을 만나면
				// 이후 문장은 수행하지 않고
				//for 문의 증감식을 수행한다.
				
				/*
				  	for (초기화식 ; 조건식; 증감식 ){
				  		특정조건
				  		continue;
				  	
				  		반복문 수행;
				  	}
				  
				 
				  
				 */
				
				int sum = 0;
				
				for(int i=1; i<=100; i++) {
					
					if(i%2 == 1) {
						continue;
					}
					sum += i;
					
					}
					System.out.println("1부터 100까지 짝수 합 : " + sum);
					
					
				
					
				
				
			}

}
