package csw;

import java.util.*;
class ArrayListExample1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object

        list.remove("Apple");

        System.out.println(list);
    }
}