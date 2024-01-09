public class LinkedList1 {
    Node head;
    private int size;

    LinkedList1(){
        this.size=0;

    }

    
    class Node{ 
        //here in java we represent the node as class 
        //in java that will store the data and next
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }

    }

    //add-first,last
    public void addFirst(String data){
        
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
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

    //print
    public void printList(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast=head;
        Node lastNode=head.next;//head.next=null -> lastNode
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        LinkedList1 ll=new LinkedList1();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.printList();

        ll.addLast("last");
        ll.printList();

        ll.deleteFirst();
        ll.printList();

        ll.deleteLast();
        ll.printList();

        System.out.println(ll.getSize());
        ll.addFirst("b");
        System.out.println(ll.getSize());


    }
    
}
