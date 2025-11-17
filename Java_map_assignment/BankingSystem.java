import java.util.*;
public class BankingSystem{
 public static void main(String[] args){
  Map<String,Double> m=new HashMap<>();
  m.put("AC001",1000.0);m.put("AC002",5000.0);m.put("AC003",7500.0);m.put("AC004",300.0);m.put("AC005",12000.0);
  m.put("AC001", m.get("AC001")+500);
  double withdraw=800.0;
  String acc="AC004";
  if(m.getOrDefault(acc,0.0)>=withdraw) m.put(acc,m.get(acc)-withdraw); else System.out.println("Insufficient");
  List<Map.Entry<String,Double>> list=new ArrayList<>(m.entrySet());
  list.sort((a,b)->Double.compare(b.getValue(),a.getValue()));
  for(Map.Entry<String,Double> e:list) System.out.println(e.getKey()+" "+e.getValue());
  System.out.println("Top 3:");
  for(int i=0;i<3 && i<list.size();i++) System.out.println(list.get(i));
 }
}