class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class node {
    static ListNode ins(ListNode h,int val,int pos){
        ListNode ne=new ListNode(val);
        if(pos==1)
        {
           ne.next=h;
           return ne;
        }
        ListNode t=h;
        for(int i=1;i<pos-1&&t!=null;i++)
            t=t.next;
        if(t==null) {
            System.out.println("Invalid");
            return h;
        }
        ne.next=t.next;
        t.next=ne;
        return h;
    }
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
        //ListNode h=n;
        n=ins(n,34,3);
//        while(n!=null){
//            System.out.println(n.val+" ");
//            n=n.next;
//        }
        n=del(n,2);
        while(n!=null){
            System.out.println(n.val+" ");
            n=n.next;
        }
    }
}
