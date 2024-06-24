package score.test;

import score.course.*;
import java.util.Arrays;
import java.util.Comparator;


   
public class ScoreTest {
   
	 static <T extends Comparable> T findBest(T[] a) {            //  (02-2)  ä���ֱ�
	      T best = a[0];

	   // ������ �ְ��� �л��� �̸��� ���� �� ���� ������ ��ȯ�ϴ� �ڵ�            //  (02-2)  ä���ֱ�
	      for (int i = 1; i < a.length; i++) {
	         int isBig = a[i].compareTo(best);
	         
	         if (isBig > 0) best = a[i];
	      }
	      return best;
	   }


	 static EnglishScore findBest(EnglishScore[] a) {
		 EnglishScore best = a[0];
      
      // ������ �ְ��� �л��� �̸��� ���� ������ ��ȯ�ϴ� �ڵ�                 //  (01-3)  ä���ֱ�
      for (int i = 1; i < a.length; i++) {
          int isBig = a[i].compareTo(best);
          
          if (isBig > 0) best = a[i];
       }
       return best;
     }

	 static <T> T findScore(T[] a, String name) {				//  (03-1)  ä���ֱ�
		 Arrays.sort(a);
		 int length = a.length;
		 for (int i = 0; i < length; i++){
			 if (a[i].toString().substring(0, name.length()).equals(name))
				 return a[i];
		 }
        return null;                
	 }

   
   public static void main(String[] args) {
      EnglishScore[] ea = { new EnglishScore("���", 77), new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 99) };
      MathScore[] ma = { new MathScore("���", 80), new MathScore("�念��", 98), new MathScore("ȫ�浿", 70) };
      String name ="�念��";//  (03-2)  �ϼ���

      System.out.println("���� �ְ� ���� : " + findBest(ea));
      System.out.println("���� �ְ� ���� : " + findBest(ma));

      try {                                                       //  (03-2)  �ϼ���
         name=args[0];
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("����� ���ڰ� �����ϴ�.");
         return;
      }
      System.out.println("����       ���� : " + findScore(ea, name)); //  (03-2)  �ϼ���
      System.out.println("����       ���� : " + findScore(ma, name));
   }
}