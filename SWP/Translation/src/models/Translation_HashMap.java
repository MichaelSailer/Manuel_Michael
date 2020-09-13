package models;

import java.util.HashMap;
import java.util.Map;

public class Translation_HashMap {

    public static void main(String[] args) {


        // erzeugen eine HashMap
        // Key: vom Typ String -> deutsches Wort
        // Value: vom Typ String -> englische Übersetzung
        HashMap<String, String> translations = new HashMap<String, String>();

        // mehrere Wörter + Pbersetzung hizufügen
        translations.put("Eins", "one");
        translations.put("Apfel", "apple");
        translations.put("Maus", "mouse");
        translations.put("Milch", "milk");
        translations.put("Stift", "pencil");

        // zu einem bestimmten Key den Value ausgeben
        System.out.println(translations.get("Apfel"));
        System.out.println(translations.get("Stift"));


        // die komplete HashMap ausgeben
        System.out.println(translations);

        // alle deutschen Wörter übersetzen und in Tabelenform ausgeben
        for (Map.Entry<String, String> t : translations.entrySet()){
            System.out.printf("%20s %s\n",  t.getKey(), t.getValue());
        }

        // einen spetiellen Eintrag löschen
        translations.remove("Apfel");
        System.out.println("\n");
        for (Map.Entry<String, String> t : translations.entrySet()){
            System.out.printf("%20s %s\n",  t.getKey(), t.getValue());
        }

        // eine englisch sprachige Übersetzung ndern
        translations.replace("Stift", "pen");
        System.out.println("\n");
        for (Map.Entry<String, String> t : translations.entrySet()){
            System.out.printf("%20s %s\n",  t.getKey(), t.getValue());
        }




    }
}
