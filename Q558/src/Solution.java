class Solution {
    public Node intersect(Node quadTree1, Node quadTree2) {

        if(quadTree1.isLeaf) {
            return quadTree1.val ? quadTree1 : quadTree2;
        }
        if(quadTree2.isLeaf) {
            return quadTree2.val ? quadTree2:quadTree1;
        }

        Node root = new Node();

        Node topLeft = intersect(quadTree1.topLeft,quadTree2.topLeft);
        Node topRight = intersect(quadTree1.topRight,quadTree2.topRight);
        Node bottomLeft = intersect(quadTree1.bottomLeft,quadTree2.bottomLeft);
        Node bottomRight = intersect(quadTree1.bottomRight,quadTree2.bottomRight);

        if(topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf) {
            if(topLeft.val && topRight.val && bottomLeft.val && bottomRight.val) {
                root.isLeaf = true;
                root.val = true;
                return root;
            }else if(!topLeft.val && !topRight.val && !bottomLeft.val && !bottomRight.val) {
                root.isLeaf = true;
                root.val = false;
                return root;
            }
        }
        root.topLeft = topLeft;
        root.topRight = topRight;
        root.bottomLeft = bottomLeft;
        root.bottomRight = bottomRight;

        return root;

    }
}