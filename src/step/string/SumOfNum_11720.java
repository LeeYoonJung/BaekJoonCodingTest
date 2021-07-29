package step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
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
