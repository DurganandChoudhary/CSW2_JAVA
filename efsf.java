package csw;

class SubStringDemo {
    public static void main(String[] av) {

        String a = "Java is great.";
        System.out.println(a);
        String b = a.substring(5);
        System.out.println(b);
        String c = a.substring(5,9);
        System.out.println(c);
        System.out.println(a.length());
        String d = a.substring(5,a.length());
        System.out.println(d);
    }
}