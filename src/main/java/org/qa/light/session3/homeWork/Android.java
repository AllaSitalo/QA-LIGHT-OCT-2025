package org.qa.light.session3.homeWork;

public class Android extends BasePhone implements IPhone {
    //create classes IOS and Android which implement IPhone
    @Override
    public void call() {
        System.out.println("Android телефонує і йдуть гудки");
    }

    @Override
    public void unlockScreen() {
        System.out.println("Android розблокований та відображається заставка");
    }

    @Override
    public void blockScreen() {
        System.out.println("Android вимкнув екран");
    }
}
