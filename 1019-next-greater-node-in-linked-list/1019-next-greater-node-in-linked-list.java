/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        if(head == null) return new int[]{};
        ListNode cur = head;
        int l = 0;
        while(cur != null){
            l++;
            cur = cur.next;
        } 
        int temp[] = new int[l];
        int idx = 0; 
        cur = head;
        while(cur != null){
            temp[idx++] = cur.val;
            cur = cur.next;
        } 
        int n = 0;
      for(int i = 0; i < l; i++) {
            int max = 0; 
            for(int j = i + 1; j < l; j++) { 
                if(temp[j] > temp[i]) { 
                    max = temp[j]; 
                    break; 
                }
            }
            temp[i] = max; 
        }
         return temp;
     }
}