package step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class Alphabet_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int[] result = new int[26];
		for ( int i = 0; i <result.length; i++ ) {
			result[i] = -1;
		}
		
		for ( int i = 0; i <s.length(); i++ ) {
			int index = s.charAt(i) - 'a';
			
			if ( result[index] == -1 ) {
				result[index] = i;
			}
		}
		
		for ( int one : result ) {
			System.out.print(one + " ");
		}
	}
}
