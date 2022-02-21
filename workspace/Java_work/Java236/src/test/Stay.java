package test;

public class Stay extends User implements Service {
   private boolean checkIn;
   
   public Stay() {}
   

   public Stay(String name, String people, int days) {
      super(name, people, days);
   }


   public Stay(String roomNo, String roomClass, int price, String name, String people, int days, boolean checkIn) {
      super(roomNo, roomClass, price, name, people, days);
      this.checkIn = checkIn;
   }

   @Override
   public void show() {
      // TODO Auto-generated method stub
      super.show();
   }
   
   public void checkOut() {
      System.out.println("-----계산서-----");
      show();
      System.out.println("금액 : " + getPrice()*getDays());
      System.out.println("결제수단 : 1.현금 2.신용카드 3.수표");
   }

   public boolean isCheckIn() {
      return checkIn;
   }

   public void setCheckIn(boolean checkIn) {
      this.checkIn = checkIn;
   }
   
   
}