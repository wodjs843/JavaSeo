/*
 	Date : 2020.05.11
  	Author : SEO
  	Description :  조건문 연습문제 (ifExample1)
  	version : 1.1                
  
  
 */




	package Java0511;

import java.util.Scanner;

public class ex12_ifExample1 {
			
			public static void main(String[] args) {
				
				// 문제. 성적 출력 예제
				// 점수를 입력받아서
				//90점 이상이면 "A 학점 입니다" 출력
				//A : 90~100
				//B : 80~89
				//C : 70~79
				//D : 60~69
				//F : 60미만
				
				
				Scanner sc = new Scanner(System.in);
				int score;
				
				System.out.print("100점은 나의것");
				score = sc.nextInt();
				
				if (score >= 90) {
					System.out.println("A학점 입니다");
				}else if(score >= 80) {
					System.out.println("B학점 입니다");
				}else if(score >= 70) {
					System.out.println("C학점 입니다");
				}else if(score >= 60) {
					System.out.println("D학점 입니다");
				}else{
					System.out.println("F학점 입니다");
					
				}
				
					
				
				/*
				 	만약(점수가 90점 이상){
				 		A학점 출력
				 	} 그리고 만약(점수가 80점 이상){
				 		B학점 출력
				 	} 그리고 만약(점수가 70점 이상){
				 		
				 	}
				 */
				
			}

}
