public class nodecount {
    static ListNode del(ListNode h,int pos){
        if(pos==1){
            h=h.next;
            return h;
        }
        ListNode t=h;
        for(int i=1;i<pos-1&&t.next!=null;i++){
            t=t.next;
        }
        if(t.next==null){
            System.out.println("not del");
            return h;
        }
        t.next=t.next.next;
        return h;
    }
    public static void main(String[] args){
        ListNode n=new ListNode(10);
        n.next=new ListNode(20);
        n.next.next=new ListNode(30);
        ListNode te=n;
        int c=0;
        while(te!=null){
            c++;
            te=te.next;
        }
        System.out.println(c);
        int y=c-2+1;
        n=del(n,y);
        while(n!=null){
            System.out.println(n.val+" ");
            n=n.next;
        }
    }
}
