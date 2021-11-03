import java.util.List;
import java.util.TreeMap;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode head = root;
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        root.next = node2;
        root = root.next;
        root.next = node3;

        printNode(head);
//        deleteNode(node2);
        node2 = node2.next;
        System.out.println(node2);
    }

    private static void deleteNode(ListNode node){
        node = node.next;
    }

    private static void printNode(ListNode head){
        ListNode tmp = head;
        while(tmp!=null){
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }


}


class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
