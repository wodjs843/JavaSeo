/*
 Date : 2020.05.13
  	Author : SEO
  	Description :  whileExample
  	version : 1.0                
  
  
  
 */



	package java0513;

		public class ex11_whlieEx {
			
			public	static void main(String[]agrs) {
				// while 문을 이용해서
				// 주사위를 던졌을때
				// 5가 나오면 종료하는 프로그램을 만드시오
				
		
				
				boolean run = true;
				int cnt = 0;
				
				
				while (run) {
					
					
					
					int dice =(int)(Math.random()*6) +1;
					cnt++;
					System.out.println("주사위값이" + dice + "나왔습니다.");
					
					// 만약 주사위 값이 5라면
					// 종료하겠다 =>> run = false;
					if(dice == 5) {
						run = false;
						System.out.println();
					}
						System.out.println("\n던진 횟수:" + cnt);
						System.out.println("프로그램을 종료합니다");
				}
				
				
			}

}
