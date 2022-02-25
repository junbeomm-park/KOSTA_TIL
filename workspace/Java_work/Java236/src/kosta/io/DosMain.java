package kosta.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DosMain {
   
   public void listFile(String str) {
      File file = new File(str);

      File arr[] = file.listFiles();
       for (int cnt = 0; cnt < arr.length; cnt++) {
           String name = arr[cnt].getName();    
           if (arr[cnt].isFile())
               System.out.printf("%-25s %7d ", name, arr[cnt].length());
           else
               System.out.printf("%-25s   <DIR> ", name);
           long time = arr[cnt].lastModified();     
           GregorianCalendar calendar = new GregorianCalendar();
           calendar.setTimeInMillis(time);
           System.out.printf("%1$tF %1$tT \n", calendar);
       }
      
   }
      
   
   public void fileMkdir(String str, String arr) {
      File file = new File(str,arr);
      file.mkdir();
   }
   
   public void fileCopy(String str, String arr) {
      File source = new File(arr);
      File dest = new File(str);
      copyDirectory(source, dest);
   }
   
   public static void copyFile(File source, File dest) {
      FileInputStream in = null;
      FileOutputStream out = null;
      try {
         dest.createNewFile();
         in = new FileInputStream(source);
         out = new FileOutputStream(dest);
         byte c[] = new byte[1024];
         
         int date;
         while((date = in.read()) !=-1) {
            out.write(date);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }finally {
         try {
            out.flush();
            if (in != null) in.close();
            if (out != null) out.close();
         } catch (Exception e2) {}
      }
   }
   
   //복사 대상폴더 Copy구현(새로운 디렉토리 생성 후 그 안에 모든 파일을 복사)
   public static void copyDirectory(File source, File dest) {
      if (source.isDirectory()) {
         dest.mkdir();
      }
      File[] list = source.listFiles();
      for (int i = 0; i < list.length; i++) {
         if (list[i].isDirectory()) {
            File file = new File(dest.getPath(),list[i].getName());
            file.mkdir();
            copyDirectory(list[i],file);
         }else {
            File file = new File(dest.getPath(),list[i].getName());
            copyFile(list[i], file);
         }
         System.out.println("진행률 : "+(i+1)+" / "+list.length);
      }
   }
   
   public String fileCd(String str, String arr) {
      String answer = "";
      File file = new File(str,arr);
      if (!file.exists()) {
         System.out.println("파일이 존재하지 않습니다.");
         return answer = str;
      }else {
         return answer = str += "\\" + arr;
      }
   }
   

   public static void main(String[] args) {
      DosMain fd = new DosMain();
      Scanner sc = new Scanner(System.in);
      String str = "C:\\KOSTA";
      while(true) {
         System.out.print(str+">");
         String menu = sc.nextLine();
         String arr[] = menu.split(" ");
         switch (arr[0]) {
         case "ls":
            fd.listFile(str);
            break;
         case "cd":
            str = fd.fileCd(str, arr[1]);
            break;
         case "cd..":
            String arr2[] = str.split("\\\\");
            str = "";
            str += arr2[0];
            for (int i = 1; i<arr2.length-1; i++) {
               str += "\\" + arr2[i];
            }
            break;
         case "mkdir":
            fd.fileMkdir(str, arr[1]);
            break;
         case "cp":
            fd.fileCopy(str, arr[1]);
            break;
         case "exit":
            return;
      
         }
      }
      
   }

}