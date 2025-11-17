import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
public class WordFrequencyCounter{
 public static void main(String[] args) throws Exception{
  String text = "Hello world, hello Java!";
  String[] words = text.toLowerCase().replaceAll("[^a-z0-9 ]"," ").split("\\s+");
  Map<String,Integer> m=new HashMap<>();
  for(String w:words) if(!w.isEmpty()) m.put(w,m.getOrDefault(w,0)+1);
  System.out.println(m);
 }
}