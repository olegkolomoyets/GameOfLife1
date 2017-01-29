package GameOfLifePackage.Input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputFromFile implements GameInput {

    @Override
    public boolean[][] getInitialState() throws IOException {

        File file = new File("E:/InitialState11.txt");
        final Scanner scForFile = new Scanner(file);
        if (!scForFile.hasNext()) throw new IOException("Incorrect text format!");
        String line = scForFile.nextLine();
        int firstLineLength = line.length();
        int size = (firstLineLength / 2) + 1;
        int counter = 0;
        int i = 0;
        int j = 0;

        final boolean[][] booleanField = new boolean[size][size];

        while (line != null) {
            Scanner scForLine = new Scanner(line);
            while (scForLine.hasNext()) {
                String sign = scForLine.next();
                if (!sign.equals(".") & !sign.equals("X")) {
                    throw new IOException("Incorrect text format!");
                }
                booleanField[i][j] = sign.equals("X");
                j++;
            }
            scForLine.close();

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
            line = scForFile.hasNextLine() ? scForFile.nextLine() : null;
        }

        scForFile.close();

        // проверка по высоте
        if (counter != ((firstLineLength / 2) + 1)) {
            throw new IOException("Incorrect text format!");
        }

        return booleanField;
    }
}


