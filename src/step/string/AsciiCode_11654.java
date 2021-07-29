package step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class AsciiCode_11654 {
	public static void main(String[] args) throws IOException {

		// 1. ���ڸ� ASCII ������ ��ȯ�ϱ� ���ؼ��� char�� int ĳ��Ʈ �ϸ� �ȴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.");
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