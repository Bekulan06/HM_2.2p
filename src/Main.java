public class Main {
    public static void main(String[] args) {
        AppleDevice iphone = createObject("Iphone");
        assert iphone != null;
        iphone.print();
        AppleDevice mac = createObject("Macbook");
        assert mac != null;
        mac.print();
        AppleDevice airPots = createObject("Air Pots");
        assert airPots != null;
        airPots.print();

    }

    public static AppleDevice createObject(String className) {
        switch (className) {
            case "Iphone" -> {
                return new Iphone("Iphone 14 Pro", 512, 2020, 5);
            }
            case "Macbook" -> {
                return new Mac("Macbook Air", 512, 2020, 100);
            }
            case "Air Pots" -> {
                return new AirPots("Air pots", 16, 2022, 4);
            }
        }
        return null;

    }
}