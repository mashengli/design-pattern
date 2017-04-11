package pers.mashengli.learning.design.pattern.decorator;

/**
 * @author mashengli
 */
public class DecoratorB extends Decorator {

    public DecoratorB(Dress dress) {
        super(dress);
    }

    @Override
    public void wear() {
        addUnderWear();
        super.wear();
        addGlasses();
    }

    public void addUnderWear() {
        System.out.println("wearing underwear~~~");
    }

    public void addGlasses() {
        System.out.println("wearing glasses~~~");
    }
}
