package structural.decorator;

public class HoneyDecorator extends IceCreamDecorator {

    public HoneyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    @Override
    public String makeIceCream() {
        return specialIceCream.makeIceCream()+ addHoney();
    }

    private String addHoney(){
        return " + SweetHoney";
    }
}
