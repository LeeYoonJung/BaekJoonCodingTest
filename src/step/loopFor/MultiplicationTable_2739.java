package step.loopFor;

import java.util.Scanner;

/**
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 * @author imj10
 *
 */
public class MultiplicationTable_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i=1; i<10; i++) {
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
