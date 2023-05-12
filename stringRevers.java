public class stringRevers {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ashish");
        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, backChar);
        }
        System.out.println(sb);
    }
    
}
