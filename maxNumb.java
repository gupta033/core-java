import java.util.Scanner;

public class maxNumb {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("enter b number ");
        b=sc.nextInt();
        System.out.println("enter c number ");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("max number is :" +a);
        }
            else if(b>a && b>c){
                System.out.println("max number is"+b);

            }
            else{
                System.out.println("max numbeer is:" +c);
            }
        }
    }

