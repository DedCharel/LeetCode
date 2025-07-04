package easy
/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to easy.search
target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1 */


fun search(nums: IntArray, target: Int): Int {

    var left = 0
    var right = nums.size - 1
    var index = (left + right) / 2
    while (left <= right) {
        if (nums[index] == target) return index
        if (nums[index] < target) {
            left = index + 1
        } else {
            right = index - 1
        }
        index = (left + right) / 2
    }
    return -1
}