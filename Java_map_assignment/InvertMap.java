import java.util.*;
public class InvertMap{
 public static void main(String[] args){
  Map<String,Integer> input=new LinkedHashMap<>();
  input.put("A",1);input.put("B",2);input.put("C",1);
  Map<Integer,List<String>> out=new HashMap<>();
  for(Map.Entry<String,Integer> e:input.entrySet()){
   out.computeIfAbsent(e.getValue(),k->new ArrayList<>()).add(e.getKey());
  }
  System.out.println(out);
 }
}