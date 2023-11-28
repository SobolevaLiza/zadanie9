package DBSingleton;

public class DBSingleton {

    private static final DBSingleton INSTANCE = new DBSingleton();

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        System.out.println("Instance");
        return INSTANCE;
    }

}
