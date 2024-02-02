public class SubtreeOfAnotherTree {
    
        public static boolean isSubtree(TreeNode T, TreeNode S) {

            if(T == null && S == null) return true;
            if(T == null || S == null) return false;
            if(T.val.equals(S.val)){
                if(isSubtree(T.left,S.left) && isSubtree(T.right,S.right))
                    return true;
            }
            return isSubtree(T.left,S) || isSubtree(T.right,S);
            
        }
        
    
    
}
