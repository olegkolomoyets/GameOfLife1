package GameOfLifePackage.Input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputFromFile implements GameInput {

    @Override
    public boolean[][] getInitialState() throws IOException {
        File file = new File("E:/InitialStateBad.txt");

        //валидация формата файла
        final Scanner scForValidating = new Scanner(file);
        String firstSign = scForValidating.next();
        scForValidating.close();
        if (!firstSign.equals(".") & !firstSign.equals("X")) {
            throw new IOException("Incorrect text format!");
        }
        else {

            //определение размера поля (учитывая, что оно квадратное)
            final Scanner scForLength = new Scanner(file);
            int lineLength = scForLength.nextLine().length();
            int size = (lineLength / 2) + 1;
            scForLength.close();

            //обработка поля
            final boolean[][] booleanField = new boolean[size][size];
            final Scanner scForReading = new Scanner(file);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    String a = scForReading.next();
                    booleanField[i][j] = a.equals("X");
                }
            }
            scForReading.close();
            return booleanField;
        }
    }
}

