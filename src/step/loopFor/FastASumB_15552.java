package step.loopFor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 * @author imj10
 *
 */
public class FastASumB_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseCnt = Integer.parseInt(br.readLine()); 
		
		StringTokenizer st;
		
		for ( int i = 0; i < caseCnt; i++ ) {
			st = new StringTokenizer(br.readLine(), " ");
			
			bw.write(((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n"));
		}
		br.close();
		
		bw.flush();
		bw.close();
	}
}
