import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.HashMap;

/**
 *
 * @author mahfuz
 */
public class EmojiTest {
    
    
    
    
    
    
    public static void main(String[] args) {
        

        Object[] possibleValues = { "Smile", "Wow", "Angry", "Shy", "Funny", "Funny 2.0"   };
        Object selectedValue = JOptionPane.showInputDialog(null,"Select your favourite Emoji", "Emoji Maker by Mahfuz",
                JOptionPane.INFORMATION_MESSAGE, null,possibleValues, possibleValues[0]);
        
        HashMap<String, Integer> valueToIndex = new HashMap<>();
        valueToIndex.put("Smile", 0);
        valueToIndex.put("Wow", 1);
        valueToIndex.put("Funny", 2);
        valueToIndex.put("Funny 2.0", 3);
        valueToIndex.put("Shy", 4);
        valueToIndex.put("Angry", 5);
    
        int index = valueToIndex.get((String) selectedValue);
        
        

        EmojiPanel panel = new EmojiPanel(index);
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setTitle("Emoji by Mahfuz");
        application.setSize(300, 300);
        application.setVisible(true);
    }
    
}

