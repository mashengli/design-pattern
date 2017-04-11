package pers.mashengli.learning.design.pattern.decorator;

/**
 * @author mashengli
 */
public class DecoratorA extends Decorator {

    public DecoratorA(Dress dress) {
        super(dress);
    }

    @Override
    public void wear() {
        super.wear();
        addShirts();
        addSkirt();
    }

    public void addShirts() {
        System.out.println("wearing shirt~~~");
    }

    public void addSkirt() {
        System.out.println("wearing skirt~~~");
    }
}
