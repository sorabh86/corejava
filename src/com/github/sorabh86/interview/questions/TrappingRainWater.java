/**
 * link : https://leetcode.com/problems/trapping-rain-water
 * 
 *  3. Trapping Rain Water
 * 
 * TOPIC: Array, Divide and Conquer, Dynamic Programming
 * 
 * Given n non-negative integers representing an elevation map where the 
 * width of each bar is 1, compute how much water it can trap after raining.
 * 
 * Example 1:
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array 
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) 
 * are being trapped.
 * 
 * Example 2:
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * 
 * Constraints:
 * -> n == height.length
 * -> 1 <= n <= 2 * 10^4
 * -> 0 <= height[i] <= 10^5
 * 
 */
package com.github.sorabh86.interview.questions;

/**
 *
 * @author sorabh
 */
public class TrappingRainWater {
    /**
     * Approach 1: Brute force
     * 
     * Intuition
     * Do as directed in question. For each element in the array, we find the 
     * maximum level of water it can trap after the rain, which is equal to the 
     * minimum of maximum height of bars on both the sides minus its own height.
     * 
     * Algorithm
     * -> Initialize ans=0
     * -> Iterate the array from left to right:
     *      -> Initialize left_max=0 and right_max=0
     *      -> Iterate from the current element to the beginning of array updating:
     *          -> left_max = max(left_max, height[j])
     *      -> Iterate from the current element to the end of array updating:
     *          -> right_max = max(right_max, height[j])
     *      -> Add min(left_max, right_max) - height[i] to ans
     * 
     * Complexity Analysis
     * -> Time complexity: O(n^2). For each element of array, we iterate the 
     * left and right parts.
     * -> Space complexity: O(1) extra space.
     */
    
    
    /**
     * Approach 2: Dynamic Programming
     * 
     * Intuition
     * In brute force, we iterate over the left and right parts again and again 
     * just to find the highest bar size upto that index. But, this could be 
     * stored. Voila, dynamic programming.
     * 
     * Algorithm
     * -> Find maximum height of bar from the left end upto an index i in the 
     * array left_max.
     * -> Find maximum height of bar from the right end upto an index i in the 
     * array right_max.
     * -> Iterate over the height array and update ans:
     *      -> Add min(left_max[i],right_max[i])−height[i] to ans
     * 
     * Complexity analysis
     * -> Time complexity: O(n).
     *      -> We store the maximum heights upto a point using 2 iterations of 
     *          O(n) each.
     *      -> We finally update ans using the stored values in O(n).
     * -> Space complexity: O(n) extra space.
     *      -> Additional O(n) space for left_max and right_max arrays than 
     *          in Approach 1.
     * 
     * int trap(vector<int>& height)
     *   {
     *       if(height.empty())
     *           return 0;
     *       int ans = 0;
     *       int size = height.size();
     *       vector<int> left_max(size), right_max(size);
     *       left_max[0] = height[0];
     *       for (int i = 1; i < size; i++) {
     *           left_max[i] = max(height[i], left_max[i - 1]);
     *       }
     *       right_max[size - 1] = height[size - 1];
     *       for (int i = size - 2; i >= 0; i--) {
     *           right_max[i] = max(height[i], right_max[i + 1]);
     *       }
     *       for (int i = 1; i < size - 1; i++) {
     *           ans += min(left_max[i], right_max[i]) - height[i];
     *       }
     *       return ans;
     *   }
     */
    
