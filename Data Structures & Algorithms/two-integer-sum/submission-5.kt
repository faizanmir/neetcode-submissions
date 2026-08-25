class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val cache = hashMapOf<Int,Int>()

        for (i in 0 until nums.size) {
            val complement = target - nums[i]
            if (complement in cache) {
             return intArrayOf(cache[complement] ?: 0, i)
            }
            else {
                cache[nums[i]] = i

            }
        }
        return intArrayOf()
    }
}

