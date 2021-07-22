package step.io_arithmetics;

import java.util.Scanner;

/**
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 * @author imj10
 *
 */
public class RulesOfArithmetics_10869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println((double)a/b);
    }
}
