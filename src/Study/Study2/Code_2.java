package Study.Study2;

import java.util.Scanner;

public class Code_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String value[] = num.split(" ");
        int array[] = new int[2];
        for (int i = 0; i < value.length; i++) {
            StringBuffer sb = new StringBuffer(value[i]);
            array[i] = Integer.valueOf(sb.reverse().toString());
        }
        System.out.println(Math.max(array[0], array[1]));
    }
}
