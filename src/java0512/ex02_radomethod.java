/*
  
 	Date : 2020.05.12
  	Author : SEO
  	Description :  랜덤숫자
  	version : 1.0               
   
  
 */



	package java0512;

		public class ex02_radomethod {
			
			public static void main(String[] args) {
				// 랜덤메소드 
				// 특정 범위내에서 숫자 하나를 출력해주는 메소드
				// Math.radom() >> 0 보다 크거나 같고 1보다 작은
				// 숫자를 무작위로 발생
				
				double ranNum = Math.random();
				System.out.println("ranNum :" + ranNum);
				ranNum = Math.random();
				// 1~10사이의 숫자 출력
				
				ranNum = (int)(Math.random() * 10) +1;
				System.out.println("ranNum :" + (int)ranNum);
				
				//(int) (Math.random() * )N + S;
				// S : 시작, N : 끝
				
				// 주사위 예제
				
				int dice = (int)(Math.random() * 6) + 1;
				System.out.println("주사위 값이" + dice + "이(가)나왔습니다.");
				
				int js = (int)(Math.random() * 28) + 1;
				System.out.println("오늘 발표자는" + js + "번입니다.");
				
				//로또 번호
				
				int lotto = (int)(Math.random() * 45) + 1;
				System.out.println("로또 당첨 번호는" + lotto + "입니다.");
				
			}
			

}
