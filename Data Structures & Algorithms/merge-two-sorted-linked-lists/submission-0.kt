/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
   fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(-1)
    var tail = dummy
    var h1 = list1
    var h2 = list2
    while (h1 != null && h2 != null) {
        if (h1.`val`!! <= h2.`val`!!) {   // h1 and h2 are both ListNode here, not ListNode?
            tail.next = h1
            h1 = h1.next              // h1.next is fine too
        } else {
            tail.next = h2
            h2 = h2.next
        }
        tail = tail.next!!

    }

    //copy all the ones left back to the list
    tail.next = h1 ?: h2
    return dummy.next
}
}
