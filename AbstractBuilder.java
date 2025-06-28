import interfaces.Weapon;

abstract class AbstractBuilder {
    private Weapon weapon;
    public AbstractBuilder LoadMeshGPU()
    {
        System.out.println("Loading file weapons/gun/gun.mesh in GPU");
        return this;

    }
    public AbstractBuilder PaintMeshGPU() {
        System.out.println("Painting all parts of Saw for GPU.");
        return this;
    }
    public AbstractBuilder PositionRightHand()
    {
        System.out.println("Join right hand with right handle");
        return this;
    }
    public AbstractBuilder PaintMeshGPU()
    {
        System.out.println("Painting all parts of Bike for GPU.");
        return this;
    }
    public AbstractBuilder PreloadMeshInCache()
    {
        System.out.println("Preloading the mesh in the GPU's cache.");
        return this;
    }
}
