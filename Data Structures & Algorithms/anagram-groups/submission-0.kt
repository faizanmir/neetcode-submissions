class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = hashMapOf<List<Int>,MutableList<String>>()

        for (str in strs) {
            val count = MutableList(26) { 0 }
            for (character in str) {
                count[character - 'a']++
            }
            res.getOrPut(count, {mutableListOf()}).add(str)
        }
        return res.values.toList()
    }
}
