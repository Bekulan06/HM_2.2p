public class Iphone extends AppleDevice{

    public Integer networkGen;

    public Integer getNetworkGen() {
        return networkGen;
    }

    public Iphone(String name, int storage, int year, Integer networkGen) {
        super(name, storage, year);
        this.networkGen=networkGen;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Supports: "+ getNetworkGen());
    }
}
