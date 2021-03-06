package decorator;

public class ValidateEmptyInput implements Validator {

    @Override
    public boolean validate(String input) {
        return input.isEmpty();
    }

    @Override
    public boolean validateYear(String input) {
        return input.isEmpty();
    }
}
