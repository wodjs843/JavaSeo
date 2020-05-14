/*
  	Date : 2020.05.13
  	Author : SEO
  	Description :  whlieDice
  	version : 1.0                
  
  
  
 */



	package java0513;

		public class ex09_whlieDice {
			
			public	static void main(String[]agrs) {
				
				
				boolean run = true;
				//run을 참으로 선언
				
				while(run) {
				//와일 (반복조건) 선언	
					int dice = (int)(Math.random()*6)+1;
					System.out.println("주사위값은"+ dice);
					// 인트 함수로 주사위 선언. 주사위는 랜덤으로 6개까지 설정
					if (dice == 5) {
					// 만약 주사위가 5가 나오면	
						run = false;
						// 참이었던 반복조건이 거짓으로  전환되어 출력하게하라
						System.out.println();
						
						
					} 
				}
				
				
			}

}
