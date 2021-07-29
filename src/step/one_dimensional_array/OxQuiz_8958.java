package step.one_dimensional_array;

import java.util.Scanner;

/**
 	"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 	������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
	"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
	OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class OxQuiz_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = 0;
		test = sc.nextInt();
		
		for ( int i=0; i < test; i++ ) {
			String oxStr = "";
			oxStr = sc.next();
			
			int cnt = 0;
			int result = 0;
			
			for ( int j = 0; j < oxStr.length() ; j ++ ) {
				char o = 'O';
				char x = 'X';
				
				char oneStr = oxStr.charAt(j);
				
				if ( o == oneStr ) {
					cnt ++;
					result += cnt;
				}
				else if ( x == oneStr ) {
					cnt = 0;
				}
			}
			System.out.println(result);
		
		}
	}
}
