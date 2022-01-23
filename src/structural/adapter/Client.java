package structural.adapter;

public class Client {

    public void request(Target target) {
        target.request();
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.request(new Adapter(new Adaptee()));
    }
}
