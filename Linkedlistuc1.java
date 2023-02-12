package Day14;

public class Linkedlistuc1 {


        private class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;

        public Linkedlistuc1() {
            this.head = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public static void main(String[] args) {
            Linkedlistuc1 linkedListuc1 = new Linkedlistuc1();
            linkedListuc1.add(56);
            linkedListuc1.add(30);
            linkedListuc1.add(70);
            linkedListuc1.printList();
        }
    }


