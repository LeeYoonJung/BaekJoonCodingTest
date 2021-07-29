package step.loopFor;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * @author imj10
 *
 */
public class ASumB3_10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A+B);
		}
	}
}
