public class Solution {
    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null)
            return null;
        Node copyA = headA, copyB = headB;
        int lA = 0, lB = 0;
        while(copyA != null) {
            copyA = copyA.next;
            ++lA;
        }
        while(copyB != null) {
            copyB = copyB.next;
            ++lB;
        }
        int diff = lA>lB? (lA - lB): (lB-lA);
        if(lA > lB) {
            while(diff != 0) {
                headA = headA.next;
                --diff;
            }
        }
        else {
            while(diff != 0) {
                headB = headB.next;
                --diff;
            }
        }
        while(headA != null) {
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}