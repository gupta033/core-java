import java.util.*;

import java.util.*;
public class sumevenodd{
    public static void main(String[] args) {
        int n,sum=0, pro=1, digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nmber");
        n=sc.nextInt();
        while(n>0){
            digit=n%10;
            if(digit%2==0){
                sum=sum+digit;

            }
            else{
                pro=pro*digit;
                n=n%10;
            }
            System.out.println("SUM="+sum +"pro="+pro);
        }
        
    }
}