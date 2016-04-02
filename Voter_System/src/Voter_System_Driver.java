import javax.swing.JFrame;

public class Voter_System_Driver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Go Vote!");
		Voter_System demo = new Voter_System();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}