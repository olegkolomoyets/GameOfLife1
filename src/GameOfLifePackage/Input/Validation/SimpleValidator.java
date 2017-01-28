package GameOfLifePackage.Input.Validation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleValidator implements Validator {

    public void formValidation(File file) throws IOException {

        //Валидация по размеру (квадрат):

        // по ширине
        final Scanner scForFormValid = new Scanner(file);
        String firstLine = scForFormValid.nextLine();
        int firstLineLength = firstLine.length();
        int counter = 1;

        while (scForFormValid.hasNext()) {
            String otherLine = scForFormValid.nextLine();
            int otherLineLength = otherLine.length();
            if (otherLineLength != firstLineLength) {
                throw new IOException("Incorrect text format!");
            }
            counter++;
        }
        scForFormValid.close();

        // по высоте
        if (counter != ((firstLineLength / 2) + 1)) {
            throw new IOException("Incorrect text format!");
        }
    }

    // Валидация по знакам:

    public void signValidation(File file) throws IOException {
        final Scanner scForSignValid = new Scanner(file);
        while (scForSignValid.hasNext()) {
            String sign = scForSignValid.next();
            if (!sign.equals(".") & !sign.equals("X")) {
                throw new IOException("Incorrect text format!");
            }
        }
        scForSignValid.close();
    }
}

