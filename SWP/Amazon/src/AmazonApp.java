import models.Article;
import models.Basket;
import models.BasketItem;
import models.Shop;

import java.util.*;

import static java.lang.System.*;

// importiert alles von java util
                    // wir brauchen Scanner, Listen und ArrayListen
public class AmazonApp {
    private static Scanner Reader = new Scanner(System.in);


    public static void main(String[] args) {
        Shop _amazonshop = new Shop();
        Basket _basket = new Basket();

           char wahl;
     char choice;
     int _id;
     int _stückanzahl;

     do {
         wahl = mainMenu();
         switch (wahl) {
             case 'a':
    // add articles from basket
                     out.println(_amazonshop);
                     out.print("Geben Sie die Artikel ID ein, die hinzugefügt werden soll: ");
                     _id = Reader.nextInt();
                     Article a = _amazonshop.getArticleByID(_id);
                     if(a == null){
                         out.println("Artikel nicht vorhanden!!!!");
                     }
                     else{
                         out.print("Geben Sie die Stückanzahl ein: ");
                             _stückanzahl = Reader.nextInt();
                             if(_stückanzahl < 0) {
                                 _stückanzahl = _stückanzahl * (-1);
                             }
                                 _basket.addItem(new BasketItem(a, _stückanzahl));
                     }
                 break;
             case 'b':
                 out.println(_basket.toString());
                 break;
             case 'c':
                 // remove articles from basket
                 out.print("Geben Sie die Artikel ID ein, die entfernt werden soll: ");
                 _id = Reader.nextInt();
                 if(_basket.removeItem(_id)){
                     out.println("Artikel wurde aus dem Warenkorb entfernt.");
                 }
                else {
                     out.println("Artikel konnte nicht entfernt werden. Könnte eine falsche Artikel ID sein");;
                 }
                 break;
             case 'd':
            // Abfrage machen, welche Zahlungsmöglichkeit besteht und Bestätigungsemail schicken
                 /*String username = Zugangsdaten.USERNAME;
                 String password = Zugangsdaten.PASSWORD;

                 MailSender sender = new MailSender();
                 sender.login("smtp.gmail.com", "465", username, password);
                 catch(Exception e){
                     e.printStackTrace();
             }
             */
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

    public static void serializeArticle(Article articleName, ){
        //erweiterte Version von try - mit ()-Klammern
        // innerhalb der ()-Klammern werden Instanzen für Ressourcen angegeben,
        // diese müssen unbedingt möglichst rasch wieder freigegeben werden
        try(FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(article);
        }       // hier werden die obigen Ressourcen wieder freigeben
        // es wird automatisch der finally-Block eigefügt
        catch(IOException e){
            System.out.println("Serialisierung hat nicht funktioniert!");
        }
    }
}
