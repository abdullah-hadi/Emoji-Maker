import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author mahfuz
 */
public class EmojiPanel extends JPanel {
    private int choice;
    
    public EmojiPanel(int userChoice)
    {
        choice = userChoice;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x = getWidth()/2;
        int y = getHeight()/2;
        
        for (int i = 0; i < 10; i++) 
        {
            switch(choice)
            {
                
                
                case 0:
                    
                    super.paintComponent(g);
                
                    g.setColor(Color.yellow);
                    g.fillOval(10, 10, 200, 200);


                    g.setColor(Color.black);
                    g.fillOval(55, 65, 30, 30);
                    g.fillOval(135, 65, 30, 30);


                    g.fillOval(50, 110, 120, 60);


                    g.setColor(Color.yellow);
                    g.fillOval(50, 110, 120, 30);
                    g.fillOval(50, 120, 120, 30);
                    break;
                
                case 1:
                    
                    super.paintComponent(g);
                
                g.setColor(Color.yellow);
                g.fillOval(10, 10, 200, 200);
                
                
                g.setColor(Color.black);
                g.fillOval(55, 65, 30, 30);
                g.fillOval(135, 65, 30, 30);
             
                
                
                g.fillOval(50, 110, 120, 65);
                
                
                    
                    break;
                    
                case 2:
                    super.paintComponent(g);

                    g.setColor(Color.yellow);
                    g.fillOval(10, 10, 200, 200);


                    g.setColor(Color.black);
                    g.fillOval(55, 65, 30, 30);
                    g.fillOval(135, 65, 30, 30);

                    g.setColor(Color.red);

                    g.fillOval(50, 110, 120, 90);




                    g.setColor(Color.yellow);
                    g.fillOval(50, 110, 120, 30);
                    g.fillOval(50, 120, 120, 30);
                    break;
                
                case 3:
                    
                    super.paintComponent(g);
                
                    g.setColor(Color.yellow);
                    g.fillOval(10, 10, 200, 200);

                    g.setColor(Color.black);
                    g.fillOval(55, 65, 30, 30);
                    g.fillOval(135, 65, 30, 30);

                    g.fillOval(50, 110, 65, 120);

                    g.setColor(Color.yellow);
                    g.fillOval(50, 110, 120, 30);
                    g.fillOval(50, 120, 120, 30);
                    break;
                    
                case 4:
                    
                    super.paintComponent(g);
                
                    g.setColor(Color.yellow);
                    g.fillOval(10, 10, 200, 200);

                    g.setColor(Color.black);
                    g.fillOval(55, 65, 30, 30);
                    g.fillOval(135, 65, 30, 30);

                    g.setColor(Color.yellow);
                    g.fillOval(50, 110, 120, 30);
                    g.fillOval(50, 120, 120, 30);
                    break;
                    
                case 5:
                    
                    super.paintComponent(g);
                    
                    g.setColor(Color.red);
                    g.fillOval(10, 10, 200, 200);

                    g.setColor(Color.BLACK);
                    g.fillOval(55, 65, 30, 30);
                    g.fillOval(135, 65, 30, 30);

                    g.fillOval(50, 130, 120, 60);

                    g.setColor(Color.red); 
                    g.fillRect(50, 120, 120, 30);
                    g.fillOval(50, 40, 120, 40);
            }
            
        }
    }
    
}