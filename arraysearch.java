import java.util.*;
public class arraysearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,7,3,8};
        int key=7;
       int index =linearSearch(numbers, key);
       if(index==-1){
        System.out.println("No key found");
       } 
       else {
        System.out.println("key found at index " + index);
       }
    }
}
