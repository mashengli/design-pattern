package pers.mashengli.learning.design.pattern.decorator;

/**
 * @author mashengli
 */
public class Client {
    public static void main(String[] args) {
        Dress dress = new Dress("小马1");
        DecoratorA decoratorA = new DecoratorA(dress);
        decoratorA.wear();
        Dress dress1 = new Dress("小马2");
        DecoratorB decoratorB = new DecoratorB(dress1);
        decoratorB.wear();
        Dress dress3 = new Dress("小马1+2");
        DecoratorA decoratorA1 = new DecoratorA(dress3);
        decoratorB = new DecoratorB(decoratorA1);
        decoratorB.wear();
    }
}
