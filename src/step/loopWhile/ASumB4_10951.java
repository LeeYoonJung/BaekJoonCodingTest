package step.loopWhile;

import java.util.Scanner;

/**
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class ASumB4_10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = 0;
			int b = 0;
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a + b);
		}
	}
}