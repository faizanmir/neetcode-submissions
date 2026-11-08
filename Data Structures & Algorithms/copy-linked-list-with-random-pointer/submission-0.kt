/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        val copies = HashMap<Node, Node>()

    // Returns the copy of n, creating it on first sight. Null maps to null.
    fun copyOf(n: Node?): Node? = n?.let { copies.getOrPut(it) { Node(it.`val`) } }

    var node = head
    while (node != null) {
        val copy = copies.getOrPut(node) { Node(node.`val`) }
        copy.next = copyOf(node.next)
        copy.random = copyOf(node.random)
        node = node.next
    }
    return copyOf(head)
    }
}
