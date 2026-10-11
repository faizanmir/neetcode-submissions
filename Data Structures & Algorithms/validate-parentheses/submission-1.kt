class Solution {
    fun isValid(s : String): Boolean {
        if (s.length < 2) return false
        val cache = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )
        val stack = ArrayDeque<Char>()
        for (c in s) {
            when(c) {
                '(', '{', '[' -> stack.addLast(c)
                else -> {
                    if(stack.isNotEmpty()) {
                        val popped = stack.removeLast()
                        if (cache[popped] != c) return false
                    } else return false
                }
            }
        }
        val res = stack.isEmpty()
        return res
    }
}
