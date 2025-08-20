package com.xworkz.weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Weapon weapon = new Weapon();
        weapon.weaponId = 1;
        weapon.weaponName = "Katana";
        weapon.weaponType = "Sword";
        weapon.weightKg = 1.2;
        weapon.lengthMeters = 1.0;
        weapon.material = "Steel";
        weapon.paymentMode = "Cash";
        weapon.getWeaponInfo();
        System.out.println("Main Ended");
    }
}
