package step.if_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
 * QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
 * @author imj10
 *
 */
public class StringRepetition_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for ( int i=0; i < count; i ++ ) {
			
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
			String s = str[1];
			
			
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
