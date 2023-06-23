import java.util.Arrays;

public class ChotaBhim {
    public static int ChotaBhim(int cups[], int size) {
        int time = 60;
        Arrays.sort(cups);
        int total = 0;
        int index, temp;
        while (time > 0) {
            total += cups[0];
            cups[0] = (int) Math.ceil(cups[0] / 2.0);
            index = 0;
            temp = cups[0];
            while (index < size - 1 && temp < cups[index + 1]) {
                cups[index] = cups[index + 1];
                index += 1;
            }
            cups[index] = temp;
            time -= 1;
        }
        System.out.println("Total %d " + total);
        return total;
    }

    public static void main(String[] args) {
        int cups[] = { 2, 1, 7, 4, 2 };
        ChotaBhim(cups, cups.length);
    }
}