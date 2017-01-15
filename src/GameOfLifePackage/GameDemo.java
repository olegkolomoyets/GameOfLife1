package GameOfLifePackage;

import java.io.IOException;

public class GameDemo {
    public static void main(String[] args) throws IOException {
        new GameRunner(new InputFromFile(), new Out()).run();
    }
}
