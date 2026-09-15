class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charMap = hashMapOf<Char, Int>()
        var maxLength = 0
        var right = 0
        var left = 0
        while (right < s.length) {
            var rightChar = s[right]
            charMap[rightChar] = (charMap[rightChar] ?: 0) + 1

            while (charMap[rightChar]!! > 1) {
                val leftChar = s[left]
                charMap[leftChar] =  (charMap[leftChar] ?: 0) - 1
                left++
            }
            maxLength = maxOf(maxLength, right - left + 1)
            right++
        }
        return maxLength
    }
}