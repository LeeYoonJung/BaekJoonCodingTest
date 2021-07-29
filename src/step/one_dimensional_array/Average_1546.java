package step.one_dimensional_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class Average_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int m = 0;
		
		for ( int i = 0; i < n; i++ ) {
			int input = sc.nextInt();
			list.add(input);
			
			if ( m < input ) {
				m = input;
			}
		}
		
		double sum = 0;
		for ( Integer one : list ) {
			sum += (double) one / m * 100;
		}
		System.out.println(String.format("%.6f", sum/n));
	}
}
