package GameOfLifePackage.Run;

import GameOfLifePackage.General.Field;
import GameOfLifePackage.Input.GameInput;
import GameOfLifePackage.Output.GameOutput;

import java.io.IOException;

public class GameRunner {

    private final GameInput input;
    private final GameOutput output;

    public GameRunner(final GameInput input, GameOutput output) {
        this.input = input;
        this.output = output;
    }


    public void run() throws IOException {

        Field field = new Field(input.getInitialState());

        for (int n = 0; n < 10; n++) {
            output.render(field);
            field.nextState();
        }
    }
}
