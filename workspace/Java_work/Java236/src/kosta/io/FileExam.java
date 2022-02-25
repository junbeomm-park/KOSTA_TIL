package kosta.io;

import java.io.File;

public class FileExam {
	
	public static void fileList(File file) {
		File list[] = file.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("** "+list[i].getName() + " Dir**");
				
				fileList(list[i]);
			}else {
				System.out.println(" - " + list[i].getName());
			}
		}
	}
	
	public static void show(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i = 0; i < files.length; i++) {
				System.out.println("파일 이름 : " + files[i].getName());
			}
			
		}else {
			System.out.println("이름 : " + file.getName());
		}
	
	}

	public static void main(String[] args) {
		String path = "C:\\KOSTA\\KOSTA_Study\\workspace\\Java_work\\Java236\\src\\kosta";
		File f = new File(path);
		
//		show(f);
		
//		show(new File("C:\\KOSTA\\KOSTA_Study\\workspace\\Java_work\\Java236\\src\\kosta"));
//		show(new File("C:\\KOSTA\\KOSTA_Study\\workspace\\Java_work\\Java236"));
		
		fileList(f);
	}
}
