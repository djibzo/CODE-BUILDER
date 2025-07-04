import interfaces.Weapon;

import java.util.ArrayList;
import java.util.Iterator;

public class WeaponFactory {
    public static Weapon createWeapon(String type) throws Exception {
        Weapon weapon = null;
        switch (type.toLowerCase()) {
            case "gun":
                weapon  = new GunBuilder()
                        .PaintMeshGPU()
                        .LoadMeshGPU()
                        .PreloadMeshInCache()
                        .PositionRightHand()
                        .GetWeapon();

                break;
                case "saw":
                    weapon  = new SawBuilder().
                        LoadMeshGPU()
                        .PaintMeshGPU()
                        .PreloadMeshInCache()
                        .PositionRightHand()
                        .GetWeapon();
                    break;
            case "bicycle":
                weapon  = new BicycleBuilder()
                        .LoadMeshGPU()
                        .PreloadMeshInCache()
                        .PositionRightHand()
                        .LoadMeshGPU().GetWeapon();
                break;
            default:
                throw new Exception("Unknown weapon type: " + type);
            
        }
        return weapon;
    }
}
