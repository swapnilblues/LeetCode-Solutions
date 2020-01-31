import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

   public static void main(String[] args) {
       ListNode listNode = new ListNode(1);
       listNode.next = new ListNode(2);
       listNode.next.next = new ListNode(3);
       listNode.next.next.next = new ListNode(4);
       listNode.next.next.next.next = new ListNode(5);
       listNode.next.next.next.next.next = null;
       Solution solution = new Solution();
       ListNode l = solution.removeNthFromEnd(listNode,2);
       System.out.println(l.toString());
   }

}