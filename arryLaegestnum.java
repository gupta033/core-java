import java.util.*;
public class arryLaegestnum {
    public static int getLargest(int numbers[]){
       int largest = Integer.MIN_VALUE;

       for (int i = 0; i < numbers.length; i++){
        if(largest<numbers[i]){
            largest=numbers[i];
        }
       }
       return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,9,4,5,6,7};
        System.out.println("largest values is :"+getLargest(numbers));
        
    }
}
