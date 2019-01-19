package com.jinugu.vijay.strings;

import com.jinugu.vijay.linkedlist.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode l){
        if(l == null)
            return l;
        ListNode result = null;
        ListNode currentNode;
        while (l != null){
            currentNode = l;
            l = l.next;
            currentNode.next = result;
            result = currentNode;
        }
        return result;
    }
}
