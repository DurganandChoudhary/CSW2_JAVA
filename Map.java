package csw;

import java.util.*;
class MapExample2 {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> m1 = new LinkedHashMap<>();
        m1.put(100, "Amit");
        m1.put(1088, "Vijay");
        m1.put(101, "Rahul");


        /*Set s1=m1.entrySet();//Converting to Set so that we can traverse
        Iterator itr=s1.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry e1=(Map.Entry)itr.next();
            System.out.println(e1.getKey()+" "+e1.getValue());

         */
        for(Map.Entry m:m1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

}
