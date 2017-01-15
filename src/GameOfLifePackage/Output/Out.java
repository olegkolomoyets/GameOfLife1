package GameOfLifePackage.Output;

import GameOfLifePackage.General.Field;

class Out implements GameOutput {

    public void render(Field field) {
        int size = field.getSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!field.getState(i, j)) {
                    System.out.print(". ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
        }
        for (int count = 0; count < 50; count++) {
            System.out.println();
        }

    }
}
