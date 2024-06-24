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
      Map<String, String> dic = new HashMap<>();         // (01-1) 채워넣기

      //     (입력데이터1)
      ///*      // (01-2) 채워넣기
      dic.put("cat", "꼬네이");    
      dic.put("head", "대가빠리");
      dic.put("aunt", "아지매");
      dic.put("noodle", "국시");
      dic.put("teacher", "쌤");
      dic.put("child", "얼라");
      //*/

      //   (입력데이터2)
      /*
      dic.put("Fish", "물고기");
      dic.put("Accent", "악센트");
      dic.put("Glass", "글라스");
      dic.put("Dog", "개");
      dic.put("Cat", "고양이");
      dic.put("Report", "리포트");
      */

      for( String key : dic.keySet() );                      //  (01-3)  채워넣기
      	if(key!=null) System.out.printf("%s=%s  ", key, dic.get(key));

      dic.forEach((key, value) -> System.out.println(key + " = " + value));                         //  (02-1)  채워넣기
      System.out.println();

      Collection<String> collection1 = dic.values();         //  (02-2)  채워넣기
      List<String> list = new ArrayList<>(collection1);      //  (02-3)  채워넣기
      Collections.shuffle(list);                             //  (02-3)  채워넣기
      list.forEach(x -> System.out.print(x + "  "));
      System.out.println();

      Collection<String> collection2 = dic.keySet();         //  (03-1)  채워넣기
      collection2.forEach(x -> System.out.print(x + " "));
      System.out.println();

      Stream<String> stream = collection2.stream();          //  (03-2)  채워넣기
      stream.sorted().filter(x -> x.length() > 4).forEach(x -> System.out.print(x + " "));         //  (03-3)  채워넣기
   }
}