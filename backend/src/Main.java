import model.problem;
import data.problemRepository;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<problem> problems = problemRepository.getAllProblems();
        for (problem p : problems) {
            System.out.println(p);
        }

        /*problem p1 = new problem(
                "Two Sum",
                "Arrays",
                "Easy",
                "https://leetcode.com/problems/two-sum"
        );

        System.out.println(p1);*/
    }
}