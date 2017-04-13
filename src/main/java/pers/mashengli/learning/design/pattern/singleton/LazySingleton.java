package pers.mashengli.learning.design.pattern.singleton;

/**
 * @author mashengli
 */
public class LazySingleton {
    private static LazySingleton singleton;
    private LazySingleton() {
        singleton = new LazySingleton();
    }

    //concurrent unsafe
    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
