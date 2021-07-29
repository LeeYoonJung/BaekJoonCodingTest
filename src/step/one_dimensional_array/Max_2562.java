package step.one_dimensional_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���, ���� �ٸ� 9���� �ڿ���
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 * �� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
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
