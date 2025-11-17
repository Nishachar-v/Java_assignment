import java.util.*;
public class LibraryCatalog{
 public static void main(String[] args){
  Map<String,String> m=new TreeMap<>();
  m.put("978-1234567890","Intro to Java");m.put("978-1111111111","Data Structures");
  String isbn="978-1234567890";
  System.out.println(m.containsKey(isbn)?m.get(isbn):"Book not found");
  m.remove("978-1111111111");
  for(Map.Entry<String,String> e:m.entrySet()) System.out.println(e.getKey()+" "+e.getValue());
  String title="Intro to Java";
  for(Map.Entry<String,String> e:m.entrySet()) if(e.getValue().equals(title)) System.out.println("Found ISBN: "+e.getKey());
 }
}