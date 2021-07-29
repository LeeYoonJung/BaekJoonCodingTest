package step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class SumOfNum_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String value1 = br.readLine();
		String value2 = br.readLine();
		
		int result = 0;
		
		for ( int i=0; i< Integer.parseInt(value1); i++ ) {
			result += Integer.parseInt(value2.substring(i, i+1));
		}
		
		System.out.println(result);
	}
}
