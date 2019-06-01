package Training;

//while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고,
//눈의 합이 5가 아니라면 계속 주사위를 돌리고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하여라. 눈의 합이 5가 되는 조합은
//(1, 4), (4, 1), (2, 3), (3, 2)입니다.

public class TR_Code1 {
    public static void main(String[] args) {
        int dice_1, dice_2;
        while (true) {
            dice_1 = (int) (Math.random() * 6) + 1;
            dice_2 = (int) (Math.random() * 6) + 1;
            System.out.println("("+dice_1+", "+dice_2+")");
            if(dice_1+dice_2==5)
                return;
        }
    }
}
