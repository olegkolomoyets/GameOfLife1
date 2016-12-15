package GameOfLifePackage;

class Input implements GameInput {

    private final int size = 10;

    @Override
    public boolean[][] getInitialState() {
        // Заполнение живых клеточек
        boolean[][] field = new boolean[size][size];

        field[1][2] = true;
        field[2][3] = true;
        field[3][3] = true;
        field[3][2] = true;
        field[3][1] = true;

        return field;
        }

}