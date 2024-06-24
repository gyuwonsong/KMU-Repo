package dictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class DicTest {
   private static Object key;

public static void main(String[] args) {
      Map<String, String> dic = new HashMap<>();         // (01-1) ä���ֱ�

      //     (�Էµ�����1)
      ///*      // (01-2) ä���ֱ�
      dic.put("cat", "������");    
      dic.put("head", "�밡����");
      dic.put("aunt", "������");
      dic.put("noodle", "����");
      dic.put("teacher", "��");
      dic.put("child", "���");
      //*/

      //   (�Էµ�����2)
      /*
      dic.put("Fish", "�����");
      dic.put("Accent", "�Ǽ�Ʈ");
      dic.put("Glass", "�۶�");
      dic.put("Dog", "��");
      dic.put("Cat", "�����");
      dic.put("Report", "����Ʈ");
      */

      for( String key : dic.keySet() );                      //  (01-3)  ä���ֱ�
      	if(key!=null) System.out.printf("%s=%s  ", key, dic.get(key));

      dic.forEach((key, value) -> System.out.println(key + " = " + value));                         //  (02-1)  ä���ֱ�
      System.out.println();

      Collection<String> collection1 = dic.values();         //  (02-2)  ä���ֱ�
      List<String> list = new ArrayList<>(collection1);      //  (02-3)  ä���ֱ�
      Collections.shuffle(list);                             //  (02-3)  ä���ֱ�
      list.forEach(x -> System.out.print(x + "  "));
      System.out.println();

      Collection<String> collection2 = dic.keySet();         //  (03-1)  ä���ֱ�
      collection2.forEach(x -> System.out.print(x + " "));
      System.out.println();

      Stream<String> stream = collection2.stream();          //  (03-2)  ä���ֱ�
      stream.sorted().filter(x -> x.length() > 4).forEach(x -> System.out.print(x + " "));         //  (03-3)  ä���ֱ�
   }
}