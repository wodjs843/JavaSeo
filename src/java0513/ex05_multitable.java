/*
 	Date : 2020.05.13
  	Author : SEO
  	Description :  multitable
  	version : 1.1               
    
  
  
  
 */


		package java0513;

			public class ex05_multitable {
				
				public static void main(String[]agrs) {
					
					int kor;
					
					
					for(int i=1; i<=9;i++) {
						
						for(int j=2; j<=9; j++) {
					
							kor = i*j;
							
							
							System.out.print(j+"x"+ i + "=" + kor);
							System.out.print("\t");
						}
							
							System.out.println();
					
							
							
							}
							// 응용문제
							// 홀수값만
					
					int eng;
					
					for(int i=1; i<=9; i++) {
						for(int j=2; j<=9; j++) {
							if(j%2 == 0) {
								continue;
							}
							
							eng = i*j;
							System.out.print(j + "x" + i + "=" + eng);
							System.out.print("\t");
						}
							System.out.println();
					}
					
						
						
					
				
				
				
				}
			
			}

