package test;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Hotel h[] = {
            new Hotel("1","Twin room",10),
            new Hotel("2","Triple room",20),
            new Hotel("3","Suite room",40)
      };
      User u[] = new User[10];
      int count = 0;
      
      while(true) {
         System.out.println("1.객실조회 2.예약 3.예약조회 4.예약취소 5.CheckIn 6.종료");
         System.out.print("메뉴 : ");
         String menu = sc.nextLine();
         switch (menu) {
         case "1":
            for (int i = 0; i < h.length; i++) {
               h[i].show();
            }
            break;
         case "2":
            System.out.println("예약하려는 방 선택 1.Twin room(2명이하), 2.Triple room(3명이하), 3.Suite room(4명이상)");
            System.out.print("선택 : ");
            String room = sc.nextLine();
            String room2 = "";
            switch (room) {
            case "1":
               room2 = "Twin room";
               break;
            case "2":
               room2 = "Triple room";
               break;
            case "3":
               room2 = "Suite room";
               break;
            }
            System.out.print("예약자이름 : ");
            String name = sc.nextLine();
            System.out.print("인원수 : ");
            String people = sc.nextLine();
            System.out.print("숙박일 : ");
            int days = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < h.length; i++) {
               if (h[i].getRoomClass().equals(room2)) {
                  u[count++] = new User(h[i].getRoomNo(),h[i].getRoomClass(),h[i].getPrice(),name,people,days);
               }
            }
            System.out.println("예약완료.");
            break;
         case "3":
            System.out.print("예약자이름 : ");
            String name2 = sc.nextLine();
            for (int i = 0; i < count; i++) {
               if ((u[i]).getName().equals(name2)) {
                  (u[i]).show();
               }
            }
            
            break;
         case "4":
            System.out.print("예약자이름 : ");
            String name3 = sc.nextLine();
            for (int i = 0; i < count; i++) {
               if (u[i].getName().equals(name3)) {
                  System.out.println("예약취소 완료");
                  u[i].cancel();
                  for (int j = i; j < count-1;j++) {
                     u[j] = u[j+1];
                  }
                  count--;
               }
            }
            
            break;
         case "5":
            System.out.print("예약자이름 : ");
            String name4 = sc.nextLine();
            System.out.println("CheakIn 하겠습니까? 1.yes 2.no");
            String cheak = sc.nextLine();
            switch (cheak) {
            case "1":
               for (int i = 0; i<count; i++) {
                  if (u[i].getName().equals(name4)) {
                     
                     System.out.println("---------------계산서----------");
                     System.out.println("총금액 : " + u[i].getPrice() * u[i].getDays());
                     System.out.println("결제수단 : 1.현금 2.신용카드 3.수표");
                     String pay = sc.nextLine();
                     switch(pay) {
                     case "1":
                        System.out.println("결제수단 : 현금");
                        break;
                     case "2":
                        System.out.println("결제수단 : 신용카드");
                        break;
                     case "3":
                        System.out.println("결제수단 : 수표");
                        break;
                     }
                     System.out.println("결제금액 : " + u[i].getPrice() * u[i].getDays());
                     System.out.println("이용해주셔서 감사합니다.");
                  }
               }
               break;
            case "2":
               for (int i = 0; i<count; i++) {
                  if (u[i].getName().equals(name4)) {
                     u[i].cancel();
                  }
               }
               System.out.println("예약이 취소되었습니다.");
               break;
            }
            break;
         case "6":
            return;
         }
      }
   }
}