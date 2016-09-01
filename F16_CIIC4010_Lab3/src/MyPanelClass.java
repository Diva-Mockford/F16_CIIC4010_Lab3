import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        //Draw inner border
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+5, y1+5, width-(x1+10), height-(y1+10));
//                        
//                        
//                        //Line from top left to bottom right
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Line from top right to bottom left
//                        g.setColor(Color.PINK);
//                        g.drawLine(x1 + width, y1, x1, y1+ height);
//                        
//                        //Oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(getWidth()/2 -55/2, getHeight()/2 -55/2, 55, 55);
                        
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
//                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                        
                        
                        
                     // Puerto Rican Flag
                        
                        
                        //Rectangles
                               g.setColor(Color.RED);
                               g.fillRect(x1, y1 ,x2 + 1,(int)( y2*.2));
                              
                               g.setColor(Color.WHITE);
                               g.fillRect(x1, y1 + (int)( y2*.2) , x2 + 1, (int)( y2*.4));
                              
                               g.setColor(Color.RED);
                               g.fillRect(x1, (int)( y2*.4),x2 + 1, (int)( y2*.6));
                              
                               g.setColor(Color.WHITE);
                               g.fillRect(x1, (int)( y2*.6),x2 + 1, (int)( y2*.8));
                
                               g.setColor(Color.RED);
                               g.fillRect(x1, (int)( y2*.8) , x2 + 1, y2);
                              
                               //Triangle
                               Polygon p = new Polygon();
                               p.addPoint(x1, y1 );
                               p.addPoint(x1 + x2/2, y1 + y2/2);
                               p.addPoint(x1, y2);
                               g.setColor(Color.BLUE);
                               g.fillPolygon(p);
                
                              
                              
                               //Star
                              
                               Polygon tr = new Polygon();
                               tr.addPoint(x1 + (int)(x2*.1), y1 + (int)(y2*.47));
                               tr.addPoint(x1 + (int)(x2*.175), y1 +(int)(y2*.47));
                               tr.addPoint(x1 + (int)(x2*.2), y1 + (int)(y2*.395));
                               tr.addPoint(x1 + (int)(x2*.225), y1 + (int)(y2*.470));
                               tr.addPoint(x1 + (int)(x2*.3), y1 + (int)(y2*.470));
                               tr.addPoint(x1 + (int)(x2*.25), y1 + (int)(y2*.520));
                               tr.addPoint(x1 + (int)(x2*.275), y1 + (int)(y2*.6));
                               tr.addPoint(x1 + (int)(x2*.2), y1 + (int)(y2*.55));
                               tr.addPoint(x1 + (int)(x2*.125), y1 + (int)(y2*.6));
                               tr.addPoint(x1 + (int)(x2*.15), y1 + (int)(y2*.520));
                               g.setColor(Color.WHITE);
     
                               g.fillPolygon(tr);

                        

            }
}