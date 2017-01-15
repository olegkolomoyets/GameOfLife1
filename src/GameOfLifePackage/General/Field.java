package GameOfLifePackage.General;

public class Field {

    private int size;

    public Field(boolean[][] initialState) {
        this.field = initialState;
        this.size = initialState.length;
        this.indexes = new int[size][size];
    }

    public int getSize() {
        return size;
    }

    // создание поля
    private boolean[][] field = new boolean[size][size];
    private int[][] indexes = new int[size][size];

    // Перерождение клеточек
    public void nextState() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {


                int alive = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int m = j - 1; m <= j + 1; m++) {
                        int kk = k;
                        if (kk < 0) {
                            kk = size - 1;
                        }
                        if (kk > size - 1) {
                            kk = 0;
                        }
                        int mm = m;
                        if (mm < 0) {
                            mm = size - 1;
                        }
                        if (mm > size - 1) {
                            mm = 0;
                        }
                        if (k != i || m != j) {
                            if (field[kk][mm]) {
                                alive++;
                            }
                        }


                    }
                }
                indexes[i][j] = alive;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                field[i][j] = indexes[i][j] == 3 || (field[i][j] && indexes[i][j] == 2);
            }
        }

    }

    public boolean getState(int i, int j) {
        return field[i][j];
    }
}