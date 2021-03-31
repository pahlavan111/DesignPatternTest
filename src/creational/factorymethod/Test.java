package creational.factorymethod;

public class Test {
    public static void main(String[] args) {

            Shape shape1 = ShapeFactory.getShape("circle");
            shape1.draw();

            Shape shape2 =ShapeFactory.getShape("triangle");
            shape2.draw();

    }
}
