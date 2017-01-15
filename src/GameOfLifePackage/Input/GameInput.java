package GameOfLifePackage.Input;

import java.io.IOException;

public interface GameInput {

   boolean[][] getInitialState() throws IOException;
}
