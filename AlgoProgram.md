## Context
- 01 Array, Hash Table (Two Sum)

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]

    SOLUTION: 
    ```
    // brute force method
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        return new int[] { i, j };
                    }
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }
    }
    // Two-pass Hash Table
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            // In case there is no solution, we'll just return null
            return null;
        }
    }
    //One-pass Hash Table
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            // In case there is no solution, we'll just return null
            return null;
        }
    }
    ```

- 02 Hash Table, String Sliding Window (Longest Substring Without Repeating Characters)

    Given a string s, find the length of the longest substring without repeating characters.

    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    Constraints:

    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

    SOLUTION:
    ```
    // Brute Force
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();

            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (checkRepetition(s, i, j)) {
                        res = Math.max(res, j - i + 1);
                    }
                }
            }

            return res;
        }

        private boolean checkRepetition(String s, int start, int end) {
            int[] chars = new int[128];

            for (int i = start; i <= end; i++) {
                char c = s.charAt(i);
                chars[c]++;
                if (chars[c] > 1) {
                    return false;
                }
            }

            return true;
        }
    }
    // Sliding Window
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            Integer[] chars = new Integer[128];

            int left = 0;
            int right = 0;

            int res = 0;
            while (right < s.length()) {
                char r = s.charAt(right);

                Integer index = chars[r];
                if (index != null && index >= left && index < right) {
                    left = index + 1;
                }

                res = Math.max(res, right - left + 1);

                chars[r] = right;
                right++;
            }

            return res;
        }
    }
    ```

