package Study.Study1;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            sum += input.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
