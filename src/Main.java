public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(750);
        boss.setDamage(30);
        Weapon weapon = new Weapon(WeaponType.SWORD, "Katana");
        boss.setWeapon(weapon);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setDamage(50);
        skeleton1.setHealth(800);
        skeleton1.setArrows(50);
        Weapon weapon1 = new Weapon(WeaponType.GUN, "Bow");
        skeleton1.setWeapon(weapon1);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setDamage(40);
        skeleton2.setHealth(780);
        skeleton2.setArrows(60);
        Weapon weapon2 = new Weapon(WeaponType.GUN, "Bow");
        skeleton2.setWeapon(weapon2);

        boss.printInfo();
        skeleton2.printInfo();
        skeleton1.printInfo();
    }
}