//  Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    @Override
    public String toString() {
        ListNode copy = this;
        String s = "";
        while (copy != null) {
            s += copy.val + " ";
            copy = copy.next;
        }
        return s;

    }
}