- 03 Array, Divide & Conquer, Dynamic Programming
- 04 Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
- 05 Linked List, Math, Recursion
- 06 Array, Two Pointers, Sorting
- 07 String, Dynamic Programming
- 08 Array, Binary Search, Divide & Conquer
- 09 Array, Two Pointers, Greedy
- 10 Array, Dynamic Programming
- 11 Array, Binary Search
- 12 Array, Depth-First Search, Breadth-First Search, Union Find, Matrix
- 13 Hash Table, Linked List, Design, Doubly-Linked List
- 14 Array, Sorting
- 15 String, Dynamic Programming, Backtracking
- 16 Array, Two Pointers, Binary Search, Bit Manipulation
- 17 Array, Prefix Sum
- 18 String, Stack
- 19 Array, Hash Table, Prefix Sum
- 20 Array, Dynamic Programming
- 21 Array, Binary Search, Dynamic Programming
- 22 Linked List, Recursion
- 23 Array, Dynamic Programming
- 24 Linked List, Divide & Conquer, Heap (Priority Queue), Merge Sort
- 25 Linked List, Recursion
- 26 Math, Dynamic Programming Memoization
- 27 Array, Dynamic Programming, Breadth-First Search
- 28 Array, Dynamic Programming, Greedy
- 29 Hash Table, String, Dynamic Programming, Trie, Memoization
- 30 Hash Table, String, Sliding Window
- 31 Array, Binary Search
- 32 Array, Backtracking
- 33 Array, Backtracking
- 34 Hash Table, String, Backtracking
- 35 Tree, Depth-First Search, Binary Search Tree, Binary Tree
- 36 Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue
- 37 Tree, Depth-First Search, Binary Tree
- 38 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 39 Array, Two Pointers
- 40 Array, Two Pointers, Sorting
- 41 Linked List, Two Pointers
- 42 Array, Bit Manipulation
- 43 Array, Stack, Monotonic Stack
- 44 Array, Hash Table
- 45 Depth-First Search, Breadth-First Search, Graph, Topological sort
- 46 Dynamic Programming, Tree, Depth-First Search, Binary Tree
- 47 Array, Backtracking, Matrix
- 48 Array, Backtracking, Bit Manipulation
- 49 Array, Hash Table, Union Find
- 50 Array, Divide & Conquer, Sorting, Heap (Priority Queue), Quickselect
- 51 Hash Table, String, Sorting
- 52 Array Two Pointers
- 53 Hash Table, Linked List, Two Pointers
- 54 Array, Hash Table, Divide & Conquer, Soring, Counting
- 55 Math, Dynamic Programming, Combinatorics
- 56 Array, Math, Matrix
- 57 Linked List, Two Pointers, Stack, Recursion
- 58 String, Dynamic Programming
- 59 String, Dynamic Programming, Recursion
- 60 Array, Hash Table, Divide & Conquer, Tree, Binary Tree
- 61 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 62 Array, Math, Two Pointers
- 63 String, Stack, Recursion
- 64 Stack, Design
- 65 Array, Hash Table, Divide & Conquer, Sorting, Heap (Priority Queue), Bucket Sort, Counting, Quickselect
- 66 Hash Table, Linked List
- 67 String, Dynamic Programming, Stack
- 68 Tree, Depth-First Search, Binary Tree
- 69 Tree, Breadth-First Search, Binary Tree
- 70 Tree, Depth-First Search, Binary Tree
- 71 Array, Dynamic Programming, Greedy
- 72 Array, Dynamic Programming
- 73 Stack, Tree, Depth-First Search
- 74 Hash Table, String, Breadth-First Search
- 75 Math, Dynamic Programming, Tree, Binary Search Tree, Binary Tree
- 76 Hash Table, Linked List, Two Pointers
- 77 Array, Dynamic Programming, Matrix
- 78 String
- 79 Array, Dynamic Programming, Greedy
- 80 Array, Dynamic Programming, Matrix
- 81 Array, Binary Search, Divide & Conquer, Matrix
- 82 Math
- 83 Array, Binary Search
- 84 Linked List, Stack, Tree, Depth-First Search, Binary Tree
- 85 Hash Table, String, Design, Trie
- 86 Array, Stack, Monotonic Stack
- 87 Hash Table, Two Pointers, String, Greedy
- 88 Math, Dynamic Programming, Breadth-First Search
- 89 String, Dynamic Programming
- 90 Two Pointers, Design, Sorting, Heap (Priority Queue), Data Stream
- 91 Array, Dynamic Programming, Stack, Matrix, Monotonic Stack
- 92 Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting
- 93 Linked List, Recursion
- 94 Array, Matrix, Simulation
- 95 Array, Dynamic Programming, Backtracking
- 96 Array, Hash Table
- 97 Depth-First Search, Breadth-First Search, Graph, Topological Sort
- 98 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 99 String, Tree, Depth-First Search, Breadth-First Search, Design, Binary Tree
- 100 Hash Table, Linked List, Two Pointers
- 101 Dynamic Programming, Tree, Depth-First Search, Binary Tree
- 102 Linked List, Two Pointers, Divide & Conquer, Sorting, Merge Sort
- 103 Hash Table, String, Sliding Window
- 104 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 105 String Dynamic Programming
- 106 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 107 Array, Breadth-First Search, Matrix
- 108 Array, Hash Table, Matrix
- 109 Array, Divide and Conquer, Tree, Binary Search Tree, Binary Tree
- 110 Array, Binary Search, Matrix
- 111 Array, Binary Search
- 112 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 113 Array, Two Pointers
- 114 Tree, Depth-First Search, Binary Search Tree, Binary Tree
- 115 Array, Binary Search, Sliding Window, Prefix Sum
- 116 Array, Hash Table
- 117 Array, Dynamic Programming
- 118 Dynamic Programming, Bit Manipulation
- 119 Tree, Depth-First Search, Breadth-First Search, Binary Tree
- 120 Linked List, Recursion
- 121 Linked List
- 122 Array, String, Backtracking, Trie, Matrix
- 123 String, Dynamic Programming
- 124 Array, Binary Search, Sorting, Heap (Priority Queue), Matrix
- 125 Array, Two Pointers, Sorting
- 126 Array, Dynamic Programming
- 127 Array, Dynamic Programming
- 128 String, Dynamic Programming, Backtracking
- 129 Linked List, Tow Pointers, Stack, Recursion
- 130 Array, Dynamic Programming
- 131 Array, Depth-First Search, BFS, Union Find, Matrix
- 132 Array, Binary Search, Divide & Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set
- 133 Array, Two Pointers, Sorting
- 134 Tree, BFS, Binary Tree
- 135 Array, Binary Search
- 136 Array, Hash Table, Math, Design, Randomized
- 137 Tree, DFS, Binary Tree
- 138 Math
- 139 Array, Backtracking
- 140 Array, Math, Divide & Conquer, Geometry, Sorting, Heap (Priority Queue), Quickselect
- 141 Linked List
- 142 DFS, BFS, Graph, Topological Sort
- 143 Tree, DFS, BFS, Binary Tree
- 144 Tree, DFS, Binary Search Tree, Binary Tree
- 145 Array, Two Pointers, Stack, Greedy, Sorting, Monotonic Stack
- 146 Stack, Tree, Design, Binary Search Tree, Binary Tree, Iterator
- 147 Dynamic Programming, DFS, BFS, Graph, Topological Sort, Memoization
- 148 Array, Greedy, Sorting
- 149 Tree, DFS, Binary Tree
- 150 Tree, Binary Search Tree, Binary Tree
- 151 Tree, DFS, String Matching, Binary Tree, Hash Function
- 152 Array, Hash Table, Math, Bit Manipulation, Sorting
- 153 String, Dynamic Programming
- 154 Array, DFS, BFS, Union Find, Graph, Shortest Path
- 155 Array, Dynamic Programming
- 156 Array, Dynamic Programming
- 157 Hash Table, DFS, BFS, Graph
- 158 Array, Dynamic Programming
- 159 Hash Table, Math, Two Pointers
- 160 DFS, BFS, Union Find, Graph
- 161 Array, Binary Search
- 162 Array, Greedy
- 163 Dynamic Programming, Backtracking, Tree, Binary Search Tree, Binary Tree
- 164 Dynamic Programming, DFS, BFS, Graph, Heap(Priority Queue), Shortest Path
- 165 Linked List, Two Pointers
- 166 String, stack, Greedy, Monotonic
- 167 Array, Backtracking, Matrix
- 168 Array, DFS, BFS, Union find, Matrix
- 169 Binary Search, Tree, DFS, Binary Tree
- 170 String, Backtracking, BFS
- 171 Array, Dynamic Programming, Backtracking, Bit Manipulation, Memoization, Bitmask
- 172 Array, Two Pointers, Binary Search
- 173 Hash Table, String, Queue, Counting
- 174 String, Greedy, Sorting
- 175 Array, Math, Enumeration, Number Theory
- 176 Array, Two Pointers, Sorting
- 177 Array, Backtracking
- 178 Hash Table, String, Dynamic Programming, Backtracking, Trie, Memoization
- 179 Array, Backtracking
- 180 Array, Dynamic Programming
- 181 Linked List, Recursion
- 182 Linked List, Two Pointers
- 183 Array, Hash table, Matrix
- 184 Backtracking, tree, DFS, Binary Tree
- 185 Linked List, Divide & Conquer, Tree, Binary Search Tree, Binary Tree
- 186 Array
- 187 String, Dynamic Programming, Greedy, Recursion
- 188 Array, Backtracking, Bit Manipulation
- 189 Array, Dynamic Programming, Matrix
- 190 Array, Binary Search, Dynamic Programming, Greedy
- 191 Hash Table, String, Greedy, Sorting, Heap(Priority Queue), Counting
- 192 Hash Table, Two Pointers, String, Sliding Window
- 193 Array, Hash Table, Sorting, Counting
- 194 Array, Hash Table, Divide & Conquer, Tree, Binary Tree
- 195 Array, Dynamic Programming
- 196 Hash Table, String, Trie, Sorting, Heap(Priority Queue), Bucket Sort, Counting
- 197 Array, DFS, BFS, Matrix
- 198 Linked List
- 199 Math, String, Bit Manipulation, Simulation
- 200 Array, Dynamic Programming, BFS, Matrix
- 201 Hash Table, String, Sorting