// Extra 9. Student Marks Report
import java.util.*;
public class StudentMarksReport {
    public static void main(String[] args) {
        String[] inputs = {"85","95","null","abc","88"};
        ArrayList<Integer> marks = new ArrayList<>();
        for (String in : inputs) {
            if ("null".equalsIgnoreCase(in)) continue;
            try {
                marks.add(Integer.valueOf(in));
            } catch (NumberFormatException e) {
                // ignore invalid
            }
        }
        double avg = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Valid marks: " + marks);
        System.out.println("Average = " + avg);
    }
}
