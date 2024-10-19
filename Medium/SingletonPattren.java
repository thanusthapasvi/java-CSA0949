class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() throws Exception {
        if (instance == null) {
            instance = new Singleton();
        } else {
            throw new Exception("Cannot create another instance. Use getInstance() method.");
        }
        return instance;
    }
}

public class SingletonPattren {
    public static void main(String[] args) {
        try {
            Singleton obj1 = Singleton.getInstance();
            System.out.println("Singleton object created.");
            Singleton obj2 = Singleton.getInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
