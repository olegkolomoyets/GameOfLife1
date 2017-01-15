package GameOfLifePackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class OutInFile implements GameOutput {

    @Override
    public void render(Field field) {

        final File newFile = new File("E:/Out2.txt");
        try (final Writer writer = new FileWriter(newFile, true)) {
            int size = field.getSize();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (!field.getState(i, j)) writer.write(". ");
                    if (field.getState(i,j)) writer.write("X ");
                }
                writer.write('\n');
            }
            writer.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
