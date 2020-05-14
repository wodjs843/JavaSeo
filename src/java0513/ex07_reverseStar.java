/*
 	Date : 2020.05.13
  	Author : SEO
  	Description :  forStar
  	version : 1.1                
  
  
 */



		package java0513;

			public class ex07_reverseStar {
				
				public static void main(String[]agrs) {
					

					int i;
					for (i=1; i<=5; i++) {
						// i가 1일때는
						// 내부for문 1번 반복
						// i가  2일때는
						// 내부for문 2번 반복
						// i가 3일때는
						// 내부 for문 3번반복
						// i가 4일때는
						// 내부 for문 4번반복
						// i가 5일때는
						// 내부 for문 5번반복
						
						
						for(int j=5; j>=i; j--) {
							
							
							System.out.print("*");
							
							
							}
						System.out.println();
					}
					
				}

}
