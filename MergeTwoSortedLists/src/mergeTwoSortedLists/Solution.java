package mergeTwoSortedLists;

public class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
        	if(list1.val <= list2.val) {
        		cur.next = list1;
        		list1 = list1.next;
        	}else {
        		cur.next = list2;
        		list2 = list2.next;
        	}
        	cur = cur.next;
        }
        cur.next = list1 == null ? list2:list1;
        return dummy.next;
    }
	
	public static void main(String argz[]) {}
	
}
