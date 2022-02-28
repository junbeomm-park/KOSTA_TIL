package kosta.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1",9000);
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String message = "Hello Server!!!!";
			out.write(message.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println("서버에서 보낸 메시지 : "+new String(arr));
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}
