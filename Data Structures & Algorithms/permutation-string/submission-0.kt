class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val k = s1.length                                   // val: never reassigned
        val freq = hashMapOf<Char, Int>()
        for (c in s1) freq[c] = freq.getOrDefault(c, 0) + 1

        val window = hashMapOf<Char, Int>()
        var l = 0
        // removed: ans, isValid (unused)

        for (r in s2.indices) {
            // EXPAND
            window[s2[r]] = window.getOrDefault(s2[r], 0) + 1

            // SHRINK: fixed window, at most one element over
            if (r - l + 1 > k) {
                window[s2[l]] = window.getValue(s2[l]) - 1  // CHANGED: dead guard removed
                l++
            }

            // RECORD: only full windows
            if (r - l + 1 == k) {                           // CHANGED: +| typo
                var isValidPermutation = true
                for ((character, count) in freq) {
                    if (window[character] != count) {       // CHANGED: null != count covers "missing"
                        isValidPermutation = false
                        break
                    }
                }
                if (isValidPermutation) return true         // ADDED: wire the result
            }
        }
        return false                                        // CHANGED: was `return ans`
    }
}