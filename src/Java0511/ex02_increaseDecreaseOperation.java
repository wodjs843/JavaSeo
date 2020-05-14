/*
 	Date : 2020.05.11
  	Author : SEO
  	Description : 증감 연산자(increaseDecreaseOperation)
  	version : 1.0        
  
  
 */



		package Java0511;

			public class ex02_increaseDecreaseOperation {
				public static void main(String[] args) {
					// 단항 연산자
					// 증가 감소 연산자 (++,--)
					
					// ++num : num이 가지고 있는 값에
					// 1을 증가한 뒤에 연산에 적용
					// num++ : num이 가지고 있는 값을
					// 연산에 적용한 뒤 1을 증가
					
					int num = 5;
					System.out.println("num 값: " + num);
					
					++num;
					System.out.println("++num 값: " + num);
					
					num++;
					System.out.println("num++ 값: " + num);
					
					int num1 = 5;
					int result1; 
					
					result1 = ++num1;
					System.out.println("++num1 result1  :"  + result1);
					// result1 = ++num1;
					// num1 = num1 + 1;
					// result1 = num1;
					
					result1 = num1++;
					System.out.println("num1++ result1 :" + result1);
					// result1+1 = num1++;
					// result1+1 = num1;
					// num1 = num1 + 1;
					
					// 예시
					int num2 = 10;
					--num2;
					System.out.println(num2); // 
					// num2 = num2 - 1;
					// num2 = 10 - 1;
					// num2 = 9;
					
					int result2;
					result2 = --num2;
					System.out.println(result2);
					//result2 = --num2;
					// num2 = num2 - 11;
					// num2 = 9 - 1;
					// resilt2 = num2;
					// result2 = 8;
					
					result2 = num2--;
					System.out.println(result2);
					// result2 = num2--;
					// result2 = num2;
					// reuslt2 = 8;
					// num2 = num2 - 1;
					// num2 = 8 - 1;
					// num2 = 7;
					
					// 예시
					int result3;
					System.out.println("num1: " + num1 + "num2:" + num2);
					result3 = ++num1 + ++num2;
					System.out.println("num1"); // 
					System.out.println("num2 : " + num2); // 
					System.out.println(result3); // 
					
					result3 = num1++ + num2++;
					System.out.println("num1");//8
					System.out.println("num2");//8
					System.out.println("result3 : " + result3);//16
					
					
					result3 = num1++ + ++num2;
					System.out.println("num1");//9
					System.out.println("num2");//10
					System.out.println("result3 :" + result3);//19
					
					result3 = ++num1 +  num2++;
					System.out.println("num1");//11
					System.out.println("num2");//10
					System.out.println("result3:" + result3);//21
					
					int num3 = 5;
					int num4 = 11;
					int result4;
					
					result4 = ++num3 + --num4;//
					System.out.println("num3"); //6
					System.out.println("num4"); //10
					System.out.println("result4 :" + result4);//16
					
					result4 = num4++ - num3--;
					System.out.println("num3"); // 10
					System.out.println("num4"); // 4
					System.out.println("result4 :" + result4);//6
					
					result4 = num3++ - ++num4;
					System.out.println("num3"); // 5
					System.out.println("num4"); // 12
					System.out.println("result4 :" + result4); //-7
					
					
					
				
					
					
					
					
					
					
					
					
					
					
					
				}

}
