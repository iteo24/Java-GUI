 import java.util.ArrayList;
 
 public class Step1 {
    
    public static ArrayList<String> quotes = new ArrayList<String>();

    static String hold_quote = "This is quote ";
    static int hold_num = 1;

    public static void addtoArrayList(){
        while (hold_num < 11){
            quotes.add(hold_quote + hold_num);
            System.out.println(quotes.get(hold_num - 1));
            hold_num++;
        }
    }

    public static void main(String[] args){
        addtoArrayList();
    }
 }