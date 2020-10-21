package 面向对象;

public class HeroHostWeaponTest01 {
    public static void main(String[] args) {
        Host host = new Host();
        Hero hero = new Hero();
        Weapon weapon = new Weapon();
        host.name = "小龟";
        host.num = 300;
        host.mold = "潜水型";
        hero.name ="李小侠";
        hero.num = 800;
        weapon.name ="死神镰刀";
        weapon.num = 100;
        host.print();
        hero.print();
        weapon.print();
    }
}
