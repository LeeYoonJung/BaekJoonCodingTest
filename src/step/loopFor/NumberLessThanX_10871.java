package step.loopFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
