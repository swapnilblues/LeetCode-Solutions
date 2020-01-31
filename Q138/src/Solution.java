import java.util.HashMap;

public class Solution {
    public Node copyRandomList(Node head) {

        Node node = head;
        HashMap<Node, Node> nodes = new HashMap<>();

        while (node != null) {
            nodes.put(node, new Node(node.val));
            node = node.next;
        }
        node = head;
        while (node != null) {
            nodes.get(node).next = nodes.get(node.next);
            nodes.get(node).random = nodes.get(node.random);
            node = node.next;
        }
        return head;
    }
}
