package step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * @author imj10
 *
 */
public class AsciiCode_11654 {
	public static void main(String[] args) throws IOException {

		// 1. 문자를 ASCII 값으로 변환하기 위해서는 char를 int 캐스트 하면 된다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.");
		char inputText = br.readLine().charAt(0);
		
		System.out.println((int)inputText);
		
		// 2. getBytes(StandardCharsets.US_ASCII)
		String asciiValue = "ABCD";
		byte[] values = asciiValue.getBytes(StandardCharsets.US_ASCII);
		System.out.println(values[0]);
		for ( byte one : values ) {
			System.out.println(one);
		}
		
		// 3. String.chars()
        List<Integer> listOfIntegers = asciiValue.chars()                      
                .boxed()                      
                .collect(Collectors.toList());  

        for(int i:listOfIntegers) {
                System.out.println("ASCII value "+ i);
        }
	}
}