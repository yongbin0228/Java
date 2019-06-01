package Study;
import java.util.Calendar;
public class Code1 {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지의 숫자를 리턴

        switch (week){
            case 1:
                today = Week.SUN; break;
            case 2:
                today = Week.MON; break;
            case 3:
                today = Week.TUE; break;
            case 4:
                today = Week.WED; break;
            case 5:
                today = Week.THU; break;
            case 6:
                today = Week.FRI; break;
            case 7:
                today = Week.SAT; break;
        }
        System.out.println("오늘 요일 : "+today);
        if(today==Week.SUN){
            System.out.print("일요일엔 놀아요~");
        }
        else{
            System.out.print("열심히 자바 공부합니다!");
        }
        Week[] days = Week.values();
        for(Week day : days){
            System.out.println(day);
        }

    }
    public enum Week{ //열거상수 Week선언
        MON, TUE, WED, THU, FRI, SAT, SUN
    }
}
