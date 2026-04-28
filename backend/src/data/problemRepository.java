package data;

import model.problem;
import java.util.*;

public class problemRepository {
    public static List<problem> getAllProblems(){
        //Making a list a store all the problems currently avaoilable in the dataset.
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
        

        //Recursion problems
        problemsList.add(new problem("Fibonacci Number", "Recursion", "Easy", "https://leetcode.com/problems/fibonacci-number"));
        problemsList.add(new problem("Climbing Stairs", "Recursion", "Easy", "https://leetcode.com/problems/climbing-stairs"));
        problemsList.add(new problem("Power of Two", "Recursion", "Easy", "https://leetcode.com/problems/power-of-two"));
        problemsList.add(new problem("Reverse String", "Recursion", "Easy", "https://leetcode.com/problems/reverse-string"));
        problemsList.add(new problem("Subsets", "Recursion", "Medium", "https://leetcode.com/problems/subsets"));
        problemsList.add(new problem("Permutations", "Recursion", "Medium", "https://leetcode.com/problems/permutations"));)
        problemsList.add(new problem("Combination Sum", "Recursion", "Medium", "https://leetcode.com/problems/combination-sum"));
        problemsList.add(new problem("Generate Parentheses", "Recursion", "Medium", "https://leetcode.com/problems/generate-parentheses"));
        problemsList.add(new problem("Letter Combinations of a Phone Number", "Recursion", "Medium", "https://leetcode.com/problems/letter-combinations-of-a-phone-number"));
        problemsList.add(new problem("Word Search", "Recursion", "Medium", "https://leetcode.com/problems/word-search"));
        problemsList.add(new problem("Restore IP Addresses", "Recursion", "Medium", "https://leetcode.com/problems/restore-ip-addresses"));
        problemsList.add(new problem("N-Queens", "Recursion", "Hard", "https://leetcode.com/problems/n-queens"));
        problemsList.add(new problem("Sudoku Solver", "Recursion", "Hard", "https://leetcode.com/problems/sudoku-solver"));
        problemsList.add(new problem("Expression Add Operators", "Recursion", "Hard", "https://leetcode.com/problems/expression-add-operators"));
        problemsList.add(new problem("Palindrome Partitioning", "Recursion", "Hard", "https://leetcode.com/problems/palindrome-partitioning"));
        
        
        //Linked List problems
        problemsList.add(new problem("Reverse Linked List", "Linked List", "Easy", "https://leetcode.com/problems/reverse-linked-list"));
        problemsList.add(new problem("Merge Two Sorted Lists", "Linked List", "Easy", "https://leetcode.com/problems/merge-two-sorted-lists"));
        problemsList.add(new problem("Linked List Cycle", "Linked List", "Easy", "https://leetcode.com/problems/linked-list-cycle"));
        problemsList.add(new problem("Remove Duplicates from Sorted List", "Linked List", "Easy", "https://leetcode.com/problems/remove-duplicates-from-sorted-list"));
        problemsList.add(new problem("Intersection of Two Linked Lists", "Linked List", "Easy", "https://leetcode.com/problems/intersection-of-two-linked-lists"));
        problemsList.add(new problem("Add Two Numbers", "Linked List", "Medium", "https://leetcode.com/problems/add-two-numbers"));
        problemsList.add(new problem("Remove Nth Node From End of List", "Linked List", "Medium", "https://leetcode.com/problems/remove-nth-node-from-end-of-list"));
        problemsList.add(new problem("Copy List with Random Pointer", "Linked List", "Medium", "https://leetcode.com/problems/copy-list-with-random-pointer"));
        problemsList.add(new problem("Sort List", "Linked List", "Medium", "https://leetcode.com/problems/sort-list"));
        problemsList.add(new problem("Reverse Nodes in k-Group", "Linked List", "Medium", "https://leetcode.com/problems/reverse-nodes-in-k-group"));
        problemsList.add(new problem("Merge k Sorted Lists", "Linked List", "Hard", "https://leetcode.com/problems/merge-k-sorted-lists"));
        problemsList.add(new problem("Reverse Linked List II", "Linked List", "Hard",   "https://leetcode.com/problems/reverse-linked-list-ii"));                               
        problemsList.add(new problem("Split Linked List in Parts", "Linked List", "Hard", "https://leetcode.com/problems/split-linked-list-in-parts"));
        problemsList.add(new problem("Merge k Sorted Lists", "Linked List", "Hard", "https://leetcode.com/problems/merge-k-sorted-lists"));
        problemsList.add(new problem("Reorder List", "Linked List", "Hard", "https://leetcode.com/problems/reorder-list")); 

