public class AirPots extends AppleDevice{
    private int noise_reduicion;

    public int getNoise_reduicion() {
        return noise_reduicion;
    }

    public AirPots(String name, int storage, int year, int noise_reduicion) {
        super(name, storage,  year);
        this.noise_reduicion=noise_reduicion;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Noise reduicion: " + getNoise_reduicion());
    }
}
