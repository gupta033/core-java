import java.util.Scanner;

public class twoNumMulti {
    public static void main(String[] args) {
        int a,b,c;
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter scond number ");
        b=sc.nextInt();
        c=a*b;
        System.out.println("Two number sum :" +c);
    }
}
