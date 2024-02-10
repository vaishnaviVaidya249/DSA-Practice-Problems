public class BST {

    static class Node{//time complexity:o(H)=>order of height of the tree as we are checking the tree from root on where to add the the new node.
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node buildBst(Node root, int val){
        if(root==null){
            Node node=new Node(val);
            root=node;
            return root;
        }

        if(root.data>val){
            root.left=buildBst(root.left,val);

        }else{
            root.right=buildBst(root.right,val);
        }

        return root;

        

    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean searchNode(Node root,int key){
        if(root==null){
            return false;
        }
       

        if(key<root.data){
            return searchNode(root.left,key);

        } else if(key==root.data){
              return true;

        }else{
            return searchNode(root.right,key);
        }
        //return false;
    }
    public static void main(String[] args){
        int[] arr={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=buildBst(root,arr[i]);
        }
        int key=6;
        boolean res=searchNode(root,key);
        System.out.println(res);
        inOrder(root);
        

    }
    
}
