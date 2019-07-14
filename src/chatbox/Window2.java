package chatbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Window2 extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	
	public static             JTextArea textArea2;
	public static             String username2;
	private                   JPanel contentPane;
	private static            JTextArea display2;
	private                   JButton send2;
	private                   JLabel label2;
	private                   JButton clear;
	
	public Window2() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 392, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		display2 = new JTextArea();
		display2.setBounds(10, 28, 350, 287);
		contentPane.add(display2);
		
		
		textArea2 = new JTextArea();
		textArea2.setBounds(10, 325, 255, 45);
		contentPane.add(textArea2);
		
		
		send2 = new JButton("Send");
		send2.setBounds(275, 333, 90, 25);
		contentPane.add(send2);
		send2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String s = textArea2.getText();
				if(s.equals(""))
				{
					return;
				}
				
			    display2.append(username2 + ":" + s + "\n");
			    Window1.SendText();
			    textArea2.setText("");
			}
		});
		
		
		
		label2 = new JLabel("Chat user for " + username2);
		label2.setBounds(10, 11, 255, 14);
		contentPane.add(label2);
		
		
		
		clear = new JButton("Clear");
		clear.setBounds(270, 2, 90, 23);
		contentPane.add(clear);
		clear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				display2.setText("");
			}
		});
			
		setVisible(true);
	}

	
	public static void SendText()
	{
		String s = Window1.textArea1.getText();
		if(s.equals(""))
		{
			return;
		}
	    display2.append(Window1.username1 + ":" + s + "\n");
	}
}