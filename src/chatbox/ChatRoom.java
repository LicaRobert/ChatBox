package chatbox;

public class ChatRoom 
{
	static Window1 window1;
	static Window2 window2;
	static Server server;

	public ChatRoom()
	{
		server = new Server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
	}
	
	
	public static void CreateRoom()
	{
		window1 = new Window1();
		window2 = new Window2();
		window1.setLocation(500, 200);
		window2.setLocation(200, 200);
		window1.setVisible(true);
		window2.setVisible(true);
		server.setVisible(false);
	}
}