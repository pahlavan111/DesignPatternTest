package structural.decorator;

public class IceCreamDecorator implements IceCream{

    IceCream specialIceCream;

    public IceCreamDecorator(IceCream specialIceCream) {
        this.specialIceCream = specialIceCream;
    }

    @Override
    public String makeIceCream() {
        return specialIceCream.makeIceCream();
    }
}
