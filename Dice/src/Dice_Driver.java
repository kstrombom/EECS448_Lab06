import javax.swing.JFrame;


public class Dice_Driver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Dice");
		Dice demo = new Dice();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}
