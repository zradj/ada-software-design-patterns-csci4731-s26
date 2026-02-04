package az.edu.ada.modules.module02.lecture04;

public class DBConnection {

    private DBConnection() {
        System.out.println("Connected to the DB!");
    }

    private static final class DBConnectionInstanceHolder {
        private static final DBConnection instance = new DBConnection();
    }

    public static DBConnection getInstance() {
        return DBConnectionInstanceHolder.instance;
    }
}
