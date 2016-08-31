import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Diva L. Mockford ");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


		//myFrame.setLocation(200, 200);
		myFrame.setSize(200, 200);
		//Found this method in the Java API that centers your screen depending on your main monitor.
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
	}
}