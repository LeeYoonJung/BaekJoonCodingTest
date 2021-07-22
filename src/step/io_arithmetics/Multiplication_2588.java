package step.io_arithmetics;

import java.util.Scanner;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * @author imj10
 *
 */
public class Multiplication_2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        
        System.out.println(A*(B%10));
        System.out.println(A*(B%100-B%10)/10);
        System.out.println(A*(B/100));
        System.out.println(A*B);
        
    }
}
