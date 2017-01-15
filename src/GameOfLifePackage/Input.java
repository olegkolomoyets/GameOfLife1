package GameOfLifePackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Input implements GameInput {

    private final int size = 10;

    @Override
    public boolean[][] getInitialState() throws IOException {
        // Заполнение живых клеточек
        final boolean[][] booleanField = new boolean[size][size];
        final Scanner sc = new Scanner(new File("E:/InitialState.txt"));
        while (sc.hasNext()) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    String a = sc.next();
                    if (a.equals(".")) booleanField[i][j] = false;
                    if (a.equals("X")) booleanField[i][j] = true;
                }
            }
        }
        return booleanField;
    }
}

