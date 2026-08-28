class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 1
        for (num in nums) {
            when {
                count == 0 -> {candidate = num; count = 1}
                candidate == num -> count ++
                else -> count --
            }
        }

        return candidate 
    }

}
