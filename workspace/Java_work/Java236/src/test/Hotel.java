package test;

public class Hotel implements Service {
   private String roomNo;
   private String roomClass;
   private int price;
   
   public Hotel() {}
   
   public Hotel(String roomNo, String roomClass, int price) {
      super();
      this.roomNo = roomNo;
      this.roomClass = roomClass;
      this.price = price;
   }

   @Override
   public void show() {
      System.out.println("방번호 : "+roomNo);
      System.out.println("방등급 : "+roomClass);
      System.out.println("1박당 가격 : "+price);
      System.out.println();
   }

   @Override
   public String getName() {
      // TODO Auto-generated method stub
      return null;
   }

   public String getRoomNo() {
      return roomNo;
   }

   public void setRoomNo(String roomNo) {
      this.roomNo = roomNo;
   }

   public String getRoomClass() {
      return roomClass;
   }

   public void setRoomClass(String roomClass) {
      this.roomClass = roomClass;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

}