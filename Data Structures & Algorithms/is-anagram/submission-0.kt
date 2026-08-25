class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = hashMapOf<Char,Int>()
        val tMap = hashMapOf<Char, Int>()

        for (ch in s) {
            sMap[ch] = (sMap[ch] ?: 0) + 1
        }

         for (ch in t) {
            tMap[ch] = (tMap[ch] ?: 0) + 1
        }

        if (sMap.keys.size != tMap.keys.size) return false

        for ((k,v) in sMap) {
            if (k !in tMap) return false
            if (tMap[k] != sMap[k]) return false
        }
            
            return true
    }
}
