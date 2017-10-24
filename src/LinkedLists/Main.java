package LinkedLists;

import java.util.ArrayList;

public class Main {

public  static void main(String args[]){
    Customer c= new Customer("sou", 12.2);

    Customer anotherCustomer;
    anotherCustomer = c;
    anotherCustomer.setBalances(12.88);

    System.out.println("Balamce of customer" + c.getName()+" is "+ c.getBalances());

    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(3);
    intList.add(4);

    for(int i=0;i<intList.size(); i++){
        System.out.println(i + " "+intList.get(i));
    }

    intList.add(1,2);

    for(int i=0;i<intList.size(); i++){
        System.out.println(i + " "+intList.get(i));
    }



}

}
