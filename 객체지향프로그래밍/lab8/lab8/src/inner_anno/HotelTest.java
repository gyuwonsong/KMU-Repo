package inner_anno;

import java.util.*;

class Hotel {
   private class Room implements Comparable<Object>{
      int number;
      String client;

      public Room(int number, String client) {

         this.number = number;
         this.client = client;
         // ������ �������� ������ ��
         
      }

      public int compareTo(Object o) {

         Room other = (Room) o;
         // ������ �������� ������ ��
         
         return this.number - other.number;
         
      }
   }

   Vector<Room> rooms = new Vector<Room>();

   public void add(int number, String client) {
        rooms.add(new Room(number, client));
      // ������ �������� ������ ��
      
   }

   public void show() {
        for (Room room : rooms) {
           if (room !=null)
              System.out.println(room.number + "�� ���� "+ room.client + "�� �����߽��ϴ�.");
        }
      // ������ �������� ������ ��
      
   }
      
}

public class HotelTest {
   
   public static void main(String[] args) {
      Hotel hotel = new Hotel();
      hotel.add(12, "����");
      hotel.add(5, "ȣ����");
      hotel.add(7, "�浿��");
      hotel.add(1, "ö��");
      Collections.sort(hotel.rooms);
      hotel.show();
   }
}
