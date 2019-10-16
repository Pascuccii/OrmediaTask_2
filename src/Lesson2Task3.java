import java.util.Random;
import java.util.Scanner;

public class Lesson2Task3 {

    private int[][] field = new int[5][5];

    public Lesson2Task3() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                field[i][j] = 0;
    }

    public static int randomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        Lesson2Task3 les = new Lesson2Task3();
        for (int i = 0; i < 30; i++) {
            les.place(1);
            les.place(2);
            les.print();
            les.reset();
            System.out.println();
        }
    }

    public void reset() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                field[i][j] = 0;
    }

    public void print() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(field[i][j] + " ");
            System.out.println();
        }
    }

    public void place(int n) {
        int x = randomInt(0, 3);
        int y = randomInt(0, 3);
        if (field[x][y] == 0 && field[x + 1][y] == 0 && field[x][y + 1] == 0 && field[x + 1][y + 1] == 0)
            field[x][y] = field[x + 1][y] = field[x][y + 1] = field[x + 1][y + 1] = n;
        else
            place(n);
    }
}
