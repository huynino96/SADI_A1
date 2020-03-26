package validator;

public class ValidateEmptyInput implements Validator {

    @Override
    public boolean validate(String input) {
        return input.isEmpty();
    }
}
