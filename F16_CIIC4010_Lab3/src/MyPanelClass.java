import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GREEN);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        //Draw inner border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1+5, y1+5, width-(x1+10), height-(y1+10));
                        
                        
                        //Line from top left to bottom right
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        //Line from top right to bottom left
                        g.setColor(Color.PINK);
                        g.drawLine(x1 + width, y1, x1, y1+ height);
                        
                        //Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(getWidth()/2 -55/2, getHeight()/2 -55/2, 55, 55);

            }
}