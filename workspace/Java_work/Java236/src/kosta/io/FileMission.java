package kosta.io;

import java.io.File;
import java.io.FileReader;

public class FileMission {

	public static void main(String[] args) {
		//1. 바이트스트림을 이용하여 파일을 복사
//		String soure = "C:\\KOSTA\\array.PNG";
//		String dest = "C:\\KOSTA\\KOSTA_Study\\array.PNG";
		
//		File f = new File(soure);
//		File f2 = new File(dest);
//		
//		FileUtil fu = new FileUtil();
		
//		FileUtil.copyFile(new File(soure), new File(dest));
//		System.out.println("복사완료");
		
		
		//2. 디렉토리 전체 복사
		String source = "C:\\for과제";
		String dest = "C:\\test\\copy";
		
		FileUtil.copyDirectory(new File(source), new File(dest));
		
	}
}
