import java.util.HashMap;
import java.util.Map;

/**
 * @author 柴渴
 * @date 2021/10/29
 */
public class Mm {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("user", new User());
        map.put("arr", new int[]{1, 2, 3});
        map.put("flag", true);
        map.put("str", "LongShine");
        map.put("year", 1996);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

    }

    static class User {
        final String name = "Mark";
        final int age = 20;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
