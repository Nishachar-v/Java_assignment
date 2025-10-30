// 3. Auto-boxing and Auto-unboxing
import java.util.ArrayList;
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // auto-boxing
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(13);
        int sum = 0;
        // auto-unboxing
        for (Integer n : list) sum += n;
        System.out.println("Sum of numbers = " + sum);
    }
}
