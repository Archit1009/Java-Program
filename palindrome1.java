import java.util.Scanner;

public class palindrome1 {

    public static void main(String args[]) {
        String a, b = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string please");
        a = sc.next();

        char[] ch = a.toCharArray();
        int l = ch.length - 1;
        for (int i = l; i >= 0; i--) {
            b = b + ch[i];

        }

        if (a.equals(b)) {
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("given String is not palindrome");
        }
    }

}
