package Study.Study1;

public class Exam4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int i) {
        if (i <= 1)
            return i;
        else
            return fibonacci(i - 2) + fibonacci(i - 1);
    }
}

