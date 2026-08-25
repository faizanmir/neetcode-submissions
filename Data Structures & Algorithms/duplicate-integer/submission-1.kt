class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        return nums.toSortedSet().size != nums.size
    }
}
