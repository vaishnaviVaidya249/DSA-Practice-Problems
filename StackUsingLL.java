public class StackUsingLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;

        }
    }
    public boolean isEmpty(){
        return head==null
;    }

    public int push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return head.data;


        }
        newNode.next=head;
        head=newNode;
        return head.data;
        

    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;

    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        
        return head.data;
    }
    public static void main(String[] args){
        StackUsingLL s=new StackUsingLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();

        }

    }
    
}
