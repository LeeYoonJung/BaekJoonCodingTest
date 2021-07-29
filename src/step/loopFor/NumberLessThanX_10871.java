package step.loopFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * @author imj10
 *
 */
public class NumberLessThanX_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, n, a = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		for (int i = 0; i < n; i++ ) {
			a = sc.nextInt();
			
			if ( a < x )  {
				list.add(a);
			}
		}
		
		for ( Integer onelist : list ) {
			System.out.print(onelist + " ");
		}
	}
}
