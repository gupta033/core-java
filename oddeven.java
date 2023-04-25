import java.util.Scanner;

import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
