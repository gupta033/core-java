import java.util.*;
public class UseInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        // System.out.println("Enter the number");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println(sum);
        String name =sc.nextLine();
        //name="ashish kumar gupta";
        System.out.println(name);
        //lenght nikalna
        System.out.println(name.length());
        //lowr mey convert karna
        System.out.println(name.toLowerCase());
        //upper mey convert karna
        System.out.println(name.toUpperCase());
    }

}
