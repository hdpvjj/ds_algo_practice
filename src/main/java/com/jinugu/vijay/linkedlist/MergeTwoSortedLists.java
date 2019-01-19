package com.jinugu.vijay.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0);
        ListNode res = curr;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                res.next = l2;
                l2 = l2.next;
            } else {
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;
        }
        if (l1 == null)
            res.next = l2;
        else if (l2 == null)
            res.next = l1;
        return curr.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        //merger.mergeTwoLists();
    }
}
