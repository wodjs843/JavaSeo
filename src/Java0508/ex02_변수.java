/*
Date :
Autor :
Desctiption :
version :
*/
package Java0508;

public class ex02_���� {

	public static void main(String[] args) {
		
		// ���� : ���α׷� ���࿡ �ʿ��� �����͸� �����ϱ�
		// ���� �޸� ������ �Ҵ��ϰ�, �̸��� �ο��� �� 
	
		// var num = 0;
		// [���� Ÿ��] [���� ��] = [���� ��]
	
		int age =35;
		
		int age1; // ���� ����
		
		age1 = 35; // ���� �ʱ�ȭ
		
		// 1byte = 8bit 
		// 1byte = -2^7 ~ (2^7)-1
		// int : -2,147,483,648 ~ 2,147,483,647
		// long : �ſ� ũ��
		//8byte = 64bit
		
		// ���� Ÿ��		1byte		2byte		4byte		8byte	
		
		// 1. ������ : 	byte					int			iong
		// 2. �Ǽ��� :	byte					float		bouble
		// 3. ������ :	
		// 4. ���� :
		
		byte bnum1 = -128;
		byte bnum2 = 127;
		
		// byte�� �ּ� -128 ~ 127�����̱� ������ -128 �Ʒ� ���� 127 ���� ���� ����� �� ����
		
		//int bnum3 = -129;
		//int bnum4 = 128;
		
		//
		//short sNum1 = -32768;
		//short sNum2 =  32767;
		//short sNum3 = -32769;
		//short sNum4 =  32768;
		
		int iNum1 = -2147483648;
		int iNum2 = 2147483647;
		
		//���� ������ L�� ������ ����� ���� �ʴ´�
		
		long iNum3 = -1322147400083648L;
		long iNum4 =  2123100047483648L;
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	
		float pi1 =  3.14f;
		double pi2 = 3.14;
		
		System.out.println(pi1);
		System.out.println(pi2);
		
		// long�� L �߰�
		// float�� f �߰�
	}
	
}
