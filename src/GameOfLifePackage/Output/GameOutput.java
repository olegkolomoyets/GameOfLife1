package GameOfLifePackage.Output;

import GameOfLifePackage.General.Field;

import java.io.IOException;

public interface GameOutput {

    void render(Field field) throws IOException;

}
