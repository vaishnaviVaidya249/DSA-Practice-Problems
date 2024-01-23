import java.util.Stack;



public class PushAtBottomOfStack {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);


    }

    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        
        reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }

    }
    
}
