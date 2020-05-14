/*
 	Date : 2020.05.13
  	Author : SEO
  	Description :  loopFor 반복문
  	version : 1.1              
  
  
 */



		package java0513;
		
		import java.util.Scanner;
		
			public class ex02_forSnumToLnum {
				
				public static void main(String[]agrs) {
					
					Scanner sc = new Scanner(System.in);
					
				
					int sNum;
					//sNum을 변수선언
					int lNum; 
					// lNum을 변수선언
					int sum = 0;
					//sum = 0 을 변수선언
					System.out.println("시작값");
					sNum = sc.nextInt();
					//sNum을 입력받는 문장
					
					System.out.println("끝나는값");
					lNum = sc.nextInt();
					//lNum을 입력받는 문장
					
					// 1 대신 sNum
					// 10 대신 lNum
					
					// sum += i;
					// sum = sum + i;
					
					for(int i = sNum; i <=lNum ; i++){
				  		
						sum = sum + i;
				  		System.out.print(i);
				  		
				  		if(i<lNum) {
				  			System.out.println("+");
				  		}else {
				  			System.out.println("=" + sum);
				  		}
				  		
				  	}
				
						
						
						}
						
					
					
				
					
					
						
						
			}
				


