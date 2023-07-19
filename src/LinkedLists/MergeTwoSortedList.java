package LinkedLists;

import jdk.nashorn.internal.objects.NativeObject;
import org.w3c.dom.NodeList;

public class MergeTwoSortedList{
    public static void main(String[] args) {
        ListNode l=new ListNode(10,null);
        l.next=new ListNode(20,null);
        l.next.next=new ListNode(30);
        dislplay(l);
        ListNode m=new ListNode(15,null);
        m.next=new ListNode(40,null);
        m.next.next=new ListNode(60);
        dislplay(m);
        ListNode t=mergeTwoLists(l,m);
        System.out.println("merged list");
        dislplay(t);
    }
    public static void dislplay(ListNode n)
    {
        ListNode x=n;
        while(x!=null)
        {
            System.out.println(x.val);
            x=x.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null)
            return list2;
        if (list2==null)
            return list1;
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode head=new ListNode();
        if(l1.val<l2.val)
        {
            head.val=l1.val;
            l1=l1.next;
        }
        else {

            head.val=l2.val;
            l2=l2.next;
        }
        ListNode temp=head;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                temp.next=new ListNode(l1.val);
                l1=l1.next;
                temp=temp.next;
            }
            else
            {
                temp.next=new ListNode(l2.val);
                temp=temp.next;
                l2=l2.next;
            }
        }
        while (l1!=null)
        {
            temp.next=new ListNode(l1.val);
            l1=l1.next;
            temp=temp.next;
        }
        while (l2!=null)
        {
            temp.next=new ListNode(l2.val);
            l2=l2.next;
            temp=temp.next;
        }
return head;

    }
}
