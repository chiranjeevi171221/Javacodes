import java.util.Scanner;

public class Charectercount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        countLetters(input);
    }
    public static void countLetters(String s) {
        int[] f = new int[26];
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                f[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (f[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + " occurs "+ f[i] + " times in the string");
            }
        }
    }
}
