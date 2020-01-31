import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
//        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(1);
        listNode.next.next.next.next.next = null;
        Solution solution = new Solution();
        boolean b = solution.isPalindrome(listNode);
        System.out.println(b);
    }

}