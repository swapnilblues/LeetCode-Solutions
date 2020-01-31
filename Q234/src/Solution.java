class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        f = head;
        s = reverseLinkList(null, s);

        while (s != null) {
            if (f.val != s.val) {
                return false;
            }
            f = f.next;
            s = s.next;
        }
        return true;
    }

    private ListNode reverseLinkList(ListNode prev, ListNode head) {

        if (head == null) {
            return prev;
        }

        ListNode successive = head.next;
        head.next = prev;
        return reverseLinkList(head, successive);
    }

}