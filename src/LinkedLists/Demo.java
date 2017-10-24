package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        addInOrder(places, "D.C");
        addInOrder(places,"Mumbai");

        //printList(places);
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

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity){

        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison== 0){
                System.out.println(newCity+ " is included in destination");
                return false;
            }else  if(comparison >0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison< 0){

            }

        }
        stringListIterator.add(newCity);
        return true;
    }





}
