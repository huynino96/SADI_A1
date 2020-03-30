package singleton;

import depencyinjection.EnrollmentStorage;

public class EnrollmentStorageSingleton {
    private static EnrollmentStorage instance = new EnrollmentStorage();

    private EnrollmentStorageSingleton() {

    }

    public static EnrollmentStorage getInstance() {
        return instance;
    }
}
