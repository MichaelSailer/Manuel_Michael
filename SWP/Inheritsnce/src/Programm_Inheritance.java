import models.*;
import java.util.*;

public class Programm_Inheritance {

    public static void main(String[] args) {
        // es wird meistens die Basisklassa verwendet
        List<Person> employees = new ArrayList<Person>();
        List<Apprentice> angestellter = new ArrayList<Apprentice>();

        // es muss die Basisklasse oder eine Unterklasse davon
        // an die add() -Methode übergeben werden
        employees.add(new Consultant("Michael", "Perktold", "6020", "Ibk", "Anichstraße",
                "14c", "1231223", 108.90, 2.5));
        employees.add(new Consultant("Manuel", "Sailer", "6020", "Ibk", "Anichstraße",
                "14c", "1231233", 109.90, 2.6));
        employees.add(new Apprentice("Daniel", "Niederhauser", "6020", "Ibk,", "Anichstraße",
                "15c", "1231234", 190.67));
        employees.add(new Permanent_Employee("Lukas", "Holz", "6020", "IBK", "Anichstraße",
                "16b", "9786548", 34.67, 45.67, 34.56));
        employees.add(new Permanent_Employee("Peter", "Holzmann", "6020", "IBK", "Anichstraße",
                "16b", "9786548", 34.67, 45.67, 34.56));
        employees.add(new Manager("Julian", "Bichlmann", "6020", "Ibk", "Anichstraße", 406.90,
                "13a", "7869549", 567.76, 321.78,45.78));


        for(Person p : employees){
            System.out.println(p);
            System.out.printf("Gehalt: %.2f\n" , p.calculateSalary());
        }

        // employees.get(3)   ...   und eine Methode von PermanentEmployee aufrufen

        // Zugriff auf ein Element innerhalb der Liste
        Person persl = employees.get(0); // ist in unserem Beispiel der Consultant Michael Perktold

        // da persl vom Typ Person ist, haben wir nur auf alle öffentlichen Members von Person
        // Zugriff alle öffentlichen Members von Consultant sind ohne Typcast(wird weiter unten erklärt) nicht zugreifbar
        persl.setLastname("Perktold");

        // Typcast - Umwandlung einer Instanz in einen anderen Typ(Untertyp, Kindtyp, Childtyp)
        // es muss nur der gewünschte Datentyp(hier: Consultant) innerhalb der () - Klammern
        // vor die Instanz geschrieben werden
        Consultant michael = (Consultant)employees.get(0);
        // nun können wir auf alle öffentlichen Members von Cosultant(und natürlich auch von Person)
        // zugreifen
        System.out.printf("Name: %s %s \n", michael.getFirstname(), michael.getLastname()); // Members von Person
        System.out.printf("Stundenanzahl: %.1f \n", michael.getNumberOfHours()); // Member von Consultant

        // Vorsicht: Falle employees.get(0) nicht von Typ consultant ist, wird ein Exception(Fehler und
        // Programmabbruch) errzeugt
        // wichtig: immer zuerst überprüfen, ob der Typcast möglich ist - "instanceof"
        Consultant michaelp;
        if(employees.get(0) instanceof Consultant){
            michaelp = (Consultant)employees.get(0);

            // hier kenn michaelp gefahrlos verwendet werden
            System.out.printf("Name: %s %s \n", michael.getFirstname(), michael.getLastname());
            System.out.printf("Stundenanzahl: %.1f \n", michael.getNumberOfHours());
        }
        else{
            System.out.println("diese Person ist nicht vom Typ Consultant");
        }

    }
}
