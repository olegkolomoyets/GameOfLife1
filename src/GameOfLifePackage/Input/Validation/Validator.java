package GameOfLifePackage.Input.Validation;

import java.io.File;
import java.io.IOException;

public interface Validator {
    void formValidation(File file) throws IOException;

    void signValidation(File file) throws IOException;
}
