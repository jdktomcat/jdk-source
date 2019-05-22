package com.jdktomcat.pack.algorithm;

import java.util.Scanner;

/**
 * 类描述：
 *
 * @author 汤旗
 * @date 2019-05-21 21:41
 */
public class ListNumberAdd {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;
        if (l1 != null && l2 != null) {
            node = new ListNode(l1.val + l2.val);
            node.next = addTwoNumbers(l1.next, l2.next);
            ListNode head = node;
            boolean isOver = head.val / 10 != 0;
            for (; isOver; head = head.next) {
                head.val = head.val % 10;
                if (head.next == null) {
                    head.next = new ListNode(1);
                } else {
                    head.next.val += 1;
                }
                isOver = head.next.val / 10 != 0;
            }
        } else if (l1 == null && l2 != null) {
            node = new ListNode(l2.val);
            node.next = addTwoNumbers(null, l2.next);
        } else if (l1 != null && l2 == null) {
            node = new ListNode(l1.val);
            node.next = addTwoNumbers(l1.next, null);
        }
        return node;
    }
}


