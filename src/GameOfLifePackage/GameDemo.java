package GameOfLifePackage;

import GameOfLifePackage.Input.InputFromFile;
import GameOfLifePackage.Output.OutInFile;
import GameOfLifePackage.Run.GameRunner;

import java.io.IOException;

public class GameDemo {
    public static void main(String[] args) throws IOException {
        new GameRunner(new InputFromFile(), new OutInFile()).run();
    }
}
