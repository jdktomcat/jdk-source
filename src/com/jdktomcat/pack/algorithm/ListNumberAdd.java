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
        } else if (l1 == null && l2 != null) {
            node = new ListNode(l2.val);
            node.next = addTwoNumbers(null, l2.next);
        } else if (l1 != null && l2 == null) {
            node = new ListNode(l1.val);
            node.next = addTwoNumbers(l1.next, null);
        }
        return node;
    }

    private static ListNode createList(String listStr) {
        ListNode head = null;
        if (listStr != null) {
            listStr = listStr.trim();
            if (listStr.length() > 2) {
                listStr = listStr.substring(1, listStr.length() - 1);
                String[] numberArray = listStr.split("->");
                ListNode temp = head;
                for (String numberStr : numberArray) {
                    if (temp == null) {
                        head = new ListNode(Integer.parseInt(numberStr.trim()));
                        temp = head;
                    } else {
                        temp.next = new ListNode(Integer.parseInt(numberStr.trim()));
                        temp = temp.next;
                    }
                }
            }
        }
        return head;
    }

    private static int getNumber(ListNode head) {
        int num = 0;
        int size = 0;
        ListNode node = head;
        while (node != null) {
            num += (node.val * (Math.pow(10, size++)));
            node = node.next;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.print("输入:");
        Scanner scanner = new Scanner(System.in);
        String content = scanner.nextLine();
        if (!"".equals(content.trim())) {
            String[] nargs = content.split("\\+");
            if (nargs.length == 2) {
                ListNode head1 = createList(nargs[0]);
                ListNode head2 = createList(nargs[1]);
                ListNode head = addTwoNumbers(head1, head2);
                ListNode node = head;
                while (node != null) {
                    boolean isOver = node.val / 10 != 0;
                    if (isOver) {
                        node.val = node.val % 10;
                        if (node.next == null) {
                            node.next = new ListNode(1);
                        } else {
                            node.next.val += 1;
                        }
                    }
                    node = node.next;
                }
                System.out.println("");
                System.out.print("输出:");
                System.out.print(head.val);
                ListNode l3 = head.next;
                while (l3 != null) {
                    System.out.print(" -> ");
                    System.out.print(l3.val);
                    l3 = l3.next;
                }
                System.out.println("");
                System.out.print("原因:");
                System.out.print(getNumber(head1) + " + " + getNumber(head2) + " = " + getNumber(head));
            }
        }
    }
}
