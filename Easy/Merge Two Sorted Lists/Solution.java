// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the head of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse through both lists and merge them
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next; // Move to the next node in list1
            } else {
                current.next = list2;
                list2 = list2.next; // Move to the next node in list2
            }
            current = current.next; // Move the current pointer to the last node
        }

        // If any nodes are left in either list, append them
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // Return the merged list, starting from the node after dummy
        return dummy.next;
    }

    // Helper method to print the list (for testing)
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to run the test cases
    public static void main(String[] args) {
        // Creating test case 1
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List 1: ");
        printList(mergedList);

        // Creating test case 2
        list1 = null;
        list2 = null;

        mergedList = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List 2: ");
        printList(mergedList);

        // Creating test case 3
        list1 = null;
        list2 = new ListNode(0);

        mergedList = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List 3: ");
        printList(mergedList);
    }
}
