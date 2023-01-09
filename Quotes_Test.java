import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Quotes_Test {
    
    
    public static void main(String[] args){
        
        Quotes holdingQuotes = new Quotes();
        holdingQuotes.creatArrayList();
        String hold = holdingQuotes.getQuote(0);



        JFrame jframe = new JFrame("Step2");
        JLabel jlabel = new JLabel(hold);
        jframe.setVisible(true);

        jlabel.setVisible(true);
    }
    
}
