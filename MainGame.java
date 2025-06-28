import interfaces.Weapon;


public class MainGame
{
    public static void main(String args[])
    {
        try {
            System.out.println("Creation weapon gun  : ");
            Weapon weapon1 = WeaponFactory.createWeapon("gun");
            System.out.println("Creation weapon saw  : ");
            Weapon weapon2 = WeaponFactory.createWeapon("saw");
            System.out.println("Creation weapon bicycle  : ");
            Weapon weapon3 = WeaponFactory.createWeapon("bicycle");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
