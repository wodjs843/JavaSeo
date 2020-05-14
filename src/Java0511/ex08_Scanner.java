/*
  	Date : 2020.05.11
  	Author : SEO
  	Description :  입력(Scanner)
  	version : 1.1            
  
  
 */




		package Java0511;

import java.util.Scanner;
//두번째
// Scanner 클래스는 java.util 패키지에 있는 입력 클래스
public class ex08_Scanner {
				
				public static void main(String[] args) {
					// 첫번째
					// 스캐너를 사용하기 위해 스캐너 객체 선언
					ex08_Scanner sc = new ex08_Scanner(System.in);
					ex08_Scanner scan = new ex08_Scanner(System.in);
					
					
					
					
					String name;
					int age;
					String Address; 
					
					System.out.println("println");
					System.out.print("print");
					System.out.println("두개의 차이점 확인하기");
					// ln : 줄바꿈
					
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					//세번째
					//변수에 입력한 값을 담는다.
					
					System.out.println("나이를 입력하세요.");
					age = sc.nextInt();
					sc.nextLine();
					//trim() : 앞뒤 공백을 제거한다.
					
					System.out.println("주소를 입력하세요.");
					Address = sc.nextLine().trim();
					
					System.out.println();
					System.out.println("===출력 내용===");
					System.out.println("입력한 이름 :" + name);
					System.out.println("입력한 나이 :" + age );
					System.out.println("입력한 주소 :" + Address);
					
					
					
					
					
					
					
				}

				private String nextLine() {
					// TODO Auto-generated method stub
					return null;
				}

}
