// Extra 10. Performance Impact of Wrapper Classes
import java.util.*;
public class PerformanceImpactBenchmark {
    public static void main(String[] args) {
        final int N = 1_000_000;
        long t1 = System.currentTimeMillis();
        int[] arr = new int[N];
        for (int i=0;i<N;i++) arr[i]=i;
        long sum1=0;
        for (int v: arr) sum1+=v;
        long t2 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i=0;i<N;i++) list.add(i);
        long t3 = System.currentTimeMillis();
        long sum2=0;
        for (Integer v: list) sum2+=v;
        long t4 = System.currentTimeMillis();
        System.out.println("int[] fill+sum time (ms): " + (t2-t1));
        System.out.println("ArrayList<Integer> fill+sum time (ms): " + (t4-t3));
        System.out.println("Sums: " + sum1 + " , " + sum2);
    }
}
