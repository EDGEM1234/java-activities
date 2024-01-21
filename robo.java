package Robot;
import java.awt.*;
import javax.swing.JFrame;
public class robo {
	public  void paint(Graphics g) {
		g.drawString("Launch",40,40);
		setBackground(Color.BLUE);
		g.fillRect(100, 40,200, 100);
		g.fillRect(101, 40,200, 100);
		g.fillRect(102, 40,200, 100);
		g.fillRect(103, 40,200, 100);
		g.fillRect(104, 40,200, 100);
		g.fillRect(105, 40,200, 100);
		g.fillRect(106, 40,200, 100);
		g.fillRect(107, 40,200, 100);
		
		g.setColor(getBackground());
		g.fillOval(230,  65,  40,  40);
		g.fillOval(231,  65,  40,  40);
		g.fillOval(232,  65,  40,  40);
		
		setForeground(Color.WHITE);
      }
      	public static void main(String[] args){
      		AlteradoGraphArt m=new AlteradoGraphArt();
            JFrame f=new JFrame();
            f.add(m);
            f.setSize(500,500);
            //f.setLayout(null);
            f.setVisible(true); 
      }
}

