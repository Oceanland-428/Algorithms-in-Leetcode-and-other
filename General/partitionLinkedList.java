/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode partition(ListNode head, int target) {
    if (head == null) return head;
    ListNode small = new ListNode(0);
    ListNode large = new ListNode(0);
    ListNode curS = small;
    ListNode curL = large;
    while (head != null) {
      if (head.value >= target) {
        curL.next = head;
        curL = curL.next;
      } else {
        curS.next = head;
        curS = curS.next;
      }
      head = head.next;
    }
    curS.next = large.next;
    curL.next = null;
    return small.next;
  }
}
