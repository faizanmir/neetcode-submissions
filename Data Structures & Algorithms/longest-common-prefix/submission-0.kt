class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]
        var currIdx = prefix.length
        var j = 1
        while (j < strs.size) {
            while (currIdx > 0 && !strs[j].startsWith(prefix.subSequence(0, currIdx))) {
                currIdx--
                prefix = prefix.substring(0, currIdx)
            }
            j++
        }

        return prefix
    }
}
