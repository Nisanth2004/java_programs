import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word with odd length: ");
        String word = scanner.nextLine();

        int length = word.length();
        int middleIndex = length / 2;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i + j == length - 1) {
                    System.out.print(word.charAt(middleIndex));
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}