package step.function;

import java.util.Scanner;

/**
 * ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�. �ۼ��ؾ� �ϴ� �Լ��� ������ ����.
 * Java: long sum(int[] a); (Ŭ���� �̸�: Test)
 * a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
 * ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
 * @author imj10
 *
 */
public class SumMain_15596 {
	public static void main(String[] args) {
		
		Test test = new Test();
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		n = sc.nextInt();
		
		int[] a = new int[n];
		
		for ( int i = 0; i < n; i++ ) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(test.sum(a));
	}
}

