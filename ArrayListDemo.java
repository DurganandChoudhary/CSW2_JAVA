package csw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(23);
        al.add(34);
        al.add(80);
        al.add(67);
        System.out.println(al);
        Collections.sort(al);
        Collections.reverse(al);
        System.out.println(al);



        LinkedList<Integer> ll = new LinkedList();
        ll.addFirst(45);
        ll.addFirst(78);
        ll.addFirst(90);
        ll.addLast(34);
        ll.addLast(21);
        System.out.println(ll);
        ll.add(3, 61);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.addAll(al);
        System.out.println(ll);



    }

}
