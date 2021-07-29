package step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
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
