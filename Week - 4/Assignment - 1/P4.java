import java.util.Scanner;

public class P4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();

        String[] words = s.split(" ");

        System.out.println("Even length words:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
