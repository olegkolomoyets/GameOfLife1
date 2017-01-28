package GameOfLifePackage.Input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SizeDetermination {
    static int SizeDetermine(File file) throws IOException {
        final Scanner scForLength = new Scanner(file);
        int lineLength = scForLength.nextLine().length();
        int size = (lineLength / 2) + 1;
        scForLength.close();
        return size;
    }
}
