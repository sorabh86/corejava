/**
 * 7. Longest Palindromic Substring
 * 
 * TOPIC: String, Dynamic Programming
 * 
 * Given a string s, return the longest palindromic substring in s.
 * 
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * 
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 * 
 * Constraints:
 * -> 1 <= s.length <= 1000
 * -> s consist of only digits and English letters.
 */
package com.github.sorabh86.interview.questions;

/**
 *
 * @author sorabh
 */
public class LongestPalindromicSubstring {
    /**
     * Approach 1: Longest Common Substring
     * 
     * Common mistake
     * Some people will be tempted to come up with a quick solution, which is 
     * unfortunately flawed (however can be corrected easily):
     * Reverse SS and become S'. Find the longest common substring between S 
     * and S', which must also be the longest palindromic substring.
     * This seemed to work, let’s see some examples below.
     * For example, S = "caba", S' = "abac".
     * The longest common substring between S and S' is "aba", which is the answer.
     * Let’s try another example: S = "abacdfgdcaba", S' = "abacdgfdcaba".
     * The longest common substring between S and S' is "abacd". Clearly, this 
     * is not a valid palindrome.
     * 
     * Algorithm
     * We could see that the longest common substring method fails when there 
     * exists a reversed copy of a non-palindromic substring in some other part 
     * of SS. To rectify this, each time we find a longest common substring 
     * candidate, we check if the substring’s indices are the same as the 
     * reversed substring’s original indices. If it is, then we attempt to 
     * update the longest palindrome found so far; if not, we skip this and 
     * find the next candidate.
     * This gives us an O(n^2) Dynamic Programming solution which uses O(n^2) 
     * space (could be improved to use O(n) space). 
     */
    
    /**
     * Approach 2: Brute Force
     * 
     * The obvious brute force solution is to pick all possible starting and 
     * ending positions for a substring, and verify if it is a palindrome.
     * 
     * Complexity Analysis
     * -> Time complexity : O(n^3). Assume that n is the length of the input 
     * string, there are a total of n/2 = n(n-1)/2 such substrings (excluding 
     * the trivial solution where a character itself is a palindrome). Since 
     * verifying each substring takes O(n) time, the run time complexity is 
     * O(n^3).
     * -> Space complexity : O(1).
     */
}
