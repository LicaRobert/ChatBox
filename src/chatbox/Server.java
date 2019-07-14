package chatbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Server extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;
	JLabel lbl1;
	JLabel lbl2;
	JButton joinBtn;
	
	
	public Server()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		name1 = new JTextField();
		name1.setBounds(104, 50, 237, 31);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				CreateRoom();
			}
		});
			
		
		name2 = new JTextField();
		name2.setBounds(104, 50, 237, 31);
		contentPane.add(name2);
		name2.setColumns(10);
		
		name2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				CreateRoom();
			}
		});
		
		
		lbl1 = new JLabel("1st Username");
		lbl1.setBounds(187, 109, 104, 14);
		contentPane.add(lbl1);
		
		
		lbl2 = new JLabel("2st Username");
		lbl2.setBounds(187, 109, 104, 14);
		contentPane.add(lbl2);
		
		
		joinBtn = new JButton("Join Chat");
		joinBtn.setBounds(152, 203, 128, 47);
		contentPane.add(joinBtn);
		
		joinBtn.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				CreateRoom();
			}
		});
		
	}
	
	public void CreateRoom()
	{
		String p1,p2;
		
		p1 = name1.getText();
		p2= name2.getText();
		
		if(p1.equals("") || p2.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Please enter a valid username!");
			return;
		}
		
		Window1.username1 = name1.getText();
		Window2.username2 = name2.getText();
		
		ChatRoom.CreateRoom();
	}
}
