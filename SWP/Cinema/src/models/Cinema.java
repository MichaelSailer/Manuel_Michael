package models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cinema {



    private static Queue<List<Person>> _queue = new LinkedList<>();
    private static List<Person> _cinemaVisitor = new ArrayList<>();
    private static List<Person> _person = new ArrayList<>();

    public static void add(Person a){_cinemaVisitor.add(a);}

    public static void main(String[] args) {

        Person a = new Person("Manuel", "Sailer", 16,false,true);
        Person a2 = new Person("Martin", "Muglach", 18, false,true);
        Person a3 = new Person("Julian", "Egger", 14, false,false);

        _person.add(a);
        _person.add(a2);
        _person.add(a3);

        for(int i =0;i<= _person.size(); i++){
            if(_person.get(i).getKinoBesuch() == true){
                _cinemaVisitor.add(_person.get(i));
            }
        }

        _queue.add(_cinemaVisitor);

        //Alle die in der Schlange sind bekommen ein Ticket
        for(int i = 0; i <= _queue.size(); i++){
            _cinemaVisitor.get(i).setTicket(true);
        }

        for(int i = 0; i < _person.size(); i++){
            if(_person.get(i).getTicket() == true){
                System.out.println("Sie dürfen in den Kinosaal eintreten: ");
            }else{
                System.out.println("Sie haben kein Ticket bitte gehen Sie zur Kassa");
            }
        }


    }
}
