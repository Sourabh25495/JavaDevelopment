package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        places.add("Mumbai");
        places.add("pune");

        places.add("delhi");

        places.add("NYC");
        places.add("Niagara");
        places.add("Goa");
        places.add("Lafayette");

        printList(places);
        places.add(1,"Moscow");
        printList(places);

    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting "+ i.next() );
        }
        System.out.println("___________________________");

    }

}
