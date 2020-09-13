import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

import models.*;

public class Serialization {

    /*

        Sinn: ermöglicht das einfache abspeichern und auslesen
              von kompletten Instanzen, Listen von Instanzen und Objektbäumen



        Voraussetzung:
                    jede abzuspeichernde Klasseninstanz muss das Interface Serializeable
                    implementieren (diese Interface besitzt allerdings keine Methode)
                    => funktioniert im Hintergrund durch Reflection


        benötigte Klassen:
                        Speichern
                            FileOutputStream
                            ObjectOutputStream

                        Laden
                            FileInputStream
                            ObjectInputStream

     */

    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        char choice;
        Person p = new Person(1, "Daniel", 2810.90);
        p.setAddress(new Address(100, "Anichstraße"));
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Philipp", 2810.90));
        people.add(new Person(1, "Sebastian", 3110.90));
        people.get(0).setAddress(new Address(100, "Museumsstraße"));
        people.get(1).setAddress(new Address(10, "Irgendwo"));

        String filePerson = "person.bin";
        String filePeople = "people.bin";

        Person personFromFile;

        do{
            choice = menu();
            switch(choice){
                case 's':
                    createFile(filePerson);
                    serializPerson(filePerson, p);
                    break;
                case 'a':
                    personFromFile = deserializePerson(filePerson);
                    System.out.println(personFromFile);
                    System.out.println(personFromFile.getAddress());
                    break;
                case 'm':
                    serializeMorePersons(filePeople, p);
                    createFile(filePerson);
                    break;
                case 'n':
                    break;
                case 'b':
                    System.out.println("Programm wird beendet");
                    break;
                default:
                    System.out.println("falsche Taste");
                    break;
            }
        }while(choice != 'b');

    }

    public static char menu(){
        System.out.println("s ... eine Person speichern");
        System.out.println("a ... eine Person anzeigen");
        System.out.println("m ... mehrere Personen speichern");
        System.out.println("n ... mehrere Person anzeigen");
        System.out.print("Ihre Wahl: ");
        return reader.nextLine().toLowerCase().charAt(0);
    }


    public static void serializPerson(String filename, Person person){
        //erweiterte Version von try - mit ()-Klammern
        // innerhalb der ()-Klammern werden Instanzen für Ressourcen angegeben,
        // diese müssen unbedingt möglichst rasch wieder freigegeben werden
        try(FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(person);
        }       // hier werden die obigen Ressourcen wieder freigeben
                // es wird automatisch der finally-Block eigefügt
        catch(IOException e){
            System.out.println("Serialisierung hat nicht funktioniert!");
        }
    }

    public static Person deserializePerson(String filename){
        try(FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
            // Rückgabe Wert von readObject() ist immer die Basisklasse Object
            // dies muss noch in den gewünschten Typ(hier Person) konvertiert werden
            return (Person)ois.readObject();
        }
        catch(IOException e){
            System.out.println("Serialisierung hat nicht funktioniert!");
        }
        catch(ClassNotFoundException e){
            System.out.println("Klasse Person oder Addresse existiert nicht!");
        }
        return null;
    }

    private static void createFile(String filename){
        try {
            Files.createFile(Paths.get(filename));
        }
        catch(FileAlreadyExistsException e){
            System.out.println("Fehler : Datei existiert bereits!");
        }
        catch(IOException e){
            // ausagekräftige Fehlermeldung anzeigen
            System.out.println("Fehler: IO-Fehler");
            // Fehlermeldung von JAVA
            // System.out.println(e.getMessage());
            //Stacktrace ist sehr wichtig, aber nicht für
            // den Benutzer
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        }
    }

    public static void serializeMorePersons(String filename, List<Person> people){
        try(FileOutputStream gul = new FileOutputStream(filename);
            ObjectOutputStream sul = new ObjectOutputStream(gul))
        {
             sul.writeObject(people);
        }
        catch (IOException e){
            System.out.println("Serialisierung hat nicht funktioniert!");
        }
    }

    public static List<Person> deserializeMorePersons(String filename){
        try(FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
                // Rückgabe Wert von readObject() ist immer die Basisklasse Object
                // dies muss noch in den gewünschten Typ(hier Person) konvertiert werden
                return (List<Person>) ois.readObject();
        }
        catch(IOException e){
            System.out.println("Serialisierung hat nicht funktioniert!");
        }
        catch(ClassNotFoundException e){
            System.out.println("Klasse Person oder Addresse existiert nicht!");
        }
        return null;
    }

}
