public class ListNode {
    int val;
    app.ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, app.ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public app.ListNode reverseList(app.ListNode head) {
        app.ListNode n = head;
        app.ListNode t = null;
        app.ListNode p = null;
        while(n != null){
            t = n.next;
            n.next = p;
            p = n;
            n = t;
        }
        return p;
    }

    public static void main(String[] args) {
        app.Solution s = new app.Solution();
        System.out.println(s.reverseList(new app.ListNode()));
    }
}