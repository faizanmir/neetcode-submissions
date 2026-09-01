class Solution {
   fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = Array(nums.size) { 1 }
        val suffix = Array(nums.size) { 1 }
        val res = IntArray(nums.size)

        prefix[0] = 1

        suffix[suffix.size - 1] = 1

        for (i  in 1 until nums.size) {
            prefix[i] = nums[i - 1]  * prefix[i - 1]
        }

        for(i in nums.size - 2 downTo 0) {
            suffix[i] = nums[i + 1]  * suffix[i + 1]
        }

        for (i in nums.indices) {
            res[i] = (prefix[i] * suffix[i])
        }

        return res
    }
}
