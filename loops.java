import java.util.*;
public class loops {
    public static void main(String[] args) {
        // for (int i=0; i<=3; i++){
        //     System.out.println("ashish");
        // }

        // zero to 10 print

        // for(int i=0; i<=10; i++){
        //     System.out.print(i + " ");
        // }

        //using while loop

        // int i=0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        //using do-while loop

        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);

         // n natural number
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
        //  int sum=0;
        //  for(int i=0; i<=n; i++){
        //     sum=sum+i;

        //  }
        //  System.out.println(sum);
         
        for(int i=0; i<=n; i++){
            System.out.println(n*i);
        }
        
    }
}
