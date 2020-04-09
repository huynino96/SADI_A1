package decorator;

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
        if (input.length() > 4) {
            char firstChar = input.charAt(0);
            char secondChar = input.charAt(1);
            char thirdChar = input.charAt(2);
            char fourthChar = input.charAt(3);
            return isDigit(firstChar) && isDigit(secondChar) && isDigit(thirdChar) && isDigit(fourthChar);
        } else {
            return false;
        }
    }

    @Override
    public boolean validateYear(String input) {
        return false;
    }
}
//    @Override
//    public boolean validateYear(String input) {
//        validator.validate(input);
//        int semester = Integer.valueOf(input);
//        if (semester > 0 && semester < 5) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

