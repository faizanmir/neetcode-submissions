class MinStack() {
    val minStack = ArrayDeque<Int>()
    val stack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addLast(`val`)

        if (minStack.isEmpty() || `val` <= minStack.last()) {
            minStack.addLast(`val`)
        }
    }

    fun pop() {
        if (stack.isNotEmpty()) {
            val popped = stack.removeLast()
            if (minStack.isNotEmpty() && minStack.last() == popped)
                minStack.removeLast()
        }
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}