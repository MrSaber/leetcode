package com.mrsaber.offer;

/**
 * 反转链表
 */
public class Offer_024 {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode firstPtr = head;
        ListNode second = head.next;
        firstPtr.next = null;
        while (second != null){
            ListNode nextPtr = second.next;
            second.next = firstPtr;
            firstPtr = second;
            second = nextPtr;
        }
        return firstPtr;
    }

    public ListNode reverseListII(ListNode head) {
        ListNode prePtr = null;
        ListNode curPtr = head;
        while (curPtr != null){
            ListNode nextPtr = curPtr.next;
            curPtr.next = prePtr;
            prePtr = curPtr;
            curPtr = nextPtr;
        }
        return prePtr;
    }


    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        new Offer_024().reverseList(a1);
    }
}
