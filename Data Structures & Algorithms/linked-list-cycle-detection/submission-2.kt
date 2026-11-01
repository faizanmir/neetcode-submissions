/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head?.next

    while (fast?.next != null) {
      if (fast.`val` == slow?.`val`)
      {
          return true
      }
        slow = slow?.next
        fast = fast.next?.next

    }
    return false
    }
}
