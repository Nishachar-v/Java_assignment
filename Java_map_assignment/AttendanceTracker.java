import java.util.*;
public class AttendanceTracker{
 public static void main(String[] args){
  List<String> students=List.of("A","B","C","D","E");
  Map<String,Integer> m=new HashMap<>();
  for(String s:students) m.put(s,0);
  List<List<String>> days=new ArrayList<>();
  days.add(List.of("A","B","C"));
  days.add(List.of("A","D"));
  days.add(List.of("B","C","E"));
  days.add(List.of("A","B","E"));
  days.add(List.of("C","D"));
  for(List<String> present:days) for(String p:present) m.put(p,m.getOrDefault(p,0)+1);
  for(Map.Entry<String,Integer> e:m.entrySet()) if(e.getValue()<2) System.out.println(e.getKey());
 }
}