/*
 	Date : 2020.05.12
  	Author : SEO
  	Description :  반복문for(loopFor)
  	version : 1.0                
  
  
 */



	package java0512;

		public class ex08_loopFor {
			
			public static void main(String[] args) {
				// 안녕하세요 10번 출력
				
				System.out.println("안녕하세요");
				// 안녕하세요 출력
				
				// 반복문 for
				/*
				  	for(초기화 식; 조건식; 증감식){
				  		반복할 수행문
				  		
				  	}
				 */
				
				int i;
				// i를 변수선언
				for(i=1; i<=10; i++) {
					
					
					System.out.println(i +"안녕하세요");
					// 변수 선언을 한 i에 안녕하세요 를 더해서 출력
					
				}
				//	i= i(10번) + 1
				System.out.println("반복문 이후 i값 :" + i);
				// 반복문 이후 i값인 1부터 10까지의 총합을 출력한다
				
			int sum = 0;
			// sum을 0으로 변수 선언
			for (i = 1; i<=10; i++) {
				
					sum += i;   // sum = sum + i;
					System.out.print("i :" + i +"\t=>>");
					//선언한 변수에 반복문을 더해 출력
					System.out.println("\tsum" + sum);
					// 출력문을 들여쓰기를 한다
			}
			
				System.out.println("1부터 10까지 합은 "+ sum);
				//1부터 10까지의 합을 출력
				
			
				
			int num = 0;
			
			for (i = 2; i <= 20 ; i++) {
					num += i;  // num = num + i;
					System.out.print("i :" + i + "\t =>>");
					System.out.println("\tnum "+num);
					
				
			}
			System.out.print("2부터 20까지의 합은" + num);
			System.out.println("\tnum" +  num);
			
			
			}
			
		
			
			
			
			
			
				
				
			
}
