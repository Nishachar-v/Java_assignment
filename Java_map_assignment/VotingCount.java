import java.util.*;
public class VotingCount{
 public static void main(String[] args){
  String[] votes={"Alice","Bob","Alice","Carol","Bob","Alice","Bob","Carol","Bob","Alice"};
  Map<String,Integer> m=new HashMap<>();
  for(String v:votes) m.put(v,m.getOrDefault(v,0)+1);
  String winner=null;int mv=0;int total=0;
  for(Map.Entry<String,Integer> e:m.entrySet()){total+=e.getValue(); if(e.getValue()>mv){mv=e.getValue();winner=e.getKey();}}
  System.out.println("Winner: "+winner);
  System.out.println(m);
  System.out.println("Total votes: "+total);
 }
}