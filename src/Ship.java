import java.util.Scanner;

public class Ship {

    private int[] ships = new int[4];

    public Ship(int size) {
        int num = 1;

        for (int i = 0; i < 4; i++){
            Scanner console = new Scanner(System.in);
            int x = console.nextInt();
            System.out.println("Создание ship " + num + " из 4, кол-во ячеек: ");
            ships[i] = size;
            num++;
        }
    }
}
