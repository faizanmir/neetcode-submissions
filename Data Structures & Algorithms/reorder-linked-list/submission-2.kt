/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
         var slow = head
    var fast = head?.next

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    var curr = slow?.next
    slow?.next = null // break the old chain

    var prev : ListNode? = null

    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }

    var first = head
    var second = prev

    while (second != null) {
        val firstNext = first?.next
        val secondNext = second.next

        first?.next = second
        second.next = firstNext

        first = firstNext
        second = secondNext
    }

    }
}
