import java.util.Scanner;

public class P2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = scanner.nextLine();

        System.out.print("Enter second string: ");
        String w = scanner.nextLine();

        String ns = "";
        int min = Math.min(s.length(), w.length());

        for (int i = 0; i < min; i++) {
            
                ns += s.charAt(i);

                ns += w.charAt(i);
        }
        if(s.length()>w.length())
            ns+=s.substring(min);
        else
            ns+=w.substring(min);
        System.out.println("Combined string: "+ns);
    }
}

