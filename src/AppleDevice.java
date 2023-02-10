
public abstract class AppleDevice implements Printable{
    public String name;
    public int storage;
    public int year;

    public String getName() {
        return name;
    }

    public int getStorage() {
        return storage;
    }


    public int getYear() {
        return year;
    }

    public AppleDevice(String name, int storage, int year) {
        this.name = name;
        this.storage = storage;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("Name "+getName()
                +"\nStorage "+getStorage()
                +"\nYear "+getYear());
    }
}
