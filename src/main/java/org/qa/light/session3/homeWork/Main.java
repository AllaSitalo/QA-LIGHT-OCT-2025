package org.qa.light.session3.homeWork;


public class Main {

    public static void main(String[] args) {

        //unlock, make call, lock screen for both phones

        Android samsung = new Android();
        samsung.modelName = "Samsung A18";
        samsung.color = "blue";

        IOS iphone17 = new IOS();
        iphone17.modelName = "Iphone 17 256 gb";
        iphone17.color = "pink";

        //create android/ios with null model and/or hascode,
        //and try to handle exceptions if they appear
        IOS iphone17Pro = new IOS();
        iphone17Pro.modelName = null;
        iphone17Pro.color = "pink";

        System.out.println("--- Android ---");
        usePhone(samsung);
        System.out.println("--- IOS ----");
        usePhone(iphone17Pro);

        //Homework 4
        System.out.println("--- Порівняння телефонів ----");
        equalsPhone(samsung, samsung);
        equalsPhone(iphone17Pro, iphone17);
        System.out.println(iphone17.hashCode());
        System.out.println(iphone17Pro.hashCode());

    }

    //порівнюємо два телефона за кольором та назвою моделі
    public static void equalsPhone(IPhone phone1, IPhone phone2) {
        try {
            System.out.println("Два телефона є однаковими: " + phone1.equals(phone2));
        } catch (Exception e) {
            System.out.println("Oops! Something went wrong with equals");
        }
    }


    public static void usePhone(IPhone phone) {
        phone.unlockScreen();
        phone.call();
        phone.blockScreen();
    }

}