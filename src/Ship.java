public class Ship {

    private int[] ships = new int[4];

    public Ship(int size) {
        int num = 1;

        for (int i = 0; i < 4; i++){
            System.out.println("Создание ship " + num + " из 4, кол-во ячеек: ");
            ships[i] = size;
            num++;
        }
    }
}
