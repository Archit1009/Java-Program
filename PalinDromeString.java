import java.util.Scanner;
public class PalinDromeString {
    public static void main(String[] args){
    String str;
    
    int length;
 int count=0;
    System.out.println("Enter string please");
    Scanner sc=new Scanner(System.in);
    str=sc.next();
    char [] c=str.toCharArray();
    length=str.length();

    for(int i=0;i<=length/2;i++){
        if(c[0]!=c[length-i-1]){
            break;
        }
        count++;
         }
        

     if(count==length/2){
        System.out.println("Given String is palindrome");
     }
     else{
        System.out.println("Given String is not palindrome");
     }

    }
}

    

