import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class Exceptions_Filemanagement {

    // Exceptionhandling
    // => auf Ausnahmesituationen reagieren können

    /*
        1.
            try{
                Codezeile 1
                Codezeile 2 = passiert zum Beispiel hier eine Exception werden die darunter liegenden Befehle nicht mehr ausgeführt
                              -> es wird zum passenden chatch-Block gesprungen
                Codezeile 3
                usw.
            }
            catch(<Exceptionklasse> var){   = es können belibieg viele chatch-Blöcke vorhanden sein
                Meldung ausgeben
                Loggen
            }
            catch(<Exceptionklasse2> var){
                Meldung ausgeben
                Loggen
            }
            <finally{       = dieser Block ist optional(Dieser Block muss nicht sein)
                dieser Bereich wird immer ausgeführt
                bei Fehler, aber auch wenn kein Fehler passiert
                hier werden Ressourcen wieder freigegeben
            }>

            Exceptionklassen: Basisklasse: Exception
                        => es existiert eine Vererbungshierarchie bei den Exceptionklassen


            Bei Bedarf kann man auch eigene Exceptionklassen schreiben

            throw, throws .. hiermit kann eine Exception im Programmcode geworfen werden


     */

    /*

        Directory- und Filemanagement
            Klassen um mit Verzeichnissen bzw. Dateien zu arbeiten

            alle Instanzen sind normalerweise nur im RAM vorhanden
            => wird das Programm beendet, gehen alle Deteien verloren
            => Lösung: in einer Datei oder Datenbank abspeichern

            Package: io ... alte Klassen für input/output
                     nio .. neue Klassen für input/output

            wichtigeKlassen: Files, Path

    */

     static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        char choice;
        String filename = "";
        BufferedWriter writer = null;
        String text;


        do {
            choice = Menu();
            switch (choice) {
                case 'e':
                    System.out.print("Dateiname: ");
                    filename = reader.nextLine();
                    createFile(filename);
                    break;
                case 'ö':
                    System.out.print("zu öffnende Datei: ");
                    filename = reader.nextLine();
                    writer = openFile(filename);
                    break;
                case 'd':
                    // Datei wurde geöffnet (Menüpunkt 'ö')
                    if(writer != null){
                        do {
                            System.out.print("Ihr Text <end> ... beenden: ");
                            text = reader.nextLine();
                            if (!text.toLowerCase().equals("end")) {
                                appendText(text, writer);
                            }
                        }while(!text.toLowerCase().equals("end"));
                    }
                    else if( (filename != null) && !filename.isEmpty() ){
                        do {
                            System.out.print("Ihr Text <end> ... beenden: ");
                            text = reader.nextLine();
                            if (!text.toLowerCase().equals("end")) {
                                appendText(text, filename);
                            }
                        }while(!text.toLowerCase().equals("end"));
                    }
                    else{
                        System.out.println("Keine Datei erzeugt bzw. keine Datei geöffnet!");
                    }
                    break;
                case 'a':
                    printContent(filename);
                    break;
                case 'z':
                    printRow(filename);
                    break;
                case 'l':
                    deleteFile(filename);
                    break;
                case 'b':
                    System.out.println("Programm wird beedet!");
                    break;
                default:
                    System.out.println("falsche Taste gedrückt!");
                    break;
            }
        }while(choice!='b');



    }
    private static char Menu(){
        System.out.println("e ... Datei erzeugen");
        System.out.println("ö ... Datei öffnen");
        System.out.println("d ... Daten in Datei schreiben");
        System.out.println("a ... Datei komplett ausgeben");
        System.out.println("z ... Datei zeilenweise ausgeben");
        System.out.println("l ... Datei löschen");
        System.out.println("b ... Programm beenden");
        System.out.println("Ihre Wahl: ");
        return reader.nextLine().toLowerCase().charAt(0);
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
    private static BufferedWriter openFile(String filename){
        try{
            return Files.newBufferedWriter(Paths.get(filename), StandardOpenOption.APPEND);
        }
        catch(IOException e){
            System.out.println("Fehler: Datei konnte nicht geöffnet werden.");
        }
        return null;
    }
    private static void appendText(String text, BufferedWriter writer){
        try{
            writer.write(text + "\n");
            writer.flush();
        }
        catch(IOException e){
            System.out.println("Fehler: Text konnte nicht in der Datei abgelegt werden!");
        }
    }
    private static void appendText(String text, String filename){
        try{
            text += "\n";
            Files.write(Paths.get(filename), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch(IOException e){
            System.out.println("Fehler: Text konnte nicht in der Datei abgelegt werden!");
        }
    }
    private static void printContent(String filename){
        try {
            String content = Files.readString(Paths.get(filename));
            System.out.println(content);
        }
        catch(IOException e){
            System.out.println("Dateiinhalt konnte nicht gelesen werden!");
        }
    }
    private static void printRow(String filename){
        String a="";
        try{
            List<String> content = Files.readAllLines(Paths.get(filename));
            for(int i=0;i>content.size();i++){
                a += a+1 + ":" + content.toArray()[i] + "\n";
            }
            System.out.println(a);
        }
        catch(IOException e){
            System.out.println("Dateiinhalt konnte nicht gelesen werden!");
        }
    }
    private static void deleteFile(String filename){
       try{
           Files.delete(Paths.get(filename));
       }
       catch(IOException e){
           System.out.println("Fehler: IO-Fehler");
       }
    }
}