    /**
     * Approach 3: Using stacks
     * 
     * Intuition
     * Instead of storing the largest bar upto an index as in Approach 2, we 
     * can use stack to keep track of the bars that are bounded by longer bars 
     * and hence, may store water. Using the stack, we can do the calculations 
     * in only one iteration. 
     * We keep a stack and iterate over the array. We add the index of the bar 
     * to the stack if bar is smaller than or equal to the bar at top of stack,
     * which means that the current bar is bounded by the previous bar in the 
     * stack. If we found a bar longer than that at the top, we are sure that 
     * the bar at the top of the stack is bounded by the current bar and a 
     * previous bar in the stack, hence, we can pop it and add resulting 
     * trapped water to ans.
     * 
     * Algorithm
     * -> Use stack to store the indices of the bars.
     * -> Iterate the array:
     *      -> While stack is not empty and height[current]>height[st.top()]
     *          -> It means that the stack element can be popped. Pop the top 
     *          element as \text{top}top.
     *          -> Find the distance between the current element and the element 
     *          at top of stack, which is to be filled. 
     *          distance=current−st.top()−1
     *          -> Find the bounded height 
     *          bounded_height=min(height[current],height[st.top()])−height[top]
     *          -> Add resulting trapped water to answer ans+=distance×bounded_height
     *      -> Push current index to top of the stack
     *      -> Move \text{current}current to the next position
     * 
     * Complexity analysis
     * -> Time complexity: O(n).
     *      -> Single iteration of O(n) in which each bar can be touched at 
     *      most twice(due to insertion and deletion from stack) and insertion 
     *      and deletion from stack takes O(1) time.
     * -> Space complexity: O(n). Stack can take upto O(n) space in case of 
     * stairs-like or flat structure.
     * 
     * int trap(vector<int>& height)
     *   {
     *       int ans = 0, current = 0;
     *       stack<int> st;
     *       while (current < height.size()) {
     *           while (!st.empty() && height[current] > height[st.top()]) {
     *               int top = st.top();
     *               st.pop();
     *               if (st.empty())
     *                   break;
     *               int distance = current - st.top() - 1;
     *               int bounded_height = min(height[current], height[st.top()]) - height[top];
     *               ans += distance * bounded_height;
     *           }
     *           st.push(current++);
     *       }
     *       return ans;
     *   }
     */
    
    /**
     * Approach 4: Using 2 pointers
     * 
     * Intuition
     * As in Approach 2, instead of computing the left and right parts 
     * seperately, we may think of some way to do it in one iteration. From the 
     * figure in dynamic programming approach, notice that as long as 
     * right_max[i]>left_max[i] (from element 0 to 6), the water trapped depends 
     * upon the left_max, and similar is the case when left_max[i]>right_max[i] 
     * (from element 8 to 11). So, we can say that if there is a larger bar at 
     * one end (say right), we are assured that the water trapped would be 
     * dependant on height of bar in current direction (from left to right). 
     * As soon as we find the bar at other end (right) is smaller, we start 
     * iterating in opposite direction (from right to left). We must maintain 
     * left_max and right_max during the iteration, but now we can do it in one 
     * iteration using 2 pointers, switching between the two.
     * 
     * Algorithm
     * -> Initialize left pointer to 0 and right pointer to size-1
     * -> While left<right, do:
     *      -> If height[left] is smaller than height[right]
     *          -> If height[left]≥left_max, update left_max
     *          -> Else add left_max−height[left] to ans
     *          -> Add 1 to left.
     *      -> Else
     *          -> If height[right]≥right_max, update right_max
     *          -> Else add right_max−height[right] to ans
     *          -> Subtract 1 from right.
     * 
     * Complexity analysis
     * -> Time complexity: O(n). Single iteration of O(n).
     * -> Space complexity: O(1) extra space. Only constant space required for 
     * left, right, left_max and right_max.
     * 
     * int trap(vector<int>& height)
     *   {
     *       int left = 0, right = height.size() - 1;
     *       int ans = 0;
     *       int left_max = 0, right_max = 0;
     *       while (left < right) {
     *           if (height[left] < height[right]) {
     *               height[left] >= left_max ? (left_max = height[left]) : ans += (left_max - height[left]);
     *               ++left;
     *           }
     *           else {
     *               height[right] >= right_max ? (right_max = height[right]) : ans += (right_max - height[right]);
     *               --right;
     *           }
     *       }
     *       return ans;
     *   }
     */
}
