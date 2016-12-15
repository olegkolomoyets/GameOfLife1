package GameOfLifePackage;

class GameRunner {

    private final GameInput input;

    protected GameRunner(final GameInput input, Out out) {
        this.input = input;
    }


    protected void run() {

        Field field = new Field(input.getInitialState());

        for (int n = 0; n < 100; n++) {
            Out out = new Out();
            out.render(field);
            field.nextState();
        }
    }


}
