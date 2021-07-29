package step.loopFor;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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
