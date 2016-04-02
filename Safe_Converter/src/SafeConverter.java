import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class SafeConverter 
{
	private JPanel panel;
	private JButton FCbutton,FKbutton,CKbutton,CFbutton,KFbutton,KCbutton;
	private JTextField FCtext,FKtext,CKtext,CFtext,KFtext,KCtext;
	private JLabel FClabel,FKlabel,CKlabel,CFlabel,KFlabel,KClabel;
	
	public SafeConverter()
	{
		panel = new JPanel(new GridLayout(6,1));
		//F to C
		FCbutton = new JButton("Convert");
		FCtext = new JTextField(3);//3 cols, not 20 chars
		FClabel = new JLabel("Enter a temperature from F to C");
		//F to K
		FKbutton = new JButton("Convert");
		FKtext = new JTextField(3);//3 cols, not 20 chars
		FKlabel = new JLabel("Enter a temperature from F to K");
		//C to K
		CKbutton = new JButton("Convert");
		CKtext = new JTextField(3);//3 cols, not 20 chars
		CKlabel = new JLabel("Enter a temperature from C to K");
		//C to F
		CFbutton = new JButton("Convert");
		CFtext = new JTextField(3);//3 cols, not 20 chars
		CFlabel = new JLabel("Enter a temperature from C to F");
		//K to F
		KFbutton = new JButton("Convert");
		KFtext = new JTextField(3);//3 cols, not 20 chars
		KFlabel = new JLabel("Enter a temperature from K to F");
		//K to C
		KCbutton = new JButton("Convert");
		KCtext = new JTextField(3);//3 cols, not 20 chars
		KClabel = new JLabel("Enter a temperature from K to C");
		
		
		//Load the listener
		FCbutton.addActionListener(FCListener());
		FKbutton.addActionListener(FKListener());
		CKbutton.addActionListener(CKListener());
		CFbutton.addActionListener(CFListener());
		KFbutton.addActionListener(KFListener());
		KCbutton.addActionListener(KCListener());
		
		//load the panel
		panel.add(FCtext);
		panel.add(FCbutton);
		panel.add(FClabel);
		panel.add(FKtext);
		panel.add(FKbutton);
		panel.add(FKlabel);
		panel.add(CKtext);
		panel.add(CKbutton);
		panel.add(CKlabel);
		panel.add(CFtext);
		panel.add(CFbutton);
		panel.add(CFlabel);
		panel.add(KFtext);
		panel.add(KFbutton);
		panel.add(KFlabel);
		panel.add(KCtext);
		panel.add(KCbutton);
		panel.add(KClabel);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener FCListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = FCtext.getText();
				
				if(input=="")
				{
					FClabel.setText("Enter a value");
				}
				
				try
				{
					Double.parseDouble(input);
				}
				catch(NumberFormatException a)
				{
					FClabel.setText("Must enter a double");
					return;
				}
				
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				FClabel.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
	private ActionListener FKListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = FKtext.getText();
				
				if(input=="")
				{
					FKlabel.setText("Enter a value");
				}
				
				try
				{
					Double.parseDouble(input);
				}
				catch(NumberFormatException a)
				{
					FKlabel.setText("Must enter a double");
					return;
				}
				
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInK = (tempInF+459.67)*(5.0/9.0); //convert F to K
				String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
											       //only display 2 places past decimal
				FKlabel.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
	private ActionListener CKListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = CKtext.getText();
				
				if(input=="")
				{
					CKlabel.setText("Enter a value");
				}
				
				try
				{
					Double.parseDouble(input);
				}
				catch(NumberFormatException a)
				{
					CKlabel.setText("Must enter a double");
					return;
				}
				
				double tempInC = Double.parseDouble(input);//convert String to double
				double tempInK = (tempInC+273.15); //convert C to K
				String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
											       //only display 2 places past decimal
				CKlabel.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
	private ActionListener CFListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = CFtext.getText();
				
				if(input=="")
				{
					CFlabel.setText("Enter a value");
				}
				
				try
				{
					Double.parseDouble(input);
				}
				catch(NumberFormatException a)
				{
					CFlabel.setText("Must enter a double");
					return;
				}
				
				double tempInC = Double.parseDouble(input);//convert String to double
				double tempInF = (tempInC*9.0/5.0)+32; //convert C to F
				String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
											       //only display 2 places past decimal
				CFlabel.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
	private ActionListener KFListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = KFtext.getText();
				
				if(input=="")
				{
					KFlabel.setText("Enter a value");
				}
				
				try
				{
					Double.parseDouble(input);
				}
				catch(NumberFormatException a)
				{
					KFlabel.setText("Must enter a double");
					return;
				}
				
				double tempInK = Double.parseDouble(input);//convert String to double
				double tempInF = (tempInK*9.0/5.0)-459.67; //convert K to F
				String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
											       //only display 2 places past decimal
				KFlabel.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
	private ActionListener KCListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = FCtext.getText();
				
				if(input=="")
				{
					KClabel.setText("Enter a value");
				}
				
				try
				{
					Double.parseDouble(input);
				}
				catch(NumberFormatException a)
				{
					KClabel.setText("Must enter a double");
					return;
				}
				
				double tempInK = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInK-273.15); //convert K to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				KClabel.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}