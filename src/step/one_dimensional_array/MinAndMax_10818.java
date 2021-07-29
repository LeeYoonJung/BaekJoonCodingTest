package step.one_dimensional_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class MinAndMax_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int min, max = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		n = sc.nextInt();
		
		for ( int i=0; i < n; i++ ) {
			int a = sc.nextInt();
			
			list.add(a);
		}

		min = list.get(0);
		max = list.get(0);
		
		for ( Integer onelist : list ) {
			if ( onelist < min ) {
				min = onelist;
			}
			if ( onelist > max) {
				max = onelist;
			}
		}
		
		System.out.println(min + " " + max);
	}
}
