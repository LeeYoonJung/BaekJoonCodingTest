package step.loopFor;

import java.util.Scanner;

/**
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class ASumB7_11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = sc.nextInt();
		
		for ( int i=0; i < caseCnt; i++ ) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(String.format("Case #%d: %d", i+1, a+b));
		}
	}
}
