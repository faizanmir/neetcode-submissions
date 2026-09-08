class Solution {
   fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        val n = nums.size

        for (k in 0 until n - 2) {
            if (nums[k] > 0) break
            if (k > 0 && nums[k] == nums[k - 1]) continue
            val target = -nums[k]
            var i = k + 1
            var j = n - 1
            while (i < j) {
                val sum = nums[i] + nums[j]
                when {
                    sum < target -> i++
                    sum > target -> j--
                    else -> {
                        result.add(listOf(nums[i], nums[j], nums[k]))
                        i++
                        j--
                        while (i < j && nums[i] == nums[i - 1]) i++
                        while (i < j && nums[j] == nums[j + 1]) j--
                    }
                }
            }
        }
        return result
    }
}
