import javax.swing.*;

import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;


public class Voter_System 
{
	private JPanel panel;
	private JButton button;
	private JTextField LastName;
	private JTextField FirstName;
	private JLabel LastNameLabel, FirstNameLabel;
	private JRadioButton Candidate1, Candidate2, Candidate3, Candidate4;
	private ButtonGroup group;
	private JLabel label;
	
	public Voter_System()
	{
		panel = new JPanel();
		button = new JButton("Vote");
		LastNameLabel = new JLabel("Last Name: ");
		FirstNameLabel = new JLabel("First Name: ");
		label = new JLabel("");
		LastName = new JTextField(20);
		FirstName = new JTextField(20);
		Candidate1 =  new JRadioButton("Hilary Clinton");
		Candidate1.setActionCommand("Hilary Clinton");
		Candidate2 =  new JRadioButton("Bernie Sanders");
		Candidate2.setActionCommand("Bernie Sanders");
		Candidate3 =  new JRadioButton("Ted Cruz");
		Candidate3.setActionCommand("Ted Cruz");
		Candidate4 =  new JRadioButton("Donald Drumpf");
		Candidate4.setActionCommand("Donald Drumpf");
		group = new ButtonGroup();
		
		group.add(Candidate1);
		group.add(Candidate2);
		group.add(Candidate3);
		group.add(Candidate4);
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(FirstNameLabel);
		panel.add(FirstName);
		panel.add(LastNameLabel);
		panel.add(LastName);
		panel.add(Candidate1);
		panel.add(Candidate2);
		panel.add(Candidate3);
		panel.add(Candidate4);
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
				String LastName2 = LastName.getText();
				String FirstName2 = FirstName.getText();
				String filename = LastName2 + "_" + FirstName2 + "_ballot.txt";
				String candidate = group.getSelection().getActionCommand();

				
				File file = new File(filename);
				 String ballot = "First name: " + FirstName2 + "   |   Last name: "+LastName2+"   |   Candidate: "+candidate;
				
				try
				{
					if(file.exists())
					{
						label.setText("Already voted");
					}
					else
					{
						file.createNewFile();
						OutputStream ostream = new FileOutputStream(filename);
						ostream.write(ballot.getBytes());
						ostream.close();
					}
				}
				catch(IOException a)
				{
					
					System.out.print(a.getMessage());
					
				}		    
			   
			    
			   
			}
		};
		
		return listener;
	}	
}