package csw;

import java.time.LocalDate;
import java.util.Scanner;

class A6qno9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String date=sc.next();
        LocalDate ld=LocalDate.parse(date);
        System.out.println(ld.isLeapYear());
    }

}