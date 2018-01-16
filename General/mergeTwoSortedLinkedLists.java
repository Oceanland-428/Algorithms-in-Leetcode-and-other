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
  public ListNode merge(ListNode head1, ListNode head2) {
    if (head1 == null) return head2;
    if (head2 == null) return head1;
    
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    
    while (head1 != null && head2 != null) {
      if (head1.value < head2.value) {
        cur.next = head1;
        head1 = head1.next;
      } else {
        cur.next = head2;
        head2 = head2.next;
      }
      cur = cur.next;
    }
    if (head1 != null) cur.next = head1;
    if (head2 != null) cur.next = head2;
    return dummy.next;
  }
}
