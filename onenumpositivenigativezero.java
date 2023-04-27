import java.util.Scanner;

public class onenumpositivenigativezero {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        a=sc.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else if(a<0){
            System.out.println("negative number");
        }
        else {
            System.out.println("zero number");
        }
    }
}
