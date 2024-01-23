public class LinkedList2 { 
      
    Node head;
    int size;
    LinkedList2(){
        this.size=-1;
    }

    class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
 }

    // public void addFirst(int data){
        
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=newNode;
    //         //size++;
    //     }
        
    //     Node currNode=head;
        
    //     while(currNode.next!=null){
    //         currNode=currNode.next;
    //     }
    //     currNode.next=newNode;
    //    // size++;

    // }

    // public void addFirst(int data){
        
    //     Node newNode=new Node(data);
    //     if(head==null){
    //         head=newNode;
    //         return;

    //     }

    
    //     newNode.next=head;
    //     head=newNode;
    // }

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

    public void printLL2(){

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

    public void findEle(int value){
        if(head==null){
            System.out.println("value not found!");
            return;
        }
        int index=-1;
        Node currNode=head;
    
        while(currNode!=null){
            index++;
            if(currNode.data==value){
                System.out.println("The value "+value+" is present at index "+(index));
                return;
            }
            currNode=currNode.next;
        }



    }

    public void delete(int data){
        if(head==null){
            System.out.println("no elements to delete");
            return;
        }
    
        Node currNode=head;
        while(currNode!=null){
            if(currNode.data>=data){
                currNode.next=null;
                break;

            }
            currNode=currNode.next;
        }


    }

    

    
    public static void main(String[] args){  
        LinkedList2 ll2=new LinkedList2();
        int[] a={1,5,7,3,8,2,3};
        for(int i=1;i<=50;i++){
            ll2.addLast(i);
        }
        
        ll2.printLL2();
        ll2.findEle(7);
        ll2.delete(25);
        ll2.printLL2();


    }
    
}


// public class Solution {
//     public static Node constructLL(int []arr) {
//         // Write your code here
//         Node head=new Node(arr[0]);
//         Node currNode=head;
    
//         for(int i=1;i<arr.length;i++){
//             Node newNode=new Node(arr[i]);
//             currNode.next=newNode;
//             currNode=newNode;
//         }
//         return head;
           
           
//     }
// }
