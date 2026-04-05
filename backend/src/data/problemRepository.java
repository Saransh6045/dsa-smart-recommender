package data;

import model.problem;
import java.util.*;

public class problemRepository {
    public static List<problem> getAllProblems(){
        List<problem> problemsList = new ArrayList<>();

        //Array problems
        problemsList.add(new problem("Two Sum", "Arrays", "Easy", "https://leetcode.com/problems/two-sum"));
        problemsList.add(new problem("Best Time to Buy and Sell Stock", "Arrays", "Easy", "https://leetcode.com/problems/best-time-to-buy-and-sell-stock"));
        problemsList.add(new problem("Contains Duplicate", "Arrays", "Easy", "https://leetcode.com/problems/contains-duplicate"));
        problemsList.add(new problem("Move Zeroes", "Arrays", "Easy", "https://leetcode.com/problems/move-zeroes"));
        problemsList.add(new problem("Maximum Subarray", "Arrays", "Medium", "https://leetcode.com/problems/maximum-subarray"));
        problemsList.add(new problem("Product of Array Except Self", "Arrays", "Medium", "https://leetcode.com/problems/product-of-array-except-self"));
        problemsList.add(new problem("Subarray Sum Equals K", "Arrays", "Medium", "https://leetcode.com/problems/subarray-sum-equals-k"));
        problemsList.add(new problem("Container With Most Water", "Arrays", "Medium", "https://leetcode.com/problems/container-with-most-water"));
        problemsList.add(new problem("3Sum", "Arrays", "Medium", "https://leetcode.com/problems/3sum"));
        problemsList.add(new problem("Maximum Product Subarray", "Arrays", "Medium", "https://leetcode.com/problems/maximum-product-subarray"));
        problemsList.add(new problem("Spiral Matrix", "Arrays", "Medium", "https://leetcode.com/problems/spiral-matrix"));
        problemsList.add(new problem("Median of Two Sorted Arrays", "Arrays", "Hard", "https://leetcode.com/problems/median-of-two-sorted-arrays"));
        problemsList.add(new problem("Longest Consecutive Sequence", "Arrays", "Hard", "https://leetcode.com/problems/longest-consecutive-sequence"));
        problemsList.add(new problem("Trapping Rain Water", "Arrays", "Hard", "https://leetcode.com/problems/trapping-rain-water"));
        problemsList.add(new problem("Sliding Window Maximum", "Arrays", "Hard", "https://leetcode.com/problems/sliding-window-maximum"));


        //String problems
        problemsList.add(new problem("Minimum Window Substring", "Strings", "Hard", "https://leetcode.com/problems/minimum-window-substring"));
        problemsList.add(new problem("Valid Palindrome", "Strings", "Easy", "https://leetcode.com/problems/valid-palindrome"));
        problemsList.add(new problem("Valid Anagram", "Strings", "Easy", "https://leetcode.com/problems/valid-anagram"));
        problemsList.add(new problem("Implement strStr()", "Strings", "Easy", "https://leetcode.com/problems/implement-strstr"));
        problemsList.add(new problem("Longest Common Prefix", "Strings", "Easy", "https://leetcode.com/problems/longest-common-prefix"));
        problemsList.add(new problem("Longest Substring Without Repeating Characters", "Strings", "Medium", "https://leetcode.com/problems/longest-substring-without-repeating-characters"));
        problemsList.add(new problem("Group Anagrams", "Strings", "Medium", "https://leetcode.com/problems/group-anagrams"));
        problemsList.add(new problem("Longest Palindromic Substring", "Strings", "Medium", "https://leetcode.com/problems/longest-palindromic-substring"));
        problemsList.add(new problem("String to Integer (atoi)", "Strings", "Medium", "https://leetcode.com/problems/string-to-integer-atoi"));
        problemsList.add(new problem("Decode String", "Strings", "Medium", "https://leetcode.com/problems/decode-string"));
        problemsList.add(new problem("Minimum Window Substring", "Strings", "Hard", "https://leetcode.com/problems/minimum-window-substring"));
        problemsList.add(new problem("Edit Distance", "Strings", "Hard", "https://leetcode.com/problems/edit-distance"));
        problemsList.add(new problem("Regular Expression Matching", "Strings", "Hard", "https://leetcode.com/problems/regular-expression-matching"));
        problemsList.add(new problem("Longest Valid Parentheses", "Strings", "Hard", "https://leetcode.com/problems/longest-valid-parentheses"));
        problemsList.add(new problem("Distinct Subsequences", "Strings", "Hard", "https://leetcode.com/problems/distinct-subsequences"));
        
        
        
        return problemsList;
    }
}
