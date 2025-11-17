import java.util.*;
import java.util.stream.*;
public class ShoppingCartSummary{
 public static void main(String[] args){
  LinkedHashMap<String,Double> cart=new LinkedHashMap<>();
  cart.put("Phone",30000.0);cart.put("Headphones",2000.0);cart.put("Charger",500.0);
  double total=cart.values().stream().mapToDouble(Double::doubleValue).sum();
  if(total>5000) total*=0.9;
  cart.remove("Charger");
  System.out.println("Total: "+total);
  for(Map.Entry<String,Double> e:cart.entrySet()) System.out.println(e.getKey()+" "+e.getValue());
 }
}