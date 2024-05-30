import java.util.Scanner;

public class P1
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String s = scanner.nextLine();

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        String ns = "";
        for (char c : s.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char decodedChar = (char) (((c - base + shift ) % 26) + base);
                ns=ns+decodedChar;
            } 
            else 
                ns=ns+c;
        }
        System.out.println("Decoded Sentence: " + ns.toString());
        scanner.close();
    }
}
