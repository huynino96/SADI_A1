package decorator;

import org.junit.Test;

public class TestValidator {
    @Test
    public void TestValidateSemester(){
        Validator validator = new Validator() {
            @Override
            public boolean validate(String input) {
                return false;
            }

            @Override
            public boolean validateYear(String input) {
                return false;
            }



        };



    }
}
