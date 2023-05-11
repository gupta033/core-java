import java.util.*;
public class stringBulder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ashish");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
       // set chraAt
       sb.setCharAt(5, 'g');
       System.out.println(sb);
       // insert chraAt
       sb.insert(5, 'h');
       System.out.println(sb);
       // delete chraAt
       sb.deleteCharAt(5);
       System.out.println(sb);
       // replace chraAt
       //sb.replace(5, 6, 'i');
       System.out.println(sb);
       //reverse chraAt
       sb.reverse();
       System.out.println(sb);
    }
}
