package chatbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Window1 extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	
	public static             JTextArea textArea1;
	public static             String username1;
	private                   JPanel contentPane;
	private static            JTextArea display1;
	private                   JButton send1;
	private                   JLabel label1;
	private                   JButton clear;
	
	public Window1() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 392, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		display1 = new JTextArea();
		display1.setBounds(10, 28, 350, 287);
		contentPane.add(display1);
		
		
		textArea1 = new JTextArea();
		textArea1.setBounds(10, 325, 255, 45);
		contentPane.add(textArea1);
		
		
		send1 = new JButton("Send");
		send1.setBounds(275, 333, 90, 25);
		contentPane.add(send1);
		send1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String s = textArea1.getText();
				if(s.equals(""))
				{
					return;
				}
				
			    display1.append(username1 + ":" + s + "\n");
			    Window2.SendText();
			    textArea1.setText("");
			}
		});
		
		
		
		label1 = new JLabel("Chat user for " + username1);
		label1.setBounds(10, 11, 255, 14);
		contentPane.add(label1);
		
		
		
		clear = new JButton("Clear");
		clear.setBounds(270, 2, 90, 23);
		contentPane.add(clear);
		clear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				display1.setText("");
			}
		});
			
		setVisible(true);
	}

	
	public static void SendText()
	{
		String s = Window2.textArea2.getText();
		if(s.equals(""))
		{
			return;
		}
	    display1.append(Window2.username2 + ":" + s + "\n");
	}
}