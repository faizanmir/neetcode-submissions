class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int,Int>()
    nums.forEachIndexed { index, i ->
        val inverse = target - i
        if (inverse in map) return intArrayOf(map[inverse]!!, index)
        else map[i] = index
    }
    return intArrayOf()
    }
}
