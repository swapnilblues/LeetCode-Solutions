class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode successor = head.next;
            head.next = prev;
            prev = head;
            head = successor;
        }
        return prev;
//        return reverseListRecursiveHelp(null, head);
    }

    private ListNode reverseListRecursiveHelp(ListNode prev, ListNode curr) {

        if (curr == null) {
            return prev;
        }

        ListNode successor = curr.next;
        curr.next = prev;
        return reverseListRecursiveHelp(curr, successor);
    }
}