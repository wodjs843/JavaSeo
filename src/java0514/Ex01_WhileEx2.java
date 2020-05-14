/*
 	Date : 2020.05.14
  	Author : SEO
  	Description :  while 예제문
  	version : 1.0          
 
  
 */





	package java0514;

import java.util.Scanner;

public class Ex01_WhileEx2 {
			
			public	static void main(String[]agrs) {
				//1.예금 2.출금 3.잔고 4.종료
				// 선택 >>1
				// 잔고 100000
				
				// 1.예금 2.출금 3.잔고 4.종료
				// 선택 >>
				
				Scanner sc = new Scanner(System.in);
				
				boolean run = true; //while 문 사용하기 위해서 run(조건변수)선언
				//int account;		//run(조건변수)선언, true 초기화
				int balance = 0;
				
				
				
				
				while (run) {
					System.out.println("=======================");
					System.out.println("1.예금 |2.출금|3.잔고|4.종료" );
					System.out.println("=======================");
					System.out.println("선택 >> ");
					
					
					 int menu = sc.nextInt();//menu 변수선언, 입력
					 
					 switch(menu) {
					 case 1:
						 System.out.print("예금액 >> ");
						 balance += sc.nextInt(); //예금액 입력
						 break;// switch문 탈출
					 case 2:
						 System.out.print("출금액 >> ");
						 balance -= sc.nextInt();
						
						 break;
					 case 3:
						 System.out.println("잔고 : " + balance);
						 break;
					 case 4:
						 run = false;//4.입력시 run값이 false로 변한다.
						 break;
					default :
						System.out.println("다시 입력해주세요.");
						 break;
					
					 }//switch문 종료
					System.out.println();
					
				}
				
				System.out.println("계좌거래를 종료합니다");
				
				
			}
}


