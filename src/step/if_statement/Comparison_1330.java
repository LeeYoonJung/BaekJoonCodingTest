package step.if_statement;

import java.util.Scanner;

/**
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
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
