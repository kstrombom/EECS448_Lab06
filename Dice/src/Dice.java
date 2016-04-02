import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class Dice 
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public Dice()
	{
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(5);//3 cols, not 20 chars
		label = new JLabel("");
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//Get string input
				String input = text.getText();
				
				try
				{
					Integer.parseInt(input);
				}
				catch(NumberFormatException a)
				{
					label.setText("Must be an integer");
					return;
				}
				

				int diceSize = Integer.parseInt(input);//convert String to int

				if(diceSize<1 || diceSize>100)
				{
					label.setText("Must be 1 to 100");
				}
				else
				{
					Random rn = new Random();
					int answer = rn.nextInt(diceSize)+1;
					String newText = String.valueOf(answer);
					label.setText(newText);
				}
				
			
			}
		};
		
		return listener;
	}	
}