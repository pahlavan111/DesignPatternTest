package creational.abstractfactory.test1;

import javax.print.DocFlavor;

public class FactoryProducer {

    public static AbstractFactory getFactory (String factoryName){

        if (factoryName == null){
            return null;
        }else if (factoryName .equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if (factoryName.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}
