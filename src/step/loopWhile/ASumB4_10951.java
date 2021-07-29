package step.loopWhile;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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