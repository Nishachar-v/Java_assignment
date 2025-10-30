// Extra 2. Employee Data Processing
import java.util.*;
public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {25, 30, 22, 45, 28};
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : ages) list.add(a); // autoboxing
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);
        System.out.println("Ages: " + list);
        System.out.println("Youngest = " + youngest);
        System.out.println("Oldest = " + oldest);
    }
}
