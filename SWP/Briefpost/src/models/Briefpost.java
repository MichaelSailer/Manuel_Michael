package models;

import java.util.Stack;

public class Briefpost {

    private static Stack<Brief> _stack = new Stack<>();
    private static Stack<Brief> _fertigStack = new Stack<>();

    public static void main(String[] args) {

        //I hab sogar an Algorithmus geschrieben Bitte

        //Brief initialisieren
        Brief a = new Brief("Manuel Sailer", "Liebesbrief");
        Brief a2 = new Brief("Martin Muglach", "Afklärung");
        Brief a3 = new Brief("Julian Egger", "Bestimmung");

        //Auf den Stack legen
        _stack.push(a);
        _stack.push(a2);
        _stack.push(a3);

        //Checken ob was auf Stack if
        if(_stack.size() > 0) {
            System.out.println("Es sind Briefe zu bearbeiten: ");


            //Jeden einzelnen Brief holen aus der Stack Liste foreach, for, while
            for(int i = 0; i < _stack.size(); i++){
                //Postler holt sich den obersten Brief
                _stack.get(i).BriefBearbeitenStarten();

                //Gibt aus welcher Brief das ist
                System.out.println(_stack.get(i).toString());

                //Bearbeitet diesen Biref 3 Sekunden lang
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //Ist mit dem Bearbeiten fertig
                _stack.get(i).BriefFertigBearbeitet();

                //Legt ihn auf den "Fertig Stapel"
                _fertigStack.push(_stack.get(i));

                //Gibt bekannt das dieser fertig ist
                System.out.println(_stack.get(i) + ". Ist fertig bearbeitet!");

                //Braucht 2 Sekunden um den nächsten Brief zu holen
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        }
    }
}
