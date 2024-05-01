import java.util.Scanner;

public class StringReverse{
    public static void main(String args[]){
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string please");
        a=sc.next();
        StringBuilder b=new StringBuilder();
       
        char[] ch=a.toCharArray();
        int l=ch.length-1;
for (int i=l;i>=0;i--){
    b.append(ch[i]);
    b.toString();

}
System.out.println(b);
    }
}