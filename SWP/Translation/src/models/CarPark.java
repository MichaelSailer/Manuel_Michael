package models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarPark {

    private static HashMap<String, List<Fahrzeug>> fahrzeuge = new HashMap<>();
    private static List<Fahrzeug> fahrzeugList = new ArrayList<>();
    private static List<Fahrzeug> fahrzeugList2 = new ArrayList<>();

    public static void add(Person a, List<Fahrzeug> b) {
        fahrzeuge.put(a, b);
    }

    public static void remove(Person a, Fahrzeug b){
        fahrzeuge.get(a).remove(b);
    }

    public static void remove(Person a){
        fahrzeuge.get(a).clear();
    }

    public static void main(String[] args) {

        Person a = new Person("Manuel", "Sailer", 16);
        Fahrzeug b = new Fahrzeug("Aluminium", "Verbrennungsmotor", 4.0, 'j');
        Fahrzeug b2 = new Fahrzeug("Metall", "Elektromotor", 4.0, 'n');
        Person a2 = new Person("Gustav", "Liebherr", 50);
        Person a3 = new Person("Burckhard", "Markt", 58);
        fahrzeugList.add(b);
        fahrzeugList2.add(b2);


        add(a, fahrzeugList);
        add(a2, fahrzeugList2);
        System.out.println(fahrzeuge.get(a).toString());

        remove(a3);
        System.out.println(fahrzeuge.get(a).toString());

        remove(a, b);
        System.out.println(fahrzeuge.get(a).toString());

        remove(a2);
        System.out.println(fahrzeuge.get(a).toString());

    }

}
