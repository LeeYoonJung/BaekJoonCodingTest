package step.if_statement;

import java.util.Scanner;

/**
 * �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * @author imj10
 *
 */
public class Comparison_1330 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        if(A>B) {
            System.out.println(">");
        } else if(A<B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}