package Training.Pack1;

public class MemberService {
    boolean login(String a, String b){
        if(a.equals("hong")&&b.equals("12345"))
            return true;
        else
            return false;
    }
    void logout(String a){
        System.out.println("로그아웃 되었습니다");
    }
}
