import models.*;
import java.util.*;

public class Program {

    private static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        // Standard-ctor verwenden
        Contact c = new Contact();
        //
        Contact c2 = new Contact("Daniel", "Niederhauser", 16, Department.W, true, 2081.90, 'a');

        Contact c3 = new Contact("Michael", "Perktold", 16, Department.W, true, 2081.90, 'p');



        List<Contact> contacts = new ArrayList<Contact>();
        Boolean choice;

        do{

            contacts.add(createContact());
            System.out.print("weiteren Kontakt eingeben [true, false]");
            choice = reader.nextBoolean();

        }while(choice == true);

        // alle eingegebenen Kontakte ausgeben
        for(Contact co : contacts){
            System.out.println(co);
        }

    }

    // Tipp zu Methoden: eine Methode sollte immer nur eine Aufgabe erfüllen
    public static Contact createContact(){
        Contact c = new Contact();

        //Eingabe
        System.out.print("Vorname: ");
        c.set_firstname(reader.nextLine());
        System.out.print("Lastname: ");
        c.set_lastname(reader.nextLine());
        System.out.print("Alter: ");
        c.set_age(reader.nextInt());

        System.out.print("Abteilung [0..W, 1..E, 2..N, 3..M, 4..B, 5..keine] ");
        String dep = reader.next();
        dep = dep.toUpperCase();
        c.set_department(Department.valueOf(dep));

        System.out.print("Männlich: ");
        c.set_isMale(reader.nextBoolean());
        System.out.print("Gehalt: ");
        c.set_salary(reader.nextDouble());
        System.out.print("Lieblingsbuchstabe: ");
        c.set_favoriteCharacter(reader.next().charAt(0));


        return c;
    }
}
