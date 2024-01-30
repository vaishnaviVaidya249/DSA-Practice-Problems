public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    static class Binarytree{
        static int i=-1;
        public Node buildTree(int[] nodes){
            i++;
            if(nodes[i]==-1)
                return null;
            
            Node newNode=new Node(nodes[i]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;



        }
    }
    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree b=new Binarytree();
        Node root= b.buildTree(a);
        System.out.println(root.data);

        
    }
    
}
