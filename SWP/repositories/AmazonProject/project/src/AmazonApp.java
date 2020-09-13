import models.Article;
import models.Basket;
import models.BasketItem;
import models.Shop;
import java.nio.*;
import java.io.*;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DrbgParameters;
import java.util.*;

import static java.lang.System.*;

// importiert alles von java util
                    // wir brauchen Scanner, Listen und ArrayListen
public class AmazonApp {
    private static Scanner Reader = new Scanner(System.in);
    static Shop _amazonshop = new Shop();
    static Basket _basket = new Basket();

    public static void main(String[] args) {

        char wahl;
     char choice;
     int _id = 0;
     int _stückanzahl = 0;
        checkArticles();
     do {
         wahl = mainMenu();
         switch (wahl) {
             case 'a':
    // add articles from basket
                     addArticle(_id, _stückanzahl);
                 break;
             case 'b':
                 out.println(_basket.toString());
                 break;
             case 'c':
                 // remove articles from basket
                removeArticleFromBasket(_id);
                 break;
             case 'd':
            // Abfrage machen, welche Zahlungsmöglichkeit besteht und Bestätigungsemail schicken
                 break;
             case 'e':
                 out.println(_amazonshop);
         break;
         case 'f':
             out.println("Programm wird beendet");
             System.exit(1);
             break;
         default:
             out.println("Falsche Eingabe");
             System.exit(1);
             break;
         }
     }while(wahl != 'f');

    }
      public static char mainMenu(){
        out.println("a ... Artikel hinzufügen");
        out.println("b ... Warenkorb einsehen");
        out.println("c ... Waren im Warenkorb löschen");
        out.println("d ... Bestellen und Bezahlen"); // hier soll noch eine EMAil mit den jeweiligen Schrott an den Verkäufer versendet werden. Natürlich auch
        out.println("e ... Artikel anzeigen lassen, die ausgwählt werden können"); // eine Angabe der Kontaktdaten
        out.println("f ... beenden");
        out.print("Ihre Wahl: ");
        return Reader.next().toLowerCase().charAt(0);
    }
    private static void addArticle(int id, int stückanzahl){
        out.println(_amazonshop);
        out.print("Geben Sie die Artikel ID ein, die hinzugefügt werden soll: ");
        id = Reader.nextInt();
        Article a = _amazonshop.getArticleByID(id);
        if(a == null){
            out.println("Artikel nicht vorhanden!!!!");
        }
        else{
            out.print("Geben Sie die Stückanzahl ein: ");
            stückanzahl = Reader.nextInt();
            if(stückanzahl < 0) {
                stückanzahl = stückanzahl * (-1);
            }
            _basket.addItem(new BasketItem(a, stückanzahl));
        }
    }
    private static void removeArticleFromBasket(int id){
        out.print("Geben Sie die Artikel ID ein, die entfernt werden soll: ");
        id = Reader.nextInt();
        if(_basket.removeItem(id)){
            out.println("Artikel wurde aus dem Warenkorb entfernt.");
        }
        else {
            out.println("Artikel konnte nicht entfernt werden. Könnte eine falsche Artikel ID sein");;
        }
    }
    private static void checkArticles(){
    createFile();
    compareContent();

    }
    private static void createFile(){
        try {
            Files.createFile(Paths.get("Shop-Artikel.txt"));

        }
        catch(FileAlreadyExistsException e){
            out.println("Fehler: Datei existiert bereits!");
        }
        catch(IOException e){
            out.println("Fehler: Die Datei konnte nicht erzeugt werden!");
        }
    }
    private static void compareContent(){
        try{
            String filename = "Shop-Artikel.txt";
            String content = Files.readString(Paths.get(filename));
        }
        catch (IOException e){
            out.println("Fehler: Datei konnte nicht gelesen werden!");
        }
    }
    private static void registration(){
        String username;
        String password;

        System.out.print("Geben Sie bitte Ihren Benutzernamen ein: ");
        username = Reader.nextLine();
        System.out.print("Geben Sie bitte Ihr Passwort ein: ");
        password = Reader.nextLine();
        if(password.equals(Files.readString())){

        }
    }
}
