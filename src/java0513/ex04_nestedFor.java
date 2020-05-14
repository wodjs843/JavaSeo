/*
 	Date : 2020.05.13
  	Author : SEO
  	Description :  nestedFor
  	version : 1.1               
   
  
  
 */



	package java0513;

		public class ex04_nestedFor {
			public static void main(String[]agrs) {
				// 중첩 for문
				
				/*
				  	for(초기화식;조건식;증감식){
				  	
				  		for(초기화식;조건식;증감식){
				  			실행할 반복문
				  		}
				  		
				  	}
				
				  
				 */
				
					int i;
					for (i=1; i<=2; i++) {
						for(int j=1; j<=3; j++) {
							System.out.print("i값 :" + i);
							System.out.println("\tj값 :" + j);
							
							
						}
						System.out.println("===================");
					}
				
			}

}
