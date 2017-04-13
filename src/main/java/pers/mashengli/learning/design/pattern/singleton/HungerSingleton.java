package pers.mashengli.learning.design.pattern.singleton;

/**
 * @author mashengli
 */
public class HungerSingleton {
    private static HungerSingleton singleton = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return singleton;
    }
}
