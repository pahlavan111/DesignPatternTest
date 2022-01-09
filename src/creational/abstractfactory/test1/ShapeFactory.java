package creational.abstractfactory.test1;

public class ShapeFactory extends AbstractFactory{

    public static Shape getShape(String shapeName){
        if (shapeName == null){
            return null;
        }else if (shapeName.equalsIgnoreCase("rectangle")){
            return new ShapeRectangle();
        }else if (shapeName.equalsIgnoreCase("circle")){
            return new ShapeCircle();
        }
        return null;
    }

    @Override
    AbstractFactory getFactory(String factoryName) {
        return new ShapeFactory();
    }
}
