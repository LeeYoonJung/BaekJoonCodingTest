package step.one_dimensional_array;

import java.util.Scanner;

/**
 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 * 
 * @author imj10
 *
 */
public class AboveAverage_4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = 0;
		
		caseCnt = sc.nextInt();
		
		
		for ( int i=0; i < caseCnt; i++ ) {
			
			int studentCnt = 0;
			studentCnt = sc.nextInt();
			
			int totalScore = 0;
			double avg = 0;
			int aboveAvgCnt = 0;

			int [] scoreArray = new int[studentCnt];
			
			for ( int j=0; j < studentCnt; j++ ) {
				scoreArray[j] = sc.nextInt();
				
				totalScore += scoreArray[j];
			}
			
			avg = totalScore/studentCnt;
			
			for ( int j=0; j < studentCnt; j++ ) {
				if ( scoreArray[j] > avg ) {
					aboveAvgCnt ++;
				}
			}
			System.out.println(String.format("%.3f", (double)aboveAvgCnt/studentCnt * 100) + "%");
		}
	}
}

