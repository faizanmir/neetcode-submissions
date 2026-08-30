class Solution {
   fun longestConsecutive(nums: IntArray): Int {
        val seen = nums.toHashSet()
        var longestSequence = 0
        for (num in seen) {
            if ((num - 1) !in seen) {
                var sequence = 1
                var next = num + 1
                while ((next) in seen) {
                    sequence++
                    next += 1
                }
                longestSequence = max(sequence, longestSequence)
            }
        }
        return longestSequence
    }
}
