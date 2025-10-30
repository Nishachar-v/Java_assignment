// Extra 7. Product Ratings Analyzer
import java.util.*;
import java.util.stream.*;
public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] primitiveRatings = {5,4,3,5};
        ArrayList<Integer> objRatings = new ArrayList<>(Arrays.asList(4, null, 5));
        ArrayList<Integer> combined = new ArrayList<>();
        for (int r : primitiveRatings) combined.add(r);
        for (Integer r : objRatings) if (Objects.nonNull(r)) combined.add(r);
        double avg = combined.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Combined ratings: " + combined);
        System.out.println("Average rating: " + avg);
    }
}
