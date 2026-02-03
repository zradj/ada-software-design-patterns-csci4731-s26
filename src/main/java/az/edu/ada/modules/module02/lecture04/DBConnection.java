package az.edu.ada.modules.module02.lecture04;

public class DBConnection {
    private static DBConnection instance;

    private DBConnection() {
        System.out.println("Connected to the DB!");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
