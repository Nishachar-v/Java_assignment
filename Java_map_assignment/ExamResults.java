import java.util.*;
public class ExamResults{
 public static void main(String[] args){
  Map<String,Map<String,Integer>> data=new HashMap<>();
  data.put("Math", new HashMap<>(Map.of("A",90,"B",78,"C",95)));
  data.put("Physics", new HashMap<>(Map.of("A",85,"B",92,"C",88)));
  for(Map.Entry<String,Map<String,Integer>> e:data.entrySet()){
   String subj=e.getKey();
   String top=null;int mv=Integer.MIN_VALUE;int sum=0;int cnt=0;boolean above90=false;
   for(Map.Entry<String,Integer> s:e.getValue().entrySet()){int v=s.getValue();sum+=v;cnt++; if(v>mv){mv=v;top=s.getKey();} if(v>90) above90=true;}
   System.out.println(subj+" Top: "+top+" Avg: "+(sum/cnt)+" Above90: "+above90);
  }
 }
}