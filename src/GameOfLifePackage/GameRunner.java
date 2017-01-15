package GameOfLifePackage;

import java.io.IOException;

class GameRunner {

    private final GameInput input;
    private final GameOutput output;

    protected GameRunner(final GameInput input, GameOutput output) {
        this.input = input;
        this.output = output;
    }


    protected void run() throws IOException {

        Field field = new Field(input.getInitialState());

        for (int n = 0; n < 10; n++) {
            output.render(field);
            field.nextState();
        }
    }
}
