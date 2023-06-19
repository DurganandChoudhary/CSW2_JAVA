class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            // If we reach the end of a list, move to the head of the other list
            if (pA == null) {
                pA = headB;
            } else {
                pA = pA.next;
            }

            if (pB == null) {
                pB = headA;
            } else {
                pB = pB.next;
            }
        }

        // Return the intersection node or null if there's no intersection
        return pA;
    }

    public static void main(String[] args) {
        // Create two linked lists
        ListNode commonNode = new ListNode(6);
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = commonNode;

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = commonNode;

        LinkedListIntersection solution = new LinkedListIntersection();
        ListNode intersectionNode = solution.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection found at node with value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
