package websocket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author 柴渴
 * @date 2021/10/29
 */
public class Clint {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("哈哈哈".getBytes());
        outputStream.close();
        socket.close();
    }
}
