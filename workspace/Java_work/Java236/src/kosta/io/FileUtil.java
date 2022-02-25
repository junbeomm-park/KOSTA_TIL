package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class FileUtil {
	
	//복사 대상폴더 Copy 구현(새로운 디렉토리 생성 후 그 안에 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {
		if(source.isDirectory()) {
			dest.mkdir();
			
			File[] fileList = source.listFiles();
			for(int i = 0; i < fileList.length; i++) {
				File sourceFile = fileList[i];
				if(sourceFile.isDirectory()) {
					File s_destFile = new File(dest, sourceFile.getName());
					copyDirectory(sourceFile, s_destFile);  
				}else {
					File destFile = new File(dest, sourceFile.getName());
					copyFile(sourceFile, destFile);
				}
			}
		}else {
			System.out.println("디렉토리 아닙니다");
		}
	}
	
	//바이트값을 가진 1개의 파일을 복사하는 기능
	public static void copyFile(File source, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte[] bytes = new byte[1024];
		int data = 0;
		
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			
			
			while((data = fis.read(bytes)) != -1) {
				
				fos.write(bytes);
				Arrays.fill(bytes,(byte)0);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
