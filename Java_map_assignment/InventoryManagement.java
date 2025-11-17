import java.util.*;
public class InventoryManagement{
 public static void main(String[] args){
  Map<String,Integer> stock=new HashMap<>();
  stock.put("Soap",10);stock.put("Shampoo",2);stock.put("Toothpaste",0);
  stock.put("Shampoo", Math.max(0, stock.getOrDefault("Shampoo",0)-2));
  stock.put("Soap", stock.getOrDefault("Soap",0)+5);
  System.out.println("Query Milk: "+(stock.containsKey("Milk")?"stocked":"not stocked"));
  System.out.println("Out of stock:");
  for(Map.Entry<String,Integer> e:stock.entrySet()) if(e.getValue()<=0) System.out.println(e.getKey());
 }
}