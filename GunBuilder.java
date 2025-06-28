public class GunBuilder extends AbstractBuilder{
    private Gun gun;

    public GunBuilder() {
        this.gun=new Gun();
    }

    public Gun GetWeapon() {
        return gun;
    }

    public GunBuilder PositionRightHand() {
        System.out.println("Join right hand with gun's handle.part");
        return this;
    }

    public GunBuilder LoadMeshCPU()
    {
        System.out.println("Loading file weapons/gun/gun.mesh in CPU");
        return this;
    }

    public GunBuilder PaintMeshCPU()
    {
        System.out.println("Painting in black all parts of Gun for CPU.");
        return this;

    }

    public GunBuilder PreloadMeshInCache()
    {
        System.out.println("Preloading the mesh in the CPU's cache.");
        return this;

    }


}
