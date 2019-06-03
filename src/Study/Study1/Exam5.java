package Study.Study1;

public class Exam5 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Quiz5 3120");
            System.exit(0);
        }
        int money = Integer.valueOf(args[0]);
        System.out.println("money = " + money + "원");
        int[] coin = {500, 100, 50, 10};
        int[] numOfCoin = {5, 5, 5, 5};
        boolean needMoreCoin = false;
        for (int i = 0; i < coin.length; i++) {
            int num;
            num = money / coin[i];
            System.out.print(coin[i] + "원 : ");
            System.out.println(num + "개");
            if (numOfCoin[i] < num) {
                needMoreCoin = true;
            }
            numOfCoin[i] -= num;
            money %= coin[i];

        }
        if (needMoreCoin) {
            System.out.println("거스름돈이 부족합니다.");
        } else {
            System.out.println("===== 남은 동전 갯수 =====");
            for (int i = 0; i < coin.length; i++) {
                System.out.print(coin[i] + "원 : ");
                System.out.println(numOfCoin[i] + "개");
            }
        }
        System.out.println("끝");
    }
}


