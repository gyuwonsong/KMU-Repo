package inner_anno;

import java.util.*;

class Hotel {
   private class Room implements Comparable<Object>{
      int number;
      String client;

      public Room(int number, String client) {

         this.number = number;
         this.client = client;
         // 적절한 내용으로 구현할 것
         
      }

      public int compareTo(Object o) {

         Room other = (Room) o;
         // 적절한 내용으로 구현할 것
         
         return this.number - other.number;
         
      }
   }

   Vector<Room> rooms = new Vector<Room>();

   public void add(int number, String client) {
        rooms.add(new Room(number, client));
      // 적절한 내용으로 구현할 것
      
   }

   public void show() {
        for (Room room : rooms) {
           if (room !=null)
              System.out.println(room.number + "번 방을 "+ room.client + "가 예약했습니다.");
        }
      // 적절한 내용으로 구현할 것
      
   }
      
}

public class HotelTest {
   
   public static void main(String[] args) {
      Hotel hotel = new Hotel();
      hotel.add(12, "영희");
      hotel.add(5, "호돌이");
      hotel.add(7, "길동이");
      hotel.add(1, "철수");
      Collections.sort(hotel.rooms);
      hotel.show();
   }
}
