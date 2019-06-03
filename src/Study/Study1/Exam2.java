package Study.Study1;

public class Exam2 {
    public static void main(String[] args) {
        int sum = 0, num, i;
        for (i = 1; ; i++) {
            num = (i % 2 == 0) ? i * -1 : i;
            sum += num;
            if (sum >= 100)
                break;
        }
        System.out.println(i);
    }
}
