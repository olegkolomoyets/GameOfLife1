package GameOfLifePackage.Input.Validation;

import java.io.File;
import java.io.IOException;

public class ValidRunner {
    private final Validator valid;
    public ValidRunner(Validator valid) {
        this.valid = valid;
    }
    public void run(File file) throws IOException {

        valid.formValidation(file);
        valid.signValidation(file);

        }
    }

