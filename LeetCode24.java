/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers
        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;

        // Update the new head
        head = next;

        while (next != null) {
            // Perform the swap
            current.next = next.next;
            next.next = current;
            if (prev != null) {
                prev.next = next;
            }

            // Move to the next pair
            prev = current;
            current = current.next;

            if (current != null) {
                next = current.next;
            } else {
                next = null;
            }
        }

        return head;
    }

    // Helper method to print the linked list for testing
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        System.out.println("Original list:");
        printList(head);

        LeetCode24 LeetCode24 = new LeetCode24();
        ListNode swapped = LeetCode24.swapPairs(head);

        System.out.println("List after swapping pairs:");
        printList(swapped);
    }
}
