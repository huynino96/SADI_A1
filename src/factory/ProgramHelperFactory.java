package factory;

public class ProgramHelperFactory {
    public static ProgramHelper getHelper(String helperType) {
        if(helperType.equals("UserHelper")) {
            return new UserHelper();
        } else {
            return  null;
        }
    }
}
