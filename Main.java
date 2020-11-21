package structure.list;

import structure.list.impl.SingleLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GBList list = new SingleLinkedList();
        list.add("BMW");
        list.add("TOYOTA");
        list.add("GAZ");
        list.add("TOYOTA");
        list.add("VOLVO");
        list.add("KIA");
        list.add("SKODA");

        GBIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("Size before remove " + list.size());

        boolean isToyotaRemoved = list.remove("BMW");
        System.out.println("Is car removed? " + isToyotaRemoved);
        System.out.println("Size after remove " + list.size());

        System.out.println(list);


        String indexValue1 = list.get(2);
        String indexValue2 = list.get(6);
        System.out.println(indexValue1);
        System.out.println(indexValue2);

    }
}
