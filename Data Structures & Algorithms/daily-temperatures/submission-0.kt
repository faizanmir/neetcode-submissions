class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val results = IntArray(temperatures.size) {0}
        val stack = ArrayDeque<Pair<Int, Int>>()

        fun addToStack(pair : Pair<Int, Int>) = stack.addLast(pair)

        for (i in temperatures.indices) {
            if (stack.isEmpty())
                addToStack(temperatures[i] to  i)
            else {
                while (stack.isNotEmpty() && temperatures[i] > stack.last().first) {
                    val popped = stack.removeLast()
                    results[popped.second] = i - popped.second
                }
                addToStack(temperatures[i] to i)
            }
        }
        return results
    }
}
