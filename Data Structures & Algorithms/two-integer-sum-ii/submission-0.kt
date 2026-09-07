class Solution {
     fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1
        while (i < j ) {
            val curr = numbers[i] + numbers[j]
            if (curr < target) i++
            if (curr > target) j--
            if (curr == target) return intArrayOf(i + 1, j + 1)
        }
        return intArrayOf()
    }
}
