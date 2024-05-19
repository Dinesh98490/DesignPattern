public class Singleton {
    private static Singleton instance =null;
    private Singleton() {
        System.out.println("Singleton is created");
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonClass {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s2.hashCode());
    }
}
