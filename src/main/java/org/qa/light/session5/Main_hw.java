package org.qa.light.session5;

import org.qa.light.session4.Boat;

import java.util.*;

// each boat has one or more owners -> check this with assert
// each owner must be unique
// print boat names for boats with only one owner

public class Main_hw {
    public static void main(String[] args) {

        // Створюємо човни
        Boat boat1 = new Boat();
        boat1.name = "Sea";
        boat1.color = "Blue";

        Boat boat2 = new Boat();
        boat2.name = "Poseidon";
        boat2.color = "White";

        Boat boat3 = new Boat();
        boat3.name = "Zews";
        boat3.color = "Green";

        Boat boat4 = new Boat();
        boat4.name = "NotOwner";
        boat4.color = "Black";

        // Створюємо мапу: Boat -> список власників
        Map<Boat, List<String>> boatOwners = new HashMap<>();

        boatOwners.put(boat1, Arrays.asList("Alla", "Bill"));
        boatOwners.put(boat2, Collections.singletonList("Olena"));
        boatOwners.put(boat3, Arrays.asList("Serhii", "Oksana", "Nazar","Alla")); //Alla повторюється
        //Щоб отримати assert
        //boatOwners.put(boat4, new ArrayList<>());

        // each boat has one or more owners -> check this with assert
        // перевіряємо, що у кожного човна є хоча б один власник
        for (List<String> owners : boatOwners.values()) {
            assert !owners.isEmpty() : "У човна немає власників!";
        }

        // each owner must be unique
        Set<String> uniqueOwners = new HashSet<>();
        for (List<String> owners : boatOwners.values()) {
            for (String owner : owners) {
                if (!uniqueOwners.add(owner)) {
                    System.out.println("Повторюється власник: " + owner);
                }
            }
        }

        //  print boat names for boats with only one owner
        System.out.println("------------------");
        System.out.println("Човни, що мають лише одного власника:");
        for (Boat boat : boatOwners.keySet()) {
            List<String> owners = boatOwners.get(boat);
            if (owners.size() == 1) {
                System.out.println("Човен " + boat.name);
            }
        }
    }
}
