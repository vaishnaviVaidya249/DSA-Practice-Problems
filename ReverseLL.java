//Brute force approach to reverse a linkedlist using stack
//space complexity is o(n) as it stores the elements into the stack
//time complexity is o(2n) as it has 2 while loops iterating over the size of linkedlist.

//import java.util.*;

public class ReverseLL {
    Node head;
    class Node{
    
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        
    }

    
    
}

   public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;

    }

    Node currNode=head;
    while(currNode.next!=null){
        currNode=currNode.next;
    }
    currNode.next=newNode;

   }

   public void printLL(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.print("NULL");
    


   }

   public Node reverse(Node head){
    if(head==null || head.next==null) 
        return head;
    Node newHead=reverse(head.next);
    Node front=head.next;
    front.next=head;
    head.next=null;
    return newHead;
    //APPROCH-3(Rcursion) (time complexity is o(n) and space complexity is o(n))




    //-------------------------------------------------------------------------------------------
    //APPROCH-2(Iteration) (time complexity is o(n) and space complexity is o(1))
    // Node temp=head;
    // Node prev=null;

    // while(temp!=null){//time complexity is o(n) and space complexity is o(1)
    //     Node front=temp.next;
    //     temp.next=prev;
    //     prev=temp;
    //     temp=front;
    // }
    // head=prev;
    // System.out.print(head.data);

    //--------------------------------------------------------------------------------------------

    //APPROCH-1 (time complexity is o(2n) and space complexity is o(n))
    // Node currNode=head;
    // Stack<Integer> s=new Stack<>();
    // while(currNode!=null){
    //     s.add(currNode.data);
    //     currNode=currNode.next;
        
    // }
    
       
    //     Node temp=head;
    //     while(temp!=null && s.size()!=0){
    //         int r=s.pop();
    //         temp.data=r;  
    //         temp=temp.next;      
    //     }


    
    //System.out.println(s);

   }
    public static void main(String[] args){
        ReverseLL l=new ReverseLL();
        int[] a={};
        for(int i=0;i<a.length;i++){
            l.addLast(a[i]);
        }
        l.printLL();
        System.out.println();
    
        l.head=l.reverse(l.head);
        //System.out.println();
        l.printLL();

        
    


        // Stack<Integer> s=new Stack<>();
        // LinkedList<Integer> ll=new LinkedList<>();
        // ll.add(1);
        // ll.add(3);
        // ll.add(2);
        // ll.add(5);
        // System.out.println(ll);
        // for(int i=0;i<ll.size();i++){
        //     s.add(ll.get(i));
        // }
        // System.out.println(s);
        // int i=0;
        // while(s.size()!=0){
        //     int r=s.pop();
            
        //     ll.set(i,r);
        //     i++;

        // }
        // System.out.println(ll);
        


        

    }
    
}
