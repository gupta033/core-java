import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        System.out.println("Enter the first number");
        b=sc.nextInt();
        System.out.println("Enter the scund number");
        System.out.println("1=>add 2=>sub 3=>mul 4=>div , Enter the number");
        ch=sc.nextInt();
        switch(ch){
            case 1: 
            System.out.println("Addition :"+(a+b));
            break;
            case 2 :
            System.out.println("Substraction :"+(a-b));
            break;
            case 3 :
            System.out.println("Multip:"+(a*b));
            break;
            case 4 :
            System.out.println("Divistin ="+(a/b));
            break;
            default :
            System.out.println("Inviled number");

        }
    }
}
