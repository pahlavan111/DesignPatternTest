package structural.decorator;

public class NuttyDecorator extends IceCreamDecorator {

    public NuttyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    @Override
    public String makeIceCream() {
        return specialIceCream.makeIceCream()+addNut();
    }

    private String addNut(){
        return " + CrunchyNuts";
    }
}
