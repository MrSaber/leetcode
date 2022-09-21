package com.mrsaber.offer;

import java.util.HashSet;

public class Offer_022 {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        ListNode ptr = head;
        while (ptr!=null && ptr.next!=null){
            ListNode tmp = ptr;
            if(nodeSet.contains(tmp)){
                return ptr;
            }
            nodeSet.add(tmp);
            ptr = ptr.next;
        }
        return ptr;
    }
}
