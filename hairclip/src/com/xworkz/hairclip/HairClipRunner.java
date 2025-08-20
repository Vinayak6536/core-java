package com.xworkz.hairclip;

public class HairClipRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        HairClip clip = new HairClip();
        clip.clipId = 1;
        clip.brandName = "L'Oreal";
        clip.clipType = "Claw Clip";
        clip.clipColor = "Black";
        clip.clipPrice = 15.99;
        clip.paymentMode = "Credit Card";
        clip.getClipInfo();
        System.out.println("Main Ended");
    }
}
