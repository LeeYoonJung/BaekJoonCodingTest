package step.loopWhile;

import java.util.Scanner;

/**
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class ASumB5_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = 0;
			int b = 0;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			if ( a == 0 && b == 0 ) {
				break;
			}
			
			System.out.println(a + b);
		}
	}
}
