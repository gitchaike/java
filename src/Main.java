import java.util.Scanner;

/**
 * @author 柴渴
 * @date 2021/11/6
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入房间数量");
        int roomNum = scanner.nextInt();
        int[][] rooms = new int[roomNum][];
        for (int i = 0; i < roomNum; i++) {
            System.out.println("输入" + roomNum + "号房间里的钥匙数量");
            int keyNum = scanner.nextInt();
            rooms[i] = new int[keyNum];
            for (int j = 0; j < keyNum; j++) {
                System.out.println("输入" + roomNum + "号房间里的钥匙");
                int key = scanner.nextInt();
                rooms[i][j] = key;
            }
        }
        int[] res = new int[roomNum];
        res[0] = 1;
        for (int i = 0; i < rooms.length; i++) {
            if (res[i] == 1) {
                for (int j = 0; j < rooms[i].length; j++) {
                    res[rooms[i][j]] = 1;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
