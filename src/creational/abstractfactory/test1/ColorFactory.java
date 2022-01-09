package creational.abstractfactory.test1;

public class ColorFactory extends AbstractFactory{

    public static Color getColor(String color){
        if (color == null){
            return null
                    ;
        }else if (color.equalsIgnoreCase("red")){
            return new ColorRed();
        }else if (color.equalsIgnoreCase("green")){
            return new ColorGreen();
        }else if (color.equalsIgnoreCase("blue")){
            return new ColorBlue();
        }
        return null;
    }

    @Override
    AbstractFactory getFactory(String factoryName) {
        return new ColorFactory();
    }
}
