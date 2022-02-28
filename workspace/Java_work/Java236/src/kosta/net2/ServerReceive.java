package kosta.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive extends Thread {
	Socket socket;
	
	public ServerReceive() {}	

	public ServerReceive(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				
				System.out.println("클라이언트가 보낸 메시지 : " + str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}








