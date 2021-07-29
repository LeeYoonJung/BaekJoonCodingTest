package step.function;

import java.util.Scanner;

/**
 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
 *  N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * @author imj10
 *
 */
public class ArithmeticSequence_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = 99;
		
		if ( n < 100 ) {
			ans = n;
		}
		else {
			for (int i=100; i<=n; i++) {
				int a = i/100;
				int b2 = i%100/10*2;
				int c = i%10;
				
				if ( b2 == a + c ) {
					ans += 1;
				}
			}
		}
		System.out.println(ans);
	}
}
