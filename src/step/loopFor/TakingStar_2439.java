package step.loopFor;

import java.util.Scanner;

/**
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
 * @author imj10
 *
 */
public class TakingStar_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i=1; i<=N; i++) {
            for(int k=N-i; k>0; k--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
