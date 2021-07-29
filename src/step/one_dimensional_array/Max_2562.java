package step.one_dimensional_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 * 예를 들어, 서로 다른 9개의 자연수
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 * @author imj10
 *
 */
public class Max_2562 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		int max = 0;
		int seq = 0;
		
		for ( int i=1; i <= 9; i ++ ) {
			int a = sc.nextInt();
			list.add(a);
			
			if ( max < a ) {
				max = a;
				seq = i;
			}
		}
		
		System.out.println(max + "\n" + seq);
	}
}
