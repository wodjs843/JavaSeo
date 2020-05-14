/*
 	Date : 2020.05.12
  	Author : SEO
  	Description :  iciaHospital
  	version : 1.0                  
  
  
 */




	package java0512;

import java.util.Scanner;

public class ex06_iciaCafe {
			
			public static void main(String[] args) {
				
				
				
				Scanner sc = new Scanner(System.in);
				int num;
				int price = 0;
				String menu = "";
				
				System.out.println("여기가..어디요...? ICIA 병원이오 안심하지마세요");
				System.out.println("쳐맞기전에 진료받을 항목을 고르세요");
				
				System.out.println("1.총살형\t\t2.묶인상태로 물리치료");
				System.out.println("3.고자수술\t\t4.수류탄형");
				
				System.out.println("Aㅏ진료항목은 골랐습니까 >>");
				num = sc.nextInt();
				
				switch(num) {
				case 1: 
					menu = "총살형";
					price = 4000;
					break;
				case 2: 
					menu = "묶인상태로 물리치료";
					price = 4500;
					break;
				case 3:
					menu = "고자수술";
					price = 5000;
					break;
				case 4:
					menu = "수류탄형";
					price = 5500;
					break;
				default:	
					System.out.println("Aㅏ 존내맞고싶냐");
					
					}
				if(num >=1 && num <=4) {
					System.out.println("\n 니가고른 진료항목은" + menu);
					System.out.println("이보시오! 의사양반! 진료비는" + price +" 진료가 끝났습니다");
				}
				System.out.println("더 쳐맞기 전에 꺼지세요");
				
			}
			

}
