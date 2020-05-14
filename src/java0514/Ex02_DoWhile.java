/*
  	Date : 2020.05.12
  	Author : SEO
  	Description :   DoWhile
  	version : 1.0                
  
  
 */


	package java0514;

		public class Ex02_DoWhile {
			
			public static void main(String[]agrs) {
				// do while
				//	while과 do-while의 차이점
				// while은 반복문 실행하기전에 조건식 검사
				// do-while 은 반복문 실행 후 조건식 검사
				// do-while	은 무조건 한번은 실행
				
				/*
				  	do{
				  		반복할 내용
				  		
				  	}while(조건식);
				  
				 */
				int i = 11;
				do {
					System.out.println("do-while 에서 i값 : " + i);
					i++;
				}while (i <= 10);
				
				
//				while(i<=10) {
//					System.out.println("while에서 i값: " + i);
//					i++;
//				}
			}

}
