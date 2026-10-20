/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode result = dummy;

    if(list1 == null) {
        return list2;
    } else if (list2 == null){
        return list1;
    }

    // for or a while loop figure out how to check when one list ends 
    while(list1 != null && list2 != null){
    
    if(list1.val >= list2.val){
        result.next = list2;
        list2 = list2.next;
    } else {
        result.next = list1;
        list1 = list1.next;
    }
    result = result.next;
    
    }

    // appends to the rest of the list
    result.next = (list1 != null) ? list1 : list2;

    // we return dummy next because its current placeholder is 0 
    return dummy.next; 
    }
}