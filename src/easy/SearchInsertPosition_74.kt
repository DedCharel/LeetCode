package easy

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
 the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4 */


fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size-1

    while (left <= right){
        var index = left + (right - left) /2
        if (nums[index] == target) return index
        if (nums[index] < target){
            left = index + 1
        } else right = index - 1
    }
   return left
}