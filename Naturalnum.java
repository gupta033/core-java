import java.util.Scanner;

public class Naturalnum {
    public static void main(String[] args) {
        int n,i,add=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n ");
        n=sc.nextInt();
        i=1;
        while(i<=n){
            add=add+i;
            i=i++;

        }
        System.out.println("Additon="+add);

    }
}
