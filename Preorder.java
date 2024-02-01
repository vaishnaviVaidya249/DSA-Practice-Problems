import java.util.*;


class Preorder{
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

        public static void  preOrderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);



        


    }

    public static void  InOrderTraversal(Node root){
        if(root==null){
            return;
        }
      
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);



    


}
public static void  PostOrderTraversal(Node root){
    if(root==null){
        return;
    }
  
    PostOrderTraversal(root.left);
    
    PostOrderTraversal(root.right);
    System.out.print(root.data+" ");
   }



public static void levelOrder(Node root){
    if(root==null){
        return;
    }
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
        Node currNode=q.remove();
        if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }

        }else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
    }
    
}

public static int countOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftNodes=countOfNodes(root.left);
    int rightNodes=countOfNodes(root.right);

    return leftNodes+rightNodes+1;

}
public static int sumOfNodes(Node root){
    if(root==null){
        return 0;
    }
    int leftSum=sumOfNodes(root.left);
    int rightSum=sumOfNodes(root.right);

    return leftSum+rightSum+root.data;

}
public static int heightOfTree(Node root){
    if(root==null){
        return 0;
    }
    int leftHeight=heightOfTree(root.left);
    int rightHeight=heightOfTree(root.right);
    int max_height=Math.max(leftHeight,rightHeight);

    return max_height+1;

}

public static int diameter(Node root){
    if(root==null){
        return 0;
    }

    int diam1=diameter(root.left);
    int diam2=diameter(root.right);
    int diam3=heightOfTree(root.left)+heightOfTree(root.right)+1;

    return Math.max(diam3,Math.max(diam1,diam2));
}
static class TreeNode{
    int diam;
    int h;

    TreeNode(int diam,int h){
        this.diam=diam;
        this.h=h;
    }
}

public static TreeNode  diameter2(Node root){
    if(root==null){
        return new TreeNode(0,0);


    }

    TreeNode left=diameter2(root.left);
    TreeNode right=diameter2(root.right);

    int myHeight=Math.max(left.h,right.h)+1;



    int diam1=left.diam;
    int diam2=right.diam;
    int diam3=left.h+right.h+1;

    int myDiam=Math.max(Math.max(diam1,diam2),diam3);
TreeNode tn=new TreeNode(myDiam,myHeight);
    return tn;


}



    public static void main(String[] args) {
        int[] a={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree b=new Binarytree();
        Node root= b.buildTree(a);
       
        preOrderTraversal(root);
        System.out.println();
        InOrderTraversal(root);
        System.out.println();
        PostOrderTraversal(root);
        System.out.println("----");
        levelOrder(root);
        System.out.println("count of nodes is "+countOfNodes(root));
        System.out.println("Sum of nodes is "+sumOfNodes(root));
        System.out.println("heightoftree is "+heightOfTree(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
        
    }
}