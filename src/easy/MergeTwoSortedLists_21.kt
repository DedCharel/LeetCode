package easy/* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 */


 class ListNode(var `val`: Int) {
      var next: ListNode? = null
  }


    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val result = ListNode(0)
        var tmp = result
        var l1 = list1
        var l2 = list2

        while (l1 != null && l2 != null){
            if (l1.`val` <= l2.`val` ){
                tmp.next = l1
                l1 = l1.next
            } else {
                tmp.next = l2
                l2 = l2.next
            }
            tmp = tmp.next!!
        }

        var last = l1 ?: l2
        while (last != null){
            tmp.next = last
            last = last.next
            tmp = tmp.next!!
        }

        return result.next
    }
