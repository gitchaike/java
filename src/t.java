import java.util.Queue;
import java.util.Stack;

/**
 * @author 柴渴
 * @date
 */
public class t {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
        ch[0]='s';
    }

    public static void main(String[] args) {
        t t = new t();
        t.change(t.str, t.ch);
        System.out.println(t.str + "and");
        System.out.println(t.ch);
    }
}
