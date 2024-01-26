public class CircularQueueUsingArray {
    static class Queue{
        int[] arr;
        int size;
        int rear=-1;
        int front=-1;

        Queue(int size){
            this.size=size;
            arr=new int[size];
    
        }
        public boolean isEmpty(){ 
            return rear==-1 && front==-1;
            
        }
        public void add(int data){
            if((rear+1)%size==front){
                System.out.println("queue is full");
                return;
    
            }
            if(front==-1)
                front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
    
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
           
        }


        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }

        
    }
    public static void main(String[] args) {
        int n=5;
       
       Queue q=new Queue(n);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);


        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    
}
