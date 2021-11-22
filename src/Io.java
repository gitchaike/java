import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 柴渴
 * @date 2021/10/28
 */
public class Io {
    public static void main(String[] args) {
        String filePath= "d:\\a.txt";
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("hello1");
            bufferedWriter.newLine();
            bufferedWriter.write("hello2");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
