import java.util.*;
public class strings {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in );
        // String name=sc.nextLine();
        // System.out.println("Yor name is : "+name);
        
        //concatenation
        String firstname= "ashish";
        String lastname="gupta";
        String fullname=firstname+" " +lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        //charat
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
    
}
