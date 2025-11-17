import java.util.*;
public class EmployeeDeptMap{
 public static void main(String[] args){
  Map<Integer,String> m=new HashMap<>();
  m.put(1,"HR");m.put(2,"IT");m.put(3,"IT");m.put(4,"Sales");
  m.put(2,"Sales");
  String dept="IT";
  List<Integer> ids=new ArrayList<>();
  for(Map.Entry<Integer,String> e:m.entrySet()) if(e.getValue().equals(dept)) ids.add(e.getKey());
  Map<String,Integer> counts=new HashMap<>();
  for(String d:m.values()) counts.put(d, counts.getOrDefault(d,0)+1);
  System.out.println(ids);
  System.out.println(counts);
 }
}