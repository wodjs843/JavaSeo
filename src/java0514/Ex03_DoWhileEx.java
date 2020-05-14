/*
 	Date : 2020.05.12
  	Author : SEO
  	Description :   DoWhileEx문 예제(Up&Down 게임)
  	version : 1.0              
  
  
 */

	package java0514;
	import java.util.Scanner;
		public class Ex03_DoWhileEx {
			
			public static void main(String[]agrs) {
				//3번안에 맞추면 통과
				// 그 이후에 맞추면 벌칙
				int answer = (int)(Math.random() * 45)+1;
				// 정답은 랜덤으로 1번부터 45번까지의 숫자 
				int input = 0;
				int count = 0;
				System.out.println(answer);
				boolean run = true;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Up&Down Game 시작~");
				//게임 시작을 출력
				do {
					System.out.println("1부터 45까지 숫자를 말하세요");
					// 1부터 45까지의 숫자를 출력
					input = sc.nextInt();
					count++;
				
					if(answer > input) {
						System.out.println("Up! 더 큰수를 말하세요");
						// 더 큰 수가 출력되도록 입력
					}else if (answer < input) {
						System.out.println("Down! 더 작은수를 말하세요");
						// 더 작은수가 출력되도록 입력
					}else {
						System.out.println("정답은 "+ answer+ "입니다");
						// 정답 answer 가 출력되도록 입력
						System.out.println("시도한 횟수는" + count+"번 입니다");
						run = false;
						break;
					}
					
				}while(run);
				if(count > 3) {
					System.out.println("3회 초과로 10분간 대가리박아");
				}else {
					System.out.println("3회 안에 맞췄으니 집에가세요");
				}
				
			}
				
}
