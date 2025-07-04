public class SawBuilder extends AbstractBuilder {
    private Saw saw;

    public SawBuilder() {
        this.saw = new Saw();
    }

    public Saw GetWeapon() {
        return saw;
    }
}
