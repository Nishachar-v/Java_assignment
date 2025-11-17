import java.util.*;
public class StudentGradeTracker{
 public static void main(String[] args){
  Map<String,Double> m=new TreeMap<>();
  m.put("Ravi",78.5);m.put("Zara",85.0);m.put("Anu",67.0);
  m.put("Anu",75.0);
  m.remove("Ravi");
  for(Map.Entry<String,Double> e:m.entrySet()) System.out.println(e.getKey()+" "+e.getValue());
 }
}