package com.LeetCode.DataStructure;

public class ReverseLinkK {
    //每K个节点翻转链表
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode solution(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        ListNode tail = head;
        boolean flag = false;
        while (tail != null) {
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return dummy.next;
                }
            }
            if (!flag) {
                dummy = tail;
                flag = true;
            }
            ListNode nextBegin = tail.next;
            pre = reverse(pre.next, tail);
            tail = nextBegin;
        }
        return null;
    }

    public static ListNode reverse(ListNode head, ListNode tail) {
        System.out.println(head.val);
        System.out.println(tail.val);
        ListNode cur = head;
        ListNode next;
        ListNode pre = null;
        while (cur!= null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode head = solution(l1, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
