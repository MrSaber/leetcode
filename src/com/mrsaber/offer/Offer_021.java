package com.mrsaber.offer;

public class Offer_021 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode();
        preHead.next = head;
        ListNode left = preHead;
        ListNode right = preHead;
        for(int i = 0;i<n;i++){
            right = right.next;
        }
        while (right!=null && right.next!=null){
            right = right.next;
            left = left.next;
        }
        if(left.next!=null){
            left.next = left.next.next;
        }
        return preHead.next;
    }
}
