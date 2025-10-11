package org.qa.light.session3.homeWork;


public class Main {

    public static void main(String[] args) {

        //TODO: unlock, make call, lock screen for both phones
        Android samsung = new Android();
        IOS iphone17 = new IOS();

        System.out.println("--- Android ---");
        usePhone(samsung);
        System.out.println("--- IOS ----");
        usePhone(iphone17);

    }
    //TODO: unlock, make call, lock screen for both phones
    public static void usePhone(IPhone phone) {
        phone.unlockScreen();
        phone.call();
        phone.blockScreen();
    }
}