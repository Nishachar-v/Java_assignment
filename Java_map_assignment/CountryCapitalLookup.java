import java.util.*;
public class CountryCapitalLookup{
 public static void main(String[] args){
  Map<String,String> m=new TreeMap<>();
  m.put("India","New Delhi");m.put("France","Paris");m.put("Japan","Tokyo");m.put("Brazil","Brasilia");
  m.put("Canada","Ottawa");m.put("Germany","Berlin");m.put("Egypt","Cairo");m.put("Kenya","Nairobi");
  String q="Japan";
  System.out.println(m.getOrDefault(q,"Unknown country"));
  for(Map.Entry<String,String> e:m.entrySet()) System.out.println(e.getKey()+" - "+e.getValue());
 }
}