package step.if_statement;

import java.util.Scanner;

/**
 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class TestScores_9498 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        
        if(A>=90) {
            System.out.println("A");
        } else if(A>=80) {
            System.out.println("B");
        } else if(A>=70){
            System.out.println("C");
        } else if(A>=60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
    }
}
