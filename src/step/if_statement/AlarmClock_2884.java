package step.if_statement;

import java.util.Scanner;

/**
 * ����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
 * ����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
 * �̷� ����̸� �ҽ��ϰ� ����, â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
 * �ٷ� "45�� ���� �˶� �����ϱ�"�̴�.
 * �� ����� �ܼ��ϴ�. ���� �����Ǿ� �ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. �� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
 * ���� ����̰� ������ �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class AlarmClock_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int H = scan.nextInt();
        int M = scan.nextInt();
        
        
        if(M<45) {
            if(H == 0) {
                H = 23;
            } else {
                H--;
            }
            M = M-45+60;
        } else {
            M -= 45;
        }
        
        System.out.println(H + " " + M);
    }
}