/*
 	Date : 2020.05.13
  	Author : SEO
  	Description :  forProject
  	version : 1.1           
  
  
  
 */

package java0513;

public class ex08_forProject {

	public static void main(String[] agrs) {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");

			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");

			}
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");

			}
			System.out.println();

		}

	}
}
