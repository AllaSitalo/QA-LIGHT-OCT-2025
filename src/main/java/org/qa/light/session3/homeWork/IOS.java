package org.qa.light.session3.homeWork;

public class IOS implements IPhone {
    //create classes IOS and Android which implement IPhone
    @Override
    public void call() {
        System.out.println("IOS телефонує за набраним номером");
    }

    @Override
    public void unlockScreen() {
        System.out.println("IOS розблокований та увімкнувся екран");
    }

    @Override
    public void blockScreen() {
        System.out.println("IOS завершила роботу та вимкнувся екран");
    }
}
