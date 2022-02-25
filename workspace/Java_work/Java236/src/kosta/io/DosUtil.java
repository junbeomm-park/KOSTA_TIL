package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DosUtil {
	
	public static void mkdir(File source, File name) {
		if(!name.exists()) {
			try {
				name.mkdir();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void ls(File source) {
		File list[] = source.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("** "+list[i].getName() + " Dir**");
				
//				ls(list[i]);
			}else {
				System.out.println(" - " + list[i].getName());
			}
		}
	}
}
