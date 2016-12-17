package GameOfLifePackage;

class GameRunner {

    private final GameInput input;
    private final GameOutput output;

    protected GameRunner(final GameInput input, Out output) {
        this.input = input;
        this.output = output;
    }


    protected void run() {

        Field field = new Field(input.getInitialState());

        for (int n = 0; n < 100; n++) {
            output.render(field);
            field.nextState();
        }
    }
}
