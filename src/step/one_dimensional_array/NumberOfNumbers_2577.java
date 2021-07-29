package step.one_dimensional_array;

import java.util.Scanner;

/**
 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶�� 
 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 * 
 * @author imj10
 *
 */
public class NumberOfNumbers_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a * b * c;
		int[] list = new int[10];
		
		while ( sum > 0 ) {
			list[sum % 10]++;
			sum /= 10;
		}
		
		for (int i=0; i <list.length; i++ ) {
			System.out.println(list[i]);
		}
	}
}
