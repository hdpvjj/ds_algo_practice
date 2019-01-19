package com.jinugu.vijay.linkedlist;

public class AddLinkedListNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        if (l1 == null && l2 == null) {
            System.out.println("Lists are empty");
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if(l1 != null && l2 == null){
            return l1;
        }
        int n1;
        int n2;
        int r;
        ListNode prev = null;
        int carry = 0;
        while(l1 != null || l2 != null){
            n1 = l1 != null ? l1.val : 0;
            n2 = l2 != null ? l2.val : 0;
            r = n1 + n2 + carry;
            carry = (r / 10);
            r = r % 10;
            ListNode node = new ListNode(r);
            if(result == null)
                result = node;
            else
                prev.next = node;
            prev = node;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carry > 0){
            prev.next = new ListNode(carry);
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println("Start");
    }
}
