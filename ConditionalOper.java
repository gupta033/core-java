import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class ConditionalOper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();
        // if (age>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("not Adult");
        // }




        // System.out.println("Enter your numbe");
        // int x=sc.nextInt();
        // if(x%2==0){
        //     System.out.println("even");

        // }
        // else{
        //     System.out.println("odd");
        // }

        //two number greater
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if(a==b){
        //     System.out.println("equal");
        // }
        // else if(a>b){
        //     System.out.println("a is grater");
        // }
        // else{
        //     System.out.println("a is leaser");
        // }



        //switch using
        int button=sc.nextInt();
        switch(button){
            case 1 : System.out.println("hello");
                      break;
            case 2:  System.out.println("namaste");
                     break;
            case 3 : System.out.println("banjur");
                      break;
            default : System.out.println("inviled number");
        }
    }
}