        //Stack Problems
        problemList.add(new problem("Valid Parentheses", "Stack", "Easy", "https://leetcode.com/problems/valid-parentheses"));
        problemList.add(new problem("Min Stack", "Stack", "Easy", "https://leetcode.com/problems/min-stack"));
        problemList.add(new problem("Implement Queue using Stacks", "Stack", "Easy", "https://leetcode.com/problems/implement-queue-using-stacks"));
        problemList.add(new problem("Baseball Game", "Stack", "Easy", "https://leetcode.com/problems/baseball-game"));
        problemList.add(new problem("Evaluate Reverse Polish Notation", "Stack", "Medium", "https://leetcode.com/problems/evaluate-reverse-polish-notation"));
        problemList.add(new problem("Daily Temperatures", "Stack", "Medium", "https://leetcode.com/problems/daily-temperatures"));
        problemList.add(new problem("Next Greater Element I", "Stack", "Medium", "https://leetcode.com/problems/next-greater-element-i"));
        problemList.add(new problem("Next Greater Element II", "Stack", "Medium", "https://leetcode.com/problems/next-greater-element-ii"));
        problemList.add(new problem("Next Greater Element III", "Stack", "Medium", "https://leetcode.com/problems/next-greater-element-iii"));
        problemList.add(new problem("Daily Temperatures", "Stack", "Medium", "https://leetcode.com/problems/daily-temperatures"));
        problemList.add(new problem("Asteroid Collision", "Stack", "Medium", "https://leetcode.com/problems/asteroid-collision"));
        problemList.add(new problem("Reverse Polish Notation", "Stack", "Medium", "https://leetcode.com/problems/reverse-polish-notation"));
        problemList.add(new problem("Largest Rectangle in Histogram", "Stack", "Hard", "https://leetcode.com/problems/largest-rectangle-in-histogram"));
        problemList.add(new problem("Trapping Rain Water", "Stack", "Hard", "https://leetcode.com/problems/trapping-rain-water"));
        problemList.add(new problem("Basic Calculator", "Stack", "Hard", "https://leetcode.com/problems/basic-calculator"));

        //Queue Problems
        problemList.add(new problem("Implement Queue using Stacks", "Queue", "Easy", "https://leetcode.com/problems/implement-queue-using-stacks"));
        problemList.add(new Problem("Number of Recent Calls", "Queue", "Easy", "https://leetcode.com/problems/number-of-recent-calls"));
        problemList.add(new problem("Recent Counter", "Queue", "Easy", "https://leetcode.com/problems/recent-counter"));
        problemList.add(new problem("Time Needed to Buy Tickets", "Queue", "Easy", "https://leetcode.com/problems/time-needed-to-buy-tickets"));
        problemList.add(new problem("Design Circular Queue", "Queue", "Medium", "https://leetcode.com/problems/design-circular-queue"));
        problemList.add(new problem("Design Circular Deque", "Queue", "Medium", "https://leetcode.com/problems/design-circular-deque"));
        problemList.add(new problem("Binary Tree Level Order Traversal", "Queue", "Medium", "https://leetcode.com/problems/binary-tree-level-order-traversal"));
        problemList.add(new problem("Course Schedule", "Queue", "Medium", "https://leetcode.com/problems/course-schedule"));
        problemList.add(new problem("Design Snake Game", "Queue", "Medium", "https://leetcode.com/problems/design-snake-game"));
        problemList.add(new problem("Task Scheduler", "Queue", "Medium", "https://leetcode.com/problems/task-scheduler"));
        problemList.add(new problem("Open the Lock", "Queue", "Medium", "https://leetcode.com/problems/open-the-lock"));
        problemList.add(new problem("Rotten Oranges", "Queue", "Medium", "https://leetcode.com/problems/rotten-oranges"));
        problemList.add(new problem("Minimum Number of Refueling Stops", "Queue", "Hard", "https://leetcode.com/problems/minimum-number-of-refueling-stops"));
        problemList.add(new problem("Design Twitter", "Queue", "Hard", "https://leetcode.com/problems/design-twitter"));
        problemList.add(new problem("Design Underground System", "Queue", "Hard", "https://leetcode.com/problems/design-underground-system"));
        
        return problemsList;
    }
}
