package step.loopFor;

import java.util.Scanner;

public class ASumB5_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = 0;
		caseCnt = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for ( int i = 0; i < caseCnt; i++ ) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(a + b);
		}
	}
}
