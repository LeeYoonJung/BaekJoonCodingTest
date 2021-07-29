package step.function;

import java.util.Scanner;

/**
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 *  N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
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
