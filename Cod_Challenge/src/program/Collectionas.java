package program;

import java.util.ArrayList;
import java.util.*;

public class Collectionas {
    public static void main(String[] args) {
//Write a program to sort list and find minimum using collections
        List<Integer> list= new ArrayList<Integer>();
        list.add(50);
        list.add(45);
        list.add(10);
        list.add(7);

        Collections.sort(list);
        System.out.println("Value of minimum element from the collection: "+Collections.min(list));
        System.out.println(list);


    }
}
