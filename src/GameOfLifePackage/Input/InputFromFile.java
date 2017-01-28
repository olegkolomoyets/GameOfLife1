package GameOfLifePackage.Input;

import GameOfLifePackage.Input.Validation.SimpleValidator;
import GameOfLifePackage.Input.Validation.ValidRunner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputFromFile implements GameInput {

    @Override
    public boolean[][] getInitialState() throws IOException {

        File file = new File("E:/InitialState10.txt");
        new ValidRunner(new SimpleValidator()).run(file);

        //определение размера поля (учитывая, что оно квадратное)
        final int size = SizeDetermination.SizeDetermine(file);

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


