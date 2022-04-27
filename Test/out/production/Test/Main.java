import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows for matrix");
        int rows = sc.nextInt();
        System.out.println("Enter columns for matrix");
        int columns = sc.nextInt();
        System.out.println("Enter x axis for player");
        int x = sc.nextInt();
        System.out.println("Enter y axis for player");
        int y = sc.nextInt();

        Location location = new Location(rows, columns, x, y);
        location.setRow(rows);
        location.setColumns(columns);
        location.setX(x);
        location.setY(y);

        Player player = new Player();
        Random streamInt = new Random();
        IntStream randomInt = streamInt.ints(50, 0, 5);
        int[] no = randomInt.toArray();
        System.out.println(Arrays.toString(no));
        for (int commandsHandler : no) {
            if (commandsHandler == 1 || commandsHandler == 2) {
                player.movingPlayer(commandsHandler, location);
                if (player.getOverBoard() == -1) {
                    break;
                }
            } else if (commandsHandler == 3 || commandsHandler == 4) {
                player.rotate(commandsHandler);
            } else {
                player.quit(location);
                break;
            }
        }
    }
}

