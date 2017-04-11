package pers.mashengli.learning.design.pattern.decorator;

/**
 * @author mashengli
 */
class Dress {
    private String name;

    public Dress() {
    }

    public Dress(String name) {
        this.name = name;
    }

    void wear() {
        System.out.println("decorator" + name);
    }
}
