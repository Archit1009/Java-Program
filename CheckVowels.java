import java.util.Scanner;

public class CheckVowels {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s;
   s=sc.nextLine();
   sc.close();
    System.out.println("Please enter your string");
    s.toUpperCase();
    char[] c= s.toCharArray();
    int l=c.length-1;
    char a='A';
    char b='E';
    char z='I'; 
    char d='O';
    char e='u';


for(int i=0;i<=l;i++){
if(a==c[i]||b==c[i]||z==c[i]||d==c[i]||e==c[i]){
    System.out.println("vowels are found on that string");
    System.exit(0);
}
    }
    System.out.println("not found");
}

}
