package Study;
import java.awt.*;
public class Code2 {
    public static void main(String[] args) throws InterruptedException {
        Toolkit tk = Toolkit.getDefaultToolkit();
        tk.beep();
        Thread.sleep(1000);
        tk.beep();
        Thread.sleep(3000);
        tk.beep();
    }
}
