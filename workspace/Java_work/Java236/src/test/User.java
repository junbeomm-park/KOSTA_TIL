package test;

public class User extends Hotel implements Service {
   private String name;
   private String people;
   private int days;
   
   public User() {}

   public User(String roomNo, String roomClass, int price) {
      super();
      setRoomNo(roomNo);
      setRoomClass(roomClass);
      setPrice(price);
   }

   public User(String roomNo, String roomClass, int price, String name, String people, int days) {
      super(roomNo, roomClass, price);
      this.name = name;
      this.people = people;
      this.days = days;
   }

   @Override
   public void show() {
      // TODO Auto-generated method stub
      super.show();
      System.out.println("예약자 이름 : " + name);
      System.out.println("인원수  : " + people);
      System.out.println("숙박일 : " + days);
   }
   
   public void cancel() {
      setName(null);
      setPeople(null);
      setDays(0);
   }
   
   public void reservation(String name, String People, int Days) {
      setName(name);
      setPeople(People);
      setDays(Days);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPeople() {
      return people;
   }

   public void setPeople(String people) {
      this.people = people;
   }

   public int getDays() {
      return days;
   }

   public void setDays(int days) {
      this.days = days;
   }
   
   
}