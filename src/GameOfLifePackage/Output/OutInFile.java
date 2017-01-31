package GameOfLifePackage.Output;

import GameOfLifePackage.General.Field;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OutInFile implements GameOutput {

    @Override
    public void render(Field field) throws IOException {

        final File newFile = new File("E:/Out.txt");
        try (final Writer writer = new FileWriter(newFile, true)) {
            int size = field.getSize();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    writer.write(field.getState(i, j) ? "X " : ". ");
                }
                writer.write('\n');
            }
            writer.write('\n');
        } catch (IOException e) {
            throw new IOException("Something wrong with file!");
        }
    }
}
