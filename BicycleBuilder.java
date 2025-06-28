public class BicycleBuilder extends AbstractBuilder {
    private Bicycle bicycle;
    public BicycleBuilder() {
        this.bicycle = new Bicycle();
    }

    public Bicycle getBicycle() {
        return bicycle;
    }


}
