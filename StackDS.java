public class StackDS {
    private static class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            link = null;
        }
    }

    static class Stack {
        public static Node start = null;
        public static void push(int info) {
            Node newNode = new Node(info);

            if(start == null) {
            	start = newNode;
                return;
            }
            newNode.link = start;
            start = newNode;
        }

        public static boolean isEmpty() {
            return start == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = start;
            start = start.link;
            return top.info;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            Node top = start;
            return top.info;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}