import java.util.Scanner;

public class Play {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        Ship ships = new Ship(x);
    }
}
