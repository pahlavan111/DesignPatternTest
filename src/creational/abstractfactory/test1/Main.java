package creational.abstractfactory.test1;

public class Main {
    public static void main(String[] args) {

        Color color1 = ColorFactory.getColor("red");
        color1.fill();
        Color color2 = ColorFactory.getColor("blue");
        color2.fill();


        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("rectangle");
        shape2.draw();

        AbstractFactory factory = FactoryProducer.getFactory("color");

    }
}
