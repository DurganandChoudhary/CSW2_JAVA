public class ThirdLastConsonant {
    public static boolean isConsonant(char c) {
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return consonants.indexOf(c) != -1;
    }

    public static char thirdLastConsonant(String str) {
        int consonantCount = 0;
        char thirdLastConsonant = '\0';

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (isConsonant(c)) {
                consonantCount++;
            }

            if (consonantCount == 3) {
                thirdLastConsonant = c;
                break;
            }
        }

        return thirdLastConsonant;
    }

    public static void main(String[] args) {
        String strExample = "Hello, World!";
        char result = thirdLastConsonant(strExample);
        System.out.println(result); // Output will be 'r'
    }
}
