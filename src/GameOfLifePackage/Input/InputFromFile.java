package GameOfLifePackage.Input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputFromFile implements GameInput {

    @Override
    public boolean[][] getInitialState() throws IOException {

        File file = new File("E:/InitialState10.txt");
        final Scanner scForFile = new Scanner(file);
        String line = scForFile.nextLine();
        int firstLineLength = line.length();
        int counter = 1;

        //определение размера поля
        int size = (firstLineLength / 2) + 1;

        //создание массива
        final boolean[][] booleanField = new boolean[size][size];
        int i = 0;
        int j = 0;
        Scanner scForLine = new Scanner(line);
        while (scForLine.hasNext()) {
            String sign = scForLine.next();
            if (!sign.equals(".") & !sign.equals("X")) {
                throw new IOException("Incorrect text format!");
            }
            booleanField[i][j] = sign.equals("X");
            j++;
        }

        while (scForFile.hasNext()) {

            line = scForFile.nextLine();
            int otherLineLength = line.length();
            if (otherLineLength != firstLineLength) {
                throw new IOException("Incorrect text format!");
            }
            counter++;
            if (counter > ((firstLineLength / 2) + 1)) {
                throw new IOException("Incorrect text format!");
            }
            i++;
            j = 0;
            scForLine = new Scanner(line);
            while (scForLine.hasNext()) {
                String sign = scForLine.next();
                if (!sign.equals(".") & !sign.equals("X")) {
                    throw new IOException("Incorrect text format!");
                }
                booleanField[i][j] = sign.equals("X");
                j++;
            }
        }
        scForFile.close();
        scForLine.close();

        // проверка по высоте
        if (counter != ((firstLineLength / 2) + 1)) {
            throw new IOException("Incorrect text format!");
        }
        return booleanField;
    }
}


