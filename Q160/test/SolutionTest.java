import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static void main(String[] args) {


        Node intersect = new Node(8);
        intersect.next = new Node(4);
        intersect.next.next = new Node(5);

        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = intersect;

        Node headB = new Node(5);
        headB.next = new Node(0);
        headB.next.next = new Node(1);
        headB.next.next.next = intersect;

//        System.out.println(headA.toString());
//        System.out.println(headB.toString());

        Solution solution = new Solution();
        Node n = solution.getIntersectionNode(headA,headB);

        System.out.println(n.val);
    }

}