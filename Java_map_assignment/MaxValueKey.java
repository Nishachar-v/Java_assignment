import java.util.*;
public class MaxValueKey{
 public static void main(String[] args){
  Map<String,Integer> m=Map.of("A",10,"B",20,"C",15);
  String max=null;int mv=Integer.MIN_VALUE;
  for(Map.Entry<String,Integer> e:m.entrySet()){
   if(e.getValue()>mv){mv=e.getValue();max=e.getKey();}
  }
  System.out.println(max);
 }
}