// public class QueueUsingArray {
//     static class Queue{
//     int size;
//     int arr[];
//     int rear=-1;
    

//     Queue(int size){
//         this.size=size;
//         arr=new int[size];

//     }


//     public boolean isEmpty(){
//         return rear==-1;
//     }

//     public void add(int data){
//         if(rear==(size-1)){
//             return;

//         }
//         rear++;
//         arr[rear]=data;

//     }
//     public int remove(){
//         if(isEmpty()){
//             return -1;
//         }
//         //int front=arr[0];
//         for(int i=0;i<rear;i++){
//             arr[i]=arr[i+1];

//         }
//         rear--;
//         return arr[0];
//     }
//     public int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         return arr[0];
//     }
// }
//     public static void main(String[] args){
//         int n=4;
//         Queue q=new Queue(4);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while(!q.isEmpty()){
//             System.out.print(q.peek()+" ");
//             q.remove();
//         }


        
       

//     }
    
// }



import java.util.*;
public class QueueY{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
       // Queue<Integer> q=new ArrayDeque<>();
        //here ll class provides implementtion of queue interface
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
                     System.out.print(q.peek()+" ");
                         q.remove();
                     }
    }
}