package validator;

public class ValidateSemester implements Validator {
    private Validator validator;

    public ValidateSemester(Validator validator) {
        this.validator = validator;
    }

    private boolean isDigit(Character c) {
        return c >= '0' && c <= '9';
    }

    @Override
    public boolean validate(String input) {
        validator.validate(input);
        int semester = Integer.valueOf(input);
        if (semester > 0 && semester < 5) {
            return true;
        } else {
            return false;
        }

    }
}
