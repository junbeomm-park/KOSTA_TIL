package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerialExam {
	Member m;
	
	//직렬화
	public void write() {
		m = new Member("홍길동", 20);
		ObjectOutput oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
			}
		}
	}
	
	//역직렬화
	public void read() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (Exception e2) {
			}
		}
	}

	public static void main(String[] args) {
		SerialExam se = new SerialExam();
		
		se.write();
		se.m = null;
		
		se.read();
		System.out.println(se.m);
	}

}
