package Study.Study1;

public class Exam1 {
    public static void main(String[] args) {
        int sum, result = 0;
        for (int a = 1; a <= 10; a++) {
            sum = 0;
            for (int b = 1; b <= a; b++) {
                sum += b;
            }
            result += sum;
        }
        System.out.println(result);
    }
}
