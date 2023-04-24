import java.util.Scanner;

public class rectangel {
    public static void main(String[] args) {
        int len, br, area, peri;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your lengths :");
        len = sc.nextInt();
        System.out.println("Enter your Breaths:");
        br = sc.nextInt();
        area = sc.nextInt();
        peri = 2*(len+br);
        System.out.println("Area of Ractangles:"+area);
        System.out.println("Parameters of Ractangles:"+peri);
    }
}
