import java.util.*;
public class CourseRegistration{
 public static void main(String[] args){
  Map<String,Integer> courses=new HashMap<>();
  courses.put("CS101",48);courses.put("MA101",52);courses.put("PH101",3);courses.put("HS101",10);courses.put("EE101",60);
  courses.put("PH101", Math.max(0, courses.getOrDefault("PH101",0)+2));
  courses.put("CS101", Math.max(0, courses.getOrDefault("CS101",0)-1));
  System.out.println("Near full:");
  for(Map.Entry<String,Integer> e:courses.entrySet()) if(e.getValue()>=50) System.out.println(e.getKey());
  System.out.println("Under-subscribed:");
  for(Map.Entry<String,Integer> e:courses.entrySet()) if(e.getValue()<5) System.out.println(e.getKey());
 }
}