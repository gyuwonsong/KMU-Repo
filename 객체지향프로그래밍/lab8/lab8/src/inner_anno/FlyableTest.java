package inner_anno;

interface Flyable {
   void speed();

   void height();
}

public class FlyableTest {
   public static void main(String[] args) {
      
      Flyable f = new Flyable() {
         public void speed() {
            System.out.println("속도");
         }
         
         public void height() {
            System.out.println("높이");
         }
      };  // 지역무명클래스 객체 생성문을 완성함
      
      f.speed();
      f.height();
   }
}