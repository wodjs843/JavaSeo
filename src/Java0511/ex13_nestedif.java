/*
 	Date : 2020.05.11
  	Author : SEO
  	Description :  중첩이프문 (if)
  	version : 1.1                 
  
  
 */



	package Java0511;

import java.util.Scanner;

public class ex13_nestedif {
			public static void main(String[] args) {
				// 중첩if 문 : if문 안에 if문
				
				// 학점출력 프로그램
				//1. 100점을 초과하면 
				// "입력 범위를 초과하셨습니다" 출력
				//2. 학점처리
				//A+ : 95~100
				//A : 90~94
				//B+ : 85~89
				//B : 80~84
				//C+ : 75~79
				//C : 70~74
				//D+ : 65~69
				//D : 60~64
				//F : 60미만
				
				//3. 프린트문은 한번만 사용
				
				Scanner sc = new Scanner(System.in);
				int score;
				String grade;
				System.out.println("점수를 입력해주세요");
				score = sc.nextInt();
				
				if(score <= 100) {
					if(score >= 90) {
						
						if(score >=95) {
							grade = "A+";
						}else{
							grade = "A";
						}
					}else if(score >= 80){
						if(score >= 85) {
							grade = "B+";
						}else{
							grade = "B";
					}
					}else if(score >= 70){
						if(score >= 75){
							grade = "C+";
						}else{
							grade = "C";
						}
							
								
					}else if(score >= 60){
						if(score >= 65){
							grade = "D+";
						}else{
							grade = "D";
						}
						
					}else{
							grade = "F";
						
					}	
					
					System.out.println("당신의 학점은" + grade + "최고학점입니다");
					
				}else{
					System.out.println("입력범위를 초과하셨습니다");
				}
				
			}
}
				
				
			
			


