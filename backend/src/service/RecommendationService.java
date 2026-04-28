package service;

import model.Problem;
import java.util.ArrayList;
import java.util.List;

public class RecommendationService {

    public static List<Problem> recommend(List<Problem> problems, String topic, String difficulty) {
        //Making a list to store the recommended problems based on the topic and difficulty provided by the user.
        List<Problem> result = new ArrayList<>();

        //Iterating through the list of problems and checking if the topic and difficulty of each problem matches with the user's input. If it matches, we add it to the result list.
        for (Problem p : problems) {
            if (p.getTopic().equalsIgnoreCase(topic)
                    && p.getDifficulty().equalsIgnoreCase(difficulty)) {

                result.add(p);

                // Limiting the result to 5 problems to recommend only the top 5 problems that match the user's input.
                if (result.size() == 5) break;
            }
        }

        return result;
    }
}