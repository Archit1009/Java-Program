import java.util.Scanner;
import java.util.*;
public class CheckOddNumber {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number to check wheather number is odd or not");
            a = sc.nextInt();
        }
        if (a % 2 != 0) {
            System.out.println("This number is odd number ");
        } else {
            System.out.println("This number is not odd");
        }

    }

}
