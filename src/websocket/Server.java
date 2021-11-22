package websocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 柴渴
 * @date 2021/10/29
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLine = 0;
        while ((readLine = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLine));
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
