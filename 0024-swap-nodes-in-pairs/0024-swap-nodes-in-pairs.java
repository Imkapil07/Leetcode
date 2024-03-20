class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }

        int[] arr = new int[count];
        int n = arr.length;
        int i = 0;
        cur = head;
        while (cur != null) {
            arr[i++] = cur.val;
            cur = cur.next;
        }

        for (int j = 0; j < n - 1; j += 2) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int j = 0; j < n; j++) {
            temp.next = new ListNode(arr[j]);
            temp = temp.next;
        }
        return dummy.next;
    }
}
