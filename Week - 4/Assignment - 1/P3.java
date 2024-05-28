import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) 
        {
            reversed += words[i];
            if (i != 0) 
                reversed += " ";
        }
        System.out.println("Reversed sentence:");
        System.out.println(reversed);
    }
}
