public class Mac extends AppleDevice{
    public int batteryLife;

    public int getBatteryLife() {
        return batteryLife;
    }

    public Mac(String name, int storage, int year, int batteryLife) {
        super(name, storage, year);
        this.batteryLife=batteryLife;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Up to: " + getBatteryLife()+" hours of battery life\n");
    }
}
