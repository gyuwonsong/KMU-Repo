package score.test;

import score.course.*;
import java.util.Arrays;
import java.util.Comparator;


   
public class ScoreTest {
   
	 static <T extends Comparable> T findBest(T[] a) {            //  (02-2)  채워넣기
	      T best = a[0];

	   // 점수가 최고인 학생의 이름과 영어 및 수학 점수를 반환하는 코드            //  (02-2)  채워넣기
	      for (int i = 1; i < a.length; i++) {
	         int isBig = a[i].compareTo(best);
	         
	         if (isBig > 0) best = a[i];
	      }
	      return best;
	   }


	 static EnglishScore findBest(EnglishScore[] a) {
		 EnglishScore best = a[0];
      
      // 점수가 최고인 학생의 이름과 영어 점수를 반환하는 코드                 //  (01-3)  채워넣기
      for (int i = 1; i < a.length; i++) {
          int isBig = a[i].compareTo(best);
          
          if (isBig > 0) best = a[i];
       }
       return best;
     }

	 static <T> T findScore(T[] a, String name) {				//  (03-1)  채워넣기
		 Arrays.sort(a);
		 int length = a.length;
		 for (int i = 0; i < length; i++){
			 if (a[i].toString().substring(0, name.length()).equals(name))
				 return a[i];
		 }
        return null;                
	 }

   
   public static void main(String[] args) {
      EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
      MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
      String name ="장영실";//  (03-2)  완성됨

      System.out.println("영어 최고 점수 : " + findBest(ea));
      System.out.println("수학 최고 점수 : " + findBest(ma));

      try {                                                       //  (03-2)  완성됨
         name=args[0];
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("명령행 인자가 없습니다.");
         return;
      }
      System.out.println("영어       점수 : " + findScore(ea, name)); //  (03-2)  완성됨
      System.out.println("수학       점수 : " + findScore(ma, name));
   }
}