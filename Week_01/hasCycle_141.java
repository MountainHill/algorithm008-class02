package week01;

import java.time.Year;
import java.util.HashMap;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

public class hasCycle_141 {
    //    public boolean hasCycle(ListNode head) {
//        HashMap<ListNode, Integer> map = new HashMap<>();
//        while (head != null) {
//            if (map.containsKey(head)) return true;
//            map.put(head, 1);
//            head = head.next;
//        }
//        return false;
//    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
                if (fast == slow) return true;
            }
        }
        return false;
    }
}
