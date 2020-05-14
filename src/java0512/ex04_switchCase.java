/*
 	Date : 2020.05.12
  	Author : SEO
  	Description :   조건문SwitchCase
  	version : 1.0                
  
  
 */



	package java0512;

import java.util.Scanner;

public class ex04_switchCase {
			
			public static void main(String[] args) {
				
				/*
				 
				  	Switch(조건변수){
				  	Case 변수값:
				  			해당 조건이 맞을때 실행
				  	Case 변수값2:
				  			해당 조건이 맞을때 실행
				  			break;
				  			
				  	~~~~~
				  	Case 변수값n :
				  			해당 조건이 맞을때 실행
				  			break;
				  	default : 
				  			Case 에서 어떤 조건도 맞지 않을때 실행
				  			break;
				  	
				  
				  }
				  
				 */
				
				 Scanner sc = new Scanner(System.in);
				 
				 int num;
				 System.out.println("숫자 입력 >>");
				 num = sc.nextInt();
				 
				 switch(num) {
				 case 0:
					 System.out.println("0을 입력했습니다.");
					 break;
				 case 1:
					 System.out.println("1을 입력했습니다.");
					 break;
				 case 2:
					 System.out.println("2를 입력했습니다.");
					 break;
				default :
					System.out.println("그 외 숫자를 입력했습니다.");
					 break;
				 }
				 
				// break 문은 다음 case문을 실행하지않고
				// switch문을 빠져나가기 위해 사용한다
				// break가 없으면 case가 연속으로 실행
				 
					 
				
			}

}
