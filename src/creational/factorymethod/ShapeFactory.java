package creational.factorymethod;

public class ShapeFactory {

    public static Shape getShape(String shapeType) throws NullPointerException {

        if (shapeType != null) {

            if (shapeType.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();

            } else if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new Square();

            } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            }else if (shapeType.equalsIgnoreCase("TRIANGLE")){
                return new Triangle();
            }
        }

        return null;
    }
}
