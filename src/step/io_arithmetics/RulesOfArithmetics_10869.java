package step.io_arithmetics;

import java.util.Scanner;

/**
 * �� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
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
