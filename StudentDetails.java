package CommandLineArg;

public class StudentDetails 
{
    public static void main(String[] args) {
        
        String sname = args[0];
        int sroll = Integer.parseInt(args[1]);
        double smark = Double.parseDouble(args[2]);

        System.out.println("Student name is "+sname);
        System.out.println("Student roll is "+sroll);
        System.out.println("Student mark is "+smark);
    }
    
}
